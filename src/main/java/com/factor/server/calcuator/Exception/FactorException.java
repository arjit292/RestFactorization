package com.factor.server.calcuator.Exception;

/**
 * Created with IntelliJ IDEA.
 * User: arjit.gupta
 * Date: 15/02/14
 * Time: 9:37 AM
 */
public class FactorException extends RuntimeException {

    public FactorException(String message) {
        super(message);
    }

    public FactorException(String message, Throwable cause) {
        super(message, cause);
    }

    public FactorException(Throwable cause) {
        super(cause);
    }

    public static FactorException wrap(Throwable e) {
        return (e instanceof FactorException) ?(FactorException) e : new FactorException(e);
    }

}
