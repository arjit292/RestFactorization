import com.factor.server.calcuator.Exception.FactorException;
import com.factor.server.calcuator.FactorCalculatorImpl;
import com.factor.server.calcuator.api.FactorCalculator;
import com.factor.server.web.FactorRequest;
import com.factor.server.web.FactorResult;
import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: arjit.gupta
 * Date: 15/02/14
 * Time: 10:12 AM
 */
public class TestFactors {

    @Test
    public void testFactors(){
        FactorCalculator factorCalculator = new FactorCalculatorImpl();
        FactorResult factorResult = factorCalculator.calculateFactors(new FactorRequest(8));
        Assert.assertTrue(factorResult!=null);
        Assert.assertEquals(factorResult.getFactors(), Arrays.asList(2,2,2));
    }

    @Test
    public void testFactorsPrime(){
        FactorCalculator factorCalculator = new FactorCalculatorImpl();
        FactorResult factorResult = factorCalculator.calculateFactors(new FactorRequest(13));
        Assert.assertTrue(factorResult!=null);
        Assert.assertEquals(factorResult.getFactors(), Arrays.asList(13));
    }

    @Test
    public void testFactorsNegative(){
        FactorCalculator factorCalculator = new FactorCalculatorImpl();
        try{
            FactorResult factorResult = factorCalculator.calculateFactors(new FactorRequest(-100));
        }catch (FactorException e){
            Assert.assertTrue(true);
            return;
        }
        Assert.assertFalse(true);
    }

    @Test
    public void testFactorsZero(){
        FactorCalculator factorCalculator = new FactorCalculatorImpl();
        try{
            FactorResult factorResult = factorCalculator.calculateFactors(new FactorRequest(0));
        }catch (FactorException e){
            Assert.assertTrue(true);
            return;
        }
        Assert.assertFalse(true);
    }

}
