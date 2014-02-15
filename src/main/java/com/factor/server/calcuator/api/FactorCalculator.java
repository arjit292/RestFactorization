package com.factor.server.calcuator.api;

import com.factor.server.web.FactorRequest;
import com.factor.server.web.FactorResult;

/**
 * Created with IntelliJ IDEA.
 * User: arjit.gupta
 * Date: 15/02/14
 * Time: 2:29 AM
 */
public interface FactorCalculator {

    FactorResult calculateFactors(FactorRequest request);
}
