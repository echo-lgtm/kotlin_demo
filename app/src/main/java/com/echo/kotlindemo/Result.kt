package com.echo.kotlindemo

import javax.net.ssl.SSLEngineResult

/**
 * Created by echo on 5/22/17.
 */
data class Result(val result: Int, val status: SSLEngineResult.Status)