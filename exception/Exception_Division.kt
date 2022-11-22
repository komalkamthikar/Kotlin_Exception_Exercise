package exception

import java.lang.ArithmeticException
import java.util.InputMismatchException
import java.util.Scanner
fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    try {
        print("Enter First number :")
        var num1 =scan.nextInt()
        print("Enter Second number :")
        var num2 =scan.nextInt()
        var divide = num1/num2
        println("Divison of $num1 & $num2 is : $divide")
    }
    catch (e:ArithmeticException){
        println("Number cannot be 0")
    }
    catch (e:InputMismatchException){
        println("String and character cannot be entered.....")
        println("Please only Enter numbers!!!")
    }

}