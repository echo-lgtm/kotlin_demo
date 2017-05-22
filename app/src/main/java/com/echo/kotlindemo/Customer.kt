package com.echo.kotlindemo

/**
 * Created by echo on 5/22/17.
 */
class Customer : Person("echo", 12) {

    var convertName = name.toUpperCase()


    override fun changeName() : String{
        return "123"
    }
    val chanedName = changeName()

    val initValur : Int?
    get() = 123

}