package chap04.section3

inline fun shortFunc(a: Int, crossinline out: (Int) -> Unit ){  // 이러한 비 지역반환이 발생하지 않기 위해서는 crossinline을 사용해야한다.
    println("Hello")
    out(a)  // crossinline을 사용하면 out 내부에서 return을 사용하지 못하게 한다.
    println("Goodbye")
}

fun main() {
    shortFunc(3) {
        println("a: $it")
        //return  // 리턴을 사용하면 비지역반환이므로 Goodbye가 출력이 되지않는다.
    }  // 람다식의 인자가 하나면 it으로 대체 가능
}