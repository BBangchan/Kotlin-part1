package chap05.section1

fun main() {

    println("Enter the score: ")
    val  score = readLine()!!.toDouble()
    var grade : Char = 'F'

    //인수 없는 when의 사용
    when {
        score >=90.0 -> grade = 'A'
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score < 70.0 -> grade = 'F'
    }
    /*println("Enter the score: ")
    val  score = readLine()!!.toDouble()
    var grade : Char = 'F'

    when (score) {  // When에 인자가 있는 경우
        in 90.0..100.0 -> grade ='A'
        in 80.0..89.9 -> grade ='B'
        in 70.0..79.9 -> grade ='C'
        else -> grade ='F'
    }*/

    println("score : $score, grade: $grade")

}