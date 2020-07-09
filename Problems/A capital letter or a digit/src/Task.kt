import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val caca = scanner.next().first()
    println(caca.isUpperCase() || caca.isDigit() && caca != '0' )
}