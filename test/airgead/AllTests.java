package airgead;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ GetNullCurrencyTest.class, GetPositiveCurrencyTest.class,
		MoneyTest.class, SetCurrencyToNullTest.class,
		SetPositiveAmountTest.class })
public class AllTests {

}
