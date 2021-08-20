package chap06.section3

import java.io.File

fun makeDir(path: String) : File{
    val result = File(path)
    result.mkdirs()
    return result
}
fun main() {

}