import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val edad = scanner.nextInt()
    println(edad in 18..59)
}