package com.factor.server.web;

/**
 * Created with IntelliJ IDEA.
 * User: arjit.gupta
 * Date: 15/02/14
 * Time: 2:28 AM
 */
public class FactorRequest {
    private int number;

    public FactorRequest(){}

    public FactorRequest(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
