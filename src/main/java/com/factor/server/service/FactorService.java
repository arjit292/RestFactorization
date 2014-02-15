package com.factor.server.service;

import com.factor.server.config.FactorConfiguration;
import com.factor.server.calcuator.FactorCalculatorImpl;
import com.factor.server.web.FactorResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

/**
 * Created with IntelliJ IDEA.
 * User: arjit.gupta
 * Date: 15/02/14
 * Time: 2:22 AM
 */
public class FactorService extends Service<FactorConfiguration> {
    @Override
    public void initialize(Bootstrap<FactorConfiguration> factorConfigurationBootstrap) {
        factorConfigurationBootstrap.setName("Factor-service");
    }

    @Override
    public void run(FactorConfiguration factorConfiguration, Environment environment) throws Exception {

        environment.addResource(new FactorResource(new FactorCalculatorImpl()));

    }

    public static void main(String[] args) throws Exception {
        new FactorService().run(args);
    }
}
