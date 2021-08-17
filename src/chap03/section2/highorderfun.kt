package chap03.section2

fun highFunc( a : Int, b : Int, sum: (Int, Int) -> Int ): Int { //
   return sum(a, b) // sum 매개변수는 함수

}

fun main() { //고차함수  람
    val result =highFunc( 1, 3, ) {x, y ->
        x + y
    }  // 람다식을 마지막 인자로 넣으면 밖으로 뺄 수 있다.
    println(result)
}
