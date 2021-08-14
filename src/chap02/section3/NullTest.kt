package chap02.section3

fun main() {
    var str1 : String
    str1 = "Hello"
    println("str1: $str1, length: ${str1.length}")

    var str2 : String? //타입에 ?를 사용함으로써 Null가능성을 본다.
    str2 = null
    //val len = if (str1 != null) str1.length else -1
    val len = str1?.length ?: -1 // 위에줄을 elvis 표현식으로 변경한 것이다.
    // str1?.length가 null이면 -1이된다.
    println("str2: $str2, length: $len")

}