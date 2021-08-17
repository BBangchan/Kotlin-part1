package chap04.section2

fun main() {

    var result : Int
    result = highOrder({ x , y ->  x + y }, 10 , 20) // 사용
    println(result)

}
fun highOrder(sum : (Int, Int) -> Int, a: Int, b :Int) = sum(a, b)  //함수의 람다식으로 sum을 선언해서 return으로 sum을 호출해서 사용한다.
