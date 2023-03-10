package com.example.myapplication

class SecondClass: FirstClass() {
    fun showValue(){
        println(doubleVariable)
    }
    fun showMyString(text: String){
        for (variable in text) {
            print(variable)
        }
        println()
    }

}