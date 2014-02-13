package com.factor.config;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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

    @Valid
    @NotNull
    @JsonProperty
    private int port = 0;

    public String getDefaultName() {
        return defaultName;
    }

    public int getPort() {
        return port;
    }
}
