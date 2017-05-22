package com.echo.kotlindemo

/**
 * Created by echo on 5/22/17.
 */
class C() : A1(), B{
    override fun f() {
        super<A1>.f()
        super<B>.f()
    }
}