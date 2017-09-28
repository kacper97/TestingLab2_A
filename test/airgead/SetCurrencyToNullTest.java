package airgead;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SetCurrencyToNullTest {
// First set up Systems Under Test (SUT)
Money money1;
Money money2;

@Before
public void setUp() throws Exception {
money1 = new Money(9, "Euro");
money2 = new Money(-2, "Euro");
}

@Test
public void setCurrencyToNull(){
	assertEquals(0, money2.getAmount());
	}
}