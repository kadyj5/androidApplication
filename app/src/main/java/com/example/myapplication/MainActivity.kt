package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.network.Response
import com.example.myapplication.network.ResponseHandler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var variableA= SecondClass()
//        variableA.showValue()
//        variableA.showMyString("KOT")
        val reponseHandler = ResponseHandler()
        val response = reponseHandler.parseResponse(200, "example data")
        response.handleResponse()

    }
    private fun Response.handleResponse() {
        when (this) {
            is Response.Success -> { Log.d("cwiczenie", "${this.javaClass.simpleName}") }
            is Response.Progress -> { Log.d("cwiczenie", "progress") }
            is Response.Failure -> { Log.d("cwiczenie", errorMessage) }
        }
    }
}