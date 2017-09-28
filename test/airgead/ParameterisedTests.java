package airgead;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

 
@RunWith(value = Parameterized.class)
public class ParameterisedTests {
 
	 private double amountTest;
	 private String currencyTest;
	

	 public ParameterisedTests(int amountIn, String currencyIn) {
	    this.amountTest = amountIn;
	    this.currencyTest = currencyIn;
	    if (amountTest<0.00){
	    	amountTest=0.00;
	    }
	 }
	private Money money;
	
	@Before
	public void setUp() throws Exception {
			this.money = new Money(this.amountTest, this.currencyTest);
	}
 
	 @Parameters
	 public static Collection<Object[]> data() {
	   Object[][] dataSet = new Object[][] { { 10, "USD" }, {20, "EURO"}, {30, "GBP"}, {0, "USD"}, {-100, "EURO"} };
	   return Arrays.asList(dataSet);
	 }
 
	 @Test
	 public void constructorShouldSetAmountAndCurrency () {
		    assertEquals(this.amountTest, this.money.getAmount(), this.amountTest);
		    assertEquals(this.currencyTest, this.money.getCurrency());
	 }
}
