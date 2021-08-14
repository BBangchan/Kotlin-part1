package chap02.section3

fun main() {
    var test : Number = 12.2  // test가 float형으로 스마트 캐스트
    println("$test")

    test = 12  // test가 int형으로 스마트 캐스트
    println("$test")

    test  = 120L // test가 Long형으로
    println("$test")

    test += 12.0f // Float형으로
    println("$test")
}