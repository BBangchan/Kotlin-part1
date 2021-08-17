package chap04.section4

fun main() {
    // 일반 표현법
    // val multi = 3.multiply(10)

    // 중위 표현법
    val num = 3
    //val str = num.strPlus("Kotlin")
    val str = num strPlus  "Kotlin"
    println(str)
}

// Int를 확장해서 multiply( ) 함수가 하나 더 추가되었음
infix fun Int.strPlus (x : String): String { // infix로 선언되므로 중위 함수
    return "$x version $this"
}