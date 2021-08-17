package chap04.section2

//fun sum(a,:Int, b : Int ) : Int {
//    return  a + b
//} 위와 아래에 함수는 똑같다.
//fun sum (a : Int, b : Int) = a +b

//fun mul(a : Int , b: Int) : Int {
//    return a * b
//}
fun mul(a : Int, b : Int) = a * b

fun funcFunc(a : Int , b : Int) = sum(a,b)

fun main() {

    val result = sum(10, 10)
    val result2 = mul(sum(10, 5),10) //함수의 인자를 함수로 넘길 수도 있고
    val result3 = funcFunc(15, 30) // 함수 내부의 반환형태를 함수로 할 수도 있다.
    println(" result1 : $result, result2 : $result2, result3 : $result3")

}