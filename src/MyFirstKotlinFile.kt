import java.util.*

fun main(){

    println("I am inside main function")

    println("I am inside main function again")

    mySecondFunction()

    val dayOfJim = jimDay()
    println(dayOfJim)

    printMyNumber(myNumber = 10)

    val sum = addition(myNumber1 = 90, myNumber2 = 20)

    println("the sum is : $sum")

    println(dayOfWeek(day = "Tuesday"))

    println("mixing arguments : \n")

    if(shouldGoJim("Monday")) println("Go to Jim") else println("stay home")

    if(shouldGoJim("Monday", 7)) println("Go to Jim") else println("stay home")

    if(shouldGoJim("Monday", 6, false)) println("Go to Jim") else println("stay home")

    if(shouldGoJim("Monday",  isRainy = true)) println("Go to Jim") else println("stay home")



}

fun shouldGoJim(day : String, time : Int = 6, isRainy : Boolean = false) : Boolean{

    return when{
        isSaturday(day) -> true
        isAfterSix(time) -> true
        isWeatherOk(isRainy) -> false
        else -> false
    }

}

fun isSaturday(day : String) = day == "Saturday"

fun isAfterSix(time : Int) = time > 6

fun isWeatherOk(isRainy: Boolean) = isRainy



fun dayOfWeek(day : String = "Monday") : String{
    return day
}

fun mySecondFunction(){
    println("I am inside my second function")
}

fun jimDay() : String{

    val day = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    return day[Random().nextInt(7)]
}

fun printMyNumber(myNumber : Int){
    println("my number is $myNumber")
}

fun addition(myNumber1: Int, myNumber2 : Int) : Int{
    return myNumber1 + myNumber2
}

