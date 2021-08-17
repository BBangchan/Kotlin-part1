package chap04.section5

var global = 10  // 전역변수로 모든 곳에서 존재

fun main() {
    fun localFunc1(){ // 지역함수는 반드시 선언이 된 후에 사용할 수 있다.
        println("localFunc1")
    }
    localFunc1( )
    global = 15
    var local1 = 15 // Local변수로 main에서만 존재
    println("global : $global")
    userFunc( )
    println("final - global : $global, local1 : $local1")
}

fun userFunc( ){
    global = 20
    var local1 = 20 // Local변수로 main에서만 존재
    println("userFunc - global: $global, local1 : $local1")
}