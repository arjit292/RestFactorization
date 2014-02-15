package com.factor.server.web;

import com.factor.server.calcuator.Exception.FactorException;
import com.factor.server.calcuator.api.FactorCalculator;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created with IntelliJ IDEA.
 * User: arjit.gupta
 * Date: 15/02/14
 * Time: 2:25 AM
 */

@Path("/factor")
public class FactorResource {

    private FactorCalculator factorCalculator;

    public FactorResource(FactorCalculator factorCalculator ){
        this.factorCalculator = factorCalculator;
    }


    @POST
    @Path("/calculatefactor")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public FactorResult calculateFactors(FactorRequest request){
        try {
            return factorCalculator.calculateFactors(request);
        }catch (Exception e){
           throw FactorException.wrap(e);
        }
    }
}
