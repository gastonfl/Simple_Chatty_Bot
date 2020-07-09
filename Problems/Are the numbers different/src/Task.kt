import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a1 = scanner.nextInt()
    val a2 = scanner.nextInt()
    val a3 = scanner.nextInt()
    if (a1 != a2 && a2 != a3 && a1 != a3){
println(true)
    }else{
        println(false)
    }
}