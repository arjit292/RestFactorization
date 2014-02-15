package com.factor.server.calcuator;

import com.factor.server.calcuator.Exception.FactorException;
import com.factor.server.calcuator.api.FactorCalculator;
import com.factor.server.web.FactorRequest;
import com.factor.server.web.FactorResult;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: arjit.gupta
 * Date: 15/02/14
 * Time: 2:30 AM
 */
public class FactorCalculatorImpl implements FactorCalculator{
    @Override
    public FactorResult calculateFactors(FactorRequest request) {

        List<Integer> factors = calculate(request.getNumber());

        return new FactorResult(factors,request.getNumber());
    }

    private List<Integer> calculate(int n) {
        List<Integer> response = Lists.newArrayList();
        if(n<=0) throw new FactorException("Numbers Not supported");
        if(n==1){
            response.add(1);
            return response;
        }
        int val =n ;
        for(int i=2;i<=val;i++){
            while(n%i==0){
                response.add(i);
                n=n/i;
            }
        }
        return response;
    }
}
