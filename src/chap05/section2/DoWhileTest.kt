package chap05.section2

fun main() {

    // 5 -> 12345, 23451, 34512, 45123... 12345
    do{
        println("Enter the number : ")
        val input = readLine( )!!.toInt() // !!단정기호 보다는 safe call을 사용하는게 좋은데 간단한 코드는 !! 단정기호를 이용해서 빠르게 실행해도 된다.
        for (i in 0 until input){ // until은 0에서 부터 input전까지를 의미한다.
            for(j in 0..(input - 1)){
                print((i+j)%input + 1) // println은 강제로 띄어쓰기가 발생하고 print는 띄어쓰기를 하지 않는다.
            }
            println( )
        }
    }while (input != 0)

}