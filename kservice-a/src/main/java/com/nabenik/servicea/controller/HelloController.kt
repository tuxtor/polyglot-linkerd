package com.nabenik.servicea.controller

import org.eclipse.microprofile.config.inject.ConfigProperty
import java.net.InetAddress
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/hello")
@ApplicationScoped
class HelloController{

    private var javaHome:String
    val ip: InetAddress = InetAddress.getLocalHost()

    @Inject
    constructor(@ConfigProperty(name ="JAVA_HOME", defaultValue = "JAVA_HOME") javaHome: String){
        this.javaHome = javaHome
    }
    @GET
    fun doHello() = "No hay lugar como  $javaHome, ejecutandose en la siguiente direccion IP $ip"
}