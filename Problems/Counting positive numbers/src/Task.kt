import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val secuence = scanner.nextInt()
    var resultado = 0
    repeat(secuence){
        val num = scanner.nextInt()
        if(num > 0){
            resultado++
        }
    }
    println(resultado)
}