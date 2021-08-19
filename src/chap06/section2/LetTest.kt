package chap06.section2

import chap04.section2.mul

/*
fun main() {
    val score: Int? = 32 // Null 가능한 Int 타입 설정
    // var score = null

    // 일반적인 null 검사
    fun checkScore( ) {
        if (score != null){
            println("Score : $score")
        }
    }

    // let을 사용해 null 검사를 제거
    fun checkScoreLet( ) { // it은 score의 내용물을 복사해서 사용한다.
        score?.let { println("Score : $it") } // score가 null이 아닐때만 null이하의 문장이 실행된다.
        val str = score.let { it.toString( ) } // it인 score는 정수형 타입이지만 string형태로 바꿔서 저장한다.
        println(str)
    }

    checkScore( )
    checkScoreLet( )
}*/
fun main() { // let 함수의 체이닝 (chaining)
    /*var x = "Kotlin!"
        x.let { outer -> 
            outer.let { inner ->
                print("Inner is $inner and outer is $outer")
                "Inner String" // 이것은 반환되지 않음.
            }
            "Outer String" //이 문자열은 반환되 x에 할당
        }
    "Outer String" //이 문자열은 반환되 x에 할당*/

}
