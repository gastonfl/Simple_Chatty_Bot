import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a1 = scanner.nextInt()
    val a2 = scanner.nextInt()
    val a3 = scanner.nextInt()
    val a4 = scanner.nextInt()
    val a5 = scanner.nextInt()
    val range1 = a1..a2
    val range2 = a3..a4
    println(a5 in range1 && a5 in range2)
}