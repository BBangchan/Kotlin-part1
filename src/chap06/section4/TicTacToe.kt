package chap06.section4 

var x: Int = 0  // x와 y를 전역변수로 선언
var y: Int = 0

fun main() {
    var board = Array(3,{CharArray(3)})  //___(1) 3 x 3의 Array 배열 정의___
    initBoard(board)  // initBoard 함수 호출

    val names = arrayOf("Player 1", "Player 2")  // name을 배열로 선언 인자로는 Player1, Player2
    val marks = arrayOf('O', 'X')  // marks를 배열로 선언 인자로는 O , X

    play(board, names, marks)  // play 함수 호출

}

 // 게임에 사용되는 Board를 공백으로 초기화
fun initBoard(board: Array<CharArray>) {   
    for (i in 0 until 3){
        for (j in 0 until 3){  // 3X3 배열을 공백으로 채우는 문장
            board[i][j] = ' '
        }
    }
    //___(2) 반복문을 이용해 3 x 3 배열을 공백(' ')으로 채우기___
}


fun printBoard(board: Array<CharArray>) {
    // 가로 줄번호
    print("  ")   // 가로줄에 0 1 2 출력
    for (x in 0..2) print("$x ")
    println()

    // 세로 줄번호 및 플레이어 표기
    for (y in 0..2) {   // 세로줄에 0 1 2 출력
        print("$y ")
        for (x in 0..2) {
            print("${board[y][x]}")
            if (x != 2) print("|")
        }
        println()
        print(" ")
        // 세로 격자
        if (y != 2) {
            print("  ")
            for (x in 0..2) {
                print("-")
                if (x != 2) print("+")
            }
            println()
        }
    }
}

// 격자 범위에 있는지 검사
val isInRange = {x: Int, y: Int -> x in 0..2 && y in 0..2}//___(3) x와 y가 격자 범위에 있는지 판별 (람다식 이용)___
 // x 와 y는 무조건 0~2 사이에 있어야 하므로 논리연산자 and를 써서 두조건이 충족한다는 것을 표현

// 격자의 칸이 빈 곳인지 검사
fun isValid(board: Array<CharArray>, x: Int, y: Int): Boolean {
    return isInRange(x, y) && board[y][x] == ' '
    // 범위안에있고, board안에 있는데 빈칸인지 검사.
}

fun playerInput(name: String, board: Array<CharArray>): Boolean {
    print("$name 입력(줄,칸): ")   // 게임을 시작하고  줄과 칸 입력
    val input = readLine()!!.split(',')   // null값이 절대 들어오면 안되는 경우에 사용
    //___(4) 입력 받은 값을 split( )함수를 이용해 x와 y로 분리 저장___
    y =  input[0].toInt() // __________
    x =  input[1].toInt()//__________
    if (!isValid(board, x, y)) return false // 범위에 없으면 false 있으면 true를 반환
    return true
}

// 승리조건 함수
fun winOver(board: Array<CharArray>, x: Int, y: Int): Boolean {
    var dx = arrayOf(-1, 1, 0, 0, -1, 1, -1, 1)
    var dy = arrayOf(0, 0, 1, -1, -1, 1, 1, -1)

    var count = 1

    for (d in 1..2) {
        for (index in 0..7) {
            var cx = x + dx[index] * d
            var cy = y + dy[index] * d

            if (!isInRange(cx,cy))
                continue
            if (board[cy][cx] == board[y][x])
                count++
        }
    }
    if (count == 3) return true
    return false
}
// 플레이 진행하기
fun play(board: Array<CharArray>, name: Array<String>, marks: Array<Char>) {

    var round = 0
    var turn = 0

    while (true) {
        println("\n ${turn + 1}번째 턴\n")
        printBoard(board)
        if (!playerInput(name[turn], board))
            continue
        board[y][x] = marks[turn]
        round++
        if(winOver(board,x,y)){
            printBoard(board)
            println("${name[turn]} 승리!")
            break
        }
        if(round == 9){
            printBoard(board)
            println("무승부 입니다.")
            break
        }
        // ___(5) 승리 혹은 무승부 조건을 검사, 이 두 조건은 while루프를 끝낸다___

        turn = if(turn ==1) 0 else 1//___(6) turn이 0이며 1로, 1이면 0으로 바꿔서 플레이어 판단___
    }

}