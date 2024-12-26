package com.example.androidmaster

fun ifBasic(){
    val name = "xd"

    if (name == "Italo"){
        println("Cholito, la variable name es curiDev")
    }else if (name == "curiDev"){
        println("Grande Crack")
    }else{
        println("Baboso xd")
    }
}

fun ifBool(){

    var anxiety:Boolean = false

    if (anxiety){
        println("Toma Agua o Camina")
    }else if (!anxiety){
        println("Que bueno :)")
    }
}

fun ifMulti(){
    var age = 18
    var parentPermission = false

    if (age >= 18 || parentPermission){
        println("puedes chupar papi tranqui xd")
    }
}

fun main(){
    ifMulti()
}