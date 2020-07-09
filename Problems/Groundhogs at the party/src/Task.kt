import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val cups = scanner.nextInt()
    val weekend = scanner.nextBoolean()
    if (weekend){
        println(cups >= 15 && cups <= 25)
    }else{
        println(cups >= 10 && cups <= 20)
    }
}