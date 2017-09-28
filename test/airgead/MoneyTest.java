package airgead;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MoneyTest {
// First set up Systems Under Test (SUT)
Money money1;
Money money2;

@Before
public void setUp() throws Exception {
money1 = new Money(9, "Euro");
money2 = new Money(-2, "Euro");
}

// The test below is to ensure that the constructor works properly
// If you attempt to set the amount to a negative value, 0 is used instead
@Test
public void constructorShouldSetAmountAndCurrencyProperly() {
assertEquals(9, money1.getAmount());
assertEquals("Euro", money1.getCurrency());
assertEquals(0, money2.getAmount());
assertEquals("Euro", money2.getCurrency());
}

@Test
public void setPositiveAmount(){
	assertEquals(9, money1.getAmount());
	}

@Test
public void getPositiveCurrency(){
	assertEquals("Euro", money1.getCurrency());
	}

@Test
public void setCurrencyToNull(){
	assertEquals(0, money2.getAmount());
	}

@Test
public void getNullCurrency(){
	assertEquals("Euro", money2.getCurrency());
	}

}
