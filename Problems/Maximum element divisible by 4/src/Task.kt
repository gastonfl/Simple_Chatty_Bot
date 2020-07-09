import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var resultado = 0
    val n = scanner.nextInt()
    repeat(n){
        val x = scanner.nextInt()
        if (x % 4 == 0 && x > resultado){
            resultado = x
        }
    }
    println(resultado)
}