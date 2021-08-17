package chap04.section2

fun main() {
    val result = callByValue(otherlambda) // 1.람다식 이름으로 호출
    println(result)  // result 출력

}

fun callByValue( b: ( ) -> Boolean) : Boolean { // 1.람다식 자체가 매개변수에 복사됨.
    println("callByValue function")
    return b() // 2.람다식 함수가 호출되 실행행
} //  4. b( )결과인 true 반환

val otherlambda : ( ) -> Boolean = {
    println("otherLambda function")
    true //  3. true를 반환
}

