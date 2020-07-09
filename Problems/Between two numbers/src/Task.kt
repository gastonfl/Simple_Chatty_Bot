import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a1 = scanner.nextInt()
    val a2 = scanner.nextInt()
    val a3 = scanner.nextInt()
    println(a1 in a2..a3)
}