package com.nabenik.servicea.controller

import com.nabenik.servicea.model.AdmPhrase
import java.util.*
import javax.enterprise.context.ApplicationScoped
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam

@Path("/phrases")
@ApplicationScoped
class AdmPhraseController {

    private lateinit var phraseList: List<AdmPhrase>

    @GET
    fun listAll(): List<AdmPhrase> = phraseList

    @GET
    @Path("/{id:[0-9][0-9]*}")
   fun findById(@PathParam("id") id: Long): AdmPhrase? {
        maybeFail("Random fail")
        return phraseList.firstOrNull(){ it.phraseId == id }
    }

    private fun maybeFail(failureLogMessage: String) {
        if (Random().nextBoolean()) {
            throw RuntimeException("Resource failure.")
        }
    }

    init {
        phraseList = arrayListOf(
            AdmPhrase(1L, "Victor Orozco", "GraalVM Rocks"),
            AdmPhrase(2L, "Ken Thompson", "One of my most productive days was throwing away 1000 lines of code"),
            AdmPhrase(3L, "James Gosling", "Java is C++ without the guns, clubs and knives.")
        )
    }
}
