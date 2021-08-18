package chap05.section3

fun main() {
    retFunc( )
}

inline fun inlineLambda(a : Int, b : Int, out : (Int, Int) -> Unit){
    out(a , b)
}

fun retFunc( ){  // 일반 익명함수는 비지역 반환이 일어나지 않는다.
    println("Start of Func")
    inlineLambda( 13, 3, fun (a, b) {
        val result = a + b
        if (result > 10) return
        println("result : $result")
    })  // inlineLambda( ) 함수의 끝
    println("end of Func")

}