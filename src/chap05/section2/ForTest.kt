package chap05.section2

fun main() {

    var total = 0
    //홀수 합
    for (num in 1..100 step 2) total += num // 홀수 합
    println("total : $total")

}