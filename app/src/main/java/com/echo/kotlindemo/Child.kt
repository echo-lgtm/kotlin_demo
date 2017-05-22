package com.echo.kotlindemo

/**
 * Created by echo on 5/22/17.
 */
class Child : MyInterface{

    override val property: Int
        get() = 20

    override fun foo() {
        var property = property + 1
        print(property)
    }

}