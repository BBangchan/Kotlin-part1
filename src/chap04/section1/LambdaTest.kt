package chap04.section1

fun main() {
    var result : Int
    var ans : String
    //val multi = { a: Int , b: Int -> a*b }   // 아래와 위는 같은 선언 방법
    val multi : (a : Int, b : Int) -> Int = { a , b ->  // 반환값이 없으면 Unit으로 써주어야 한다.
        println("a : $a,  b : $b")
        a * b
    }

    val nestedLambda : ( ) -> ( ) -> Unit = { { println("nestedLambda") } }
    ans = nestedLambda().toString()
    result = multi( 10, 20)
    //println(result)

}