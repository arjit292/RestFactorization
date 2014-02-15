package com.factor.server.web;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: arjit.gupta
 * Date: 15/02/14
 * Time: 2:27 AM
 */
public class FactorResult {

    private int number;
    private List<Integer> factors;

    public FactorResult(List<Integer> factors, int number) {
        this.factors = factors;
        this.number = number;
    }

    public FactorResult(){}

    public void setNumber(int number) {
        this.number = number;
    }

    public void setFactors(List<Integer> factors) {
        this.factors = factors;
    }

    public int getNumber() {
        return number;
    }

    public List<Integer> getFactors() {
        return factors;
    }
}
