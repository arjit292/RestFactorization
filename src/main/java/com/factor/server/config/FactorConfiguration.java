package com.factor.server.config;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created with IntelliJ IDEA.
 * User: arjit.gupta
 * Date: 13/02/14
 * Time: 10:07 AM
 */
public class FactorConfiguration extends Configuration {

    @NotEmpty
    @JsonProperty
    private String defaultName = "Stranger";



    public String getDefaultName() {
        return defaultName;
    }


}
