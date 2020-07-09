import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val first = scanner.next().first().toLowerCase()
    val second = scanner.next().last().toLowerCase()
    println(first == second)
}