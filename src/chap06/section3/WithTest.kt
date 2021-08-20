package chap06.section3

import kotlin.system.measureTimeMillis

fun main() {
    data class User(val name : String, var skills : String, var email : String? = null)

    val user =User("Kildong", "defalut")

    val result = with(user){ // user를 receiver로서 표현했다.
        this.skills = "Kotlin" // this는 user를 표현
        email = "kildong@example.com"       //user에 대한것을 반환하는게 아니라 with안에 있는 문장에 결과를 반환함.
        //"hello"          // 하지만 마지막식에 대한 반환이 없으면 Unit이 반환된다.
    }
    println(user)
    println("result: $result")
}
