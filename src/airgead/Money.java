package airgead;

public class Money {
private final double amount;
private final String currency;


// got this by auto doing and then adding in commands
public Money(double amount, String currency) {
	
	if (amount<0.00){
			amount=0.00;
	}
	this.amount=amount;
	this.currency= currency;
	// TODO Auto-generated constructor stub
}

// provide a constructor as defined by its tests
public double getAmount(){
return amount;
}

public String getCurrency(){
return currency;
}


}