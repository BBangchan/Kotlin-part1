package chap05.section1

fun main() {
    val a = 7
    val b = 7

    // 블록과 함께 사용
    val max = if (a > b) {
        println("a 선택")
        a  // max에 a 값 저장
    }
    else if ( a == b){
        println(" 똑같다 ")
        a
    }
    else {
        println("b 선택")
        b // max에 b 값  저장
    }
    println(max)
}