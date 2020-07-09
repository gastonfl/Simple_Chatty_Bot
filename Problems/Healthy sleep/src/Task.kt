import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val h = scanner.nextInt()

    if (h in a..b){
        println("Normal")
    }else if(h < a){
        println("Deficiency")
    }else if(h > b)
    {
        println("Excess")

    }
}