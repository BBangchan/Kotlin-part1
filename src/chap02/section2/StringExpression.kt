package chap02.section2

fun main() {
    var a = 1
    var str1 = "a = $a"
    var str2 = "a = ${a + 2}" //문자열에 표현식 사용

    println("str1: \"$str1\", str2: \"$str2\"")
    println(str1 is String)
    println(str2 is String)

}