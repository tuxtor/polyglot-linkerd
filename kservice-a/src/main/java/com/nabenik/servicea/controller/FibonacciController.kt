package com.nabenik.servicea.controller

import javax.enterprise.context.ApplicationScoped
import javax.ws.rs.*

@Path("/fibonacci")
@ApplicationScoped
class FibonacciController{

    @GET
    fun doHello(@QueryParam("n") @DefaultValue("0") n: Long): String {
        return doFibo(n).toString()
    }

    fun doFibo(n: Long): Long {
        if(n <= 1) {
            return n;
        }
        return doFibo(n-1) + doFibo(n-2)
    }
}
