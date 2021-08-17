package chap05.section1

fun main() {

    println("Enter the score: ")
    val  score = readLine()!!.toDouble()
    var grade : Char = 'F'

    if( score >= 90.0){
        grade = 'A'
    }
    else if (score >=80 && score <=89.9){  //비교 연산자와 논리 연산자의 복합
        grade = 'B'
    }
    else if (score in 70.0..79.9){ // 범위 연산자로 위에 비교 연산자와 논리 연산자 대신해서 편하게 사용이 가능하다.
        grade = 'C'
    }
    else if (score >=60 && score <=69.9){
        grade = 'D'
    }
    println("score : $score, grade: $grade")

}