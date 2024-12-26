package com.example.androidmaster

//variables

fun prints(){
    var num1: Int = 22
    var num2: Int = 2
    var num3: Float = 2.2f

    println("Suma")
    println(num1 + num2)

    println("Resta")
    println(num1 - num2)

    println("Div")
    println(num1 / num2)

    println("Multi")
    println(num1 * num2)

    var examplesumfl = num1 + num3
}

fun showNumber(actualNumber:Int = 22){
    println("Tengo $actualNumber años xD")
}

fun showName(name: String){
    println("Mi nombre es $name xD")
}

fun restFun(num1:Int, num2:Int):Int{
    return num1 - num2
}

fun restFunCool(num1:Int, num2:Int) = num1 - num2

fun main(){
    showNumber(24)
    showName("Italo")
    val rest = restFun(10,5)
    println("La resta es : $rest")
}