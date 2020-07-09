import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val dias = scanner.nextInt()
    val comida = scanner.nextInt()
    val pasaje = scanner.nextInt() * 2
    val noche = scanner.nextInt()

    val diascomida = dias * comida
    val noches = dias - 1
    val diasnoche = noches * noche
    val resultado = pasaje+ diascomida + diasnoche
    println(resultado)
}