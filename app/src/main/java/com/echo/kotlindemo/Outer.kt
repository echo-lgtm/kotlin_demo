package com.echo.kotlindemo

/**
 * Created by echo on 5/22/17.
 */
class Outer{
    private val bar: Int = 1
    inner class Nested {
        fun foo() = 2
    }
}