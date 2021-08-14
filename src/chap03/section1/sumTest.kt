package chap03.section1

fun sum(a :Int, b :Int) : Int {
    return a + b
}
fun max(a : Int, b: Int): Int{
    return if (a > b) a else b
}
fun outfunc(name: String) : Unit { // Unit은 아무런 형태를 지정하지 않은 반환값. Unit 생략가능
    println("Name $name")
}

fun main() {
    val result1 = sum (2,3)

    val a = 3
    val b = 5

    val result2 = max(a, b)
    outfunc("bas")
    println(result1)
    println(result2)
}