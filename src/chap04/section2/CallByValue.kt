package chap04.section2

fun main() {
    val result = callByValue(lambda()) // 1.람다식 함수의 즉시 실행
    println(result)  // result 출력
}

fun callByValue( b: Boolean) : Boolean {
    println("callByValue function")  // 3 . callByValue의 변수 b의 true 복사됨.
    return b //  4. b가 리턴되어  result가 된다.
}

val lambda: ( ) -> Boolean = { //
    println("lambda function")
    true  // 2. true를 다시 람다로 반환
}