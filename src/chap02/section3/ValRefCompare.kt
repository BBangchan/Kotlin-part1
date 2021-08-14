package chap02.section3

fun main() {
    val a : Int = 128 //기본형
    val b = a
    val c : Int? = a
    val d : Int? = a
    val e : Int? = c

    println(c == d)
    println(c === d)
    println(c === e)
}