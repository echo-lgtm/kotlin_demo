package com.echo.kotlindemo


/**
 * Created by echo on 5/22/17.
 */

open class Person(name: String, age: Int) {
    var name = name.plus(",").plus("hi")
    val age = age.and(11)

    open fun changeName(): String {
        val name = name.toUpperCase()
        return name
    }

}



