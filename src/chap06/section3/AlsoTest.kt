package chap06.section3

fun main() {
    data class Person(var name: String, var skills : String)
    var person = Person("kildong", "Kotlin")

    val a =person.let{
        it.skills = "Android"
        "Success" //마지막 문장을 결과로 반환
    }

    println(person)
    println("a : $a") //String

    val b = person.also {
        it.skills = "Java"
        "Success" //마지막 문장은 사용되지 않음.
    }
    println(person)
    println("b : $b") // person의 객체 b
}
