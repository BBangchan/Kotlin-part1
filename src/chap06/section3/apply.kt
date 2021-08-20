package chap06.section3

fun main() {
    data class  Person(var name : String, var skills : String)
    var person = Person("Kildong", "Kotlin")

    // 여기서 this는 person객체를 가리킴
    person.apply { this.skills = "Swift" }
    println(person)

    val retrunObj = person.apply {
       this.name = "Sean" // this는 생략할 수 있음.
        skills = "Java" // this 없이 객체의 멤버에 여러 번 접근
        "success"  // 사용되지 않음.
   }
    println(retrunObj)
    val retrunObj2 =person.run {
        this.name = "Dooly"
        this.skills = "C#"
        "success"
    }
    println(person)
    println("retrunObj2 : $retrunObj2")
}