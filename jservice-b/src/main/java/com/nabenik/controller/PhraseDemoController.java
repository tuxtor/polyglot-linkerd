package com.nabenik.controller;

import com.nabenik.repository.AdmPhraseRepository;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Random;
import org.jboss.logging.Logger;

@Path("/phrase-demo")
public class PhraseDemoController {

    AdmPhraseRepository admPhraseRepository;
    private static final Logger LOGGER = Logger.getLogger(PhraseDemoController.class);

    @Inject
    public PhraseDemoController(@RestClient AdmPhraseRepository admPhraseRepository){
        this.admPhraseRepository = admPhraseRepository;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Fallback(fallbackMethod = "doPhraseDemoFallback")
    public String doPhraseDemo(){
        var randIndex = new Random().nextInt(3) +1;
        var phrase = this.admPhraseRepository.findById(Long.valueOf(randIndex));
        return "I received the phrase \"" + phrase.getPhrase() + "\" pure wisdom by - " + phrase.getAuthor();
    }

    public String doPhraseDemoFallback(){
        return  "The system is in maintenace mode, please come back later";
    }

}
