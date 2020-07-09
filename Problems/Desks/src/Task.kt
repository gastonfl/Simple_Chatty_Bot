import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val al1 = scanner.nextInt()
    var a1 = 0
    var a2 = 0
    var a3 = 0
    if (al1 % 2 == 0){
         a1 = al1
    }else{
         a1 = al1 + 1
    }
    val al2 = scanner.nextInt()
    if (al2 % 2 == 0){
         a2 = al2
    }else{
         a2 = al2 + 1
    }
    val al3 = scanner.nextInt()
    if (al3 % 2 == 0){
         a3 = al3
    }else{
         a3 = al3 + 1
    }
    val resultado = (a1+a2+a3)/2
    println(resultado)

}