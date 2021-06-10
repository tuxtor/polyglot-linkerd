package com.nabenik.repository;


import com.nabenik.model.AdmPhrase;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

@RegisterRestClient
@Path("/phrases")
public interface AdmPhraseRepository {

    @GET
    public List<AdmPhrase> listAll();

    @GET
    @Path("/{id:[0-9][0-9]*}")
    public AdmPhrase findById(@PathParam("id") Long id);
}
