package com.echo.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val customer = Customer()
        Log.d("kotlin", customer.chanedName)

        var child = Child()
        child.foo()

        val demo = Outer().Nested().foo()
    }

}
