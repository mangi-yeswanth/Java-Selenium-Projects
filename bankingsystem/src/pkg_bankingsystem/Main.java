package pkg_bankingsystem;

class Main {

	public static void main(String[] args) {
		InterestCalculator interestCalculator = new InterestCalculator() {
			public double calculateSimpleInterest(double principal, double rate, double time) {
				return (principal * rate * time) / 100;
			}
		};
		EMICalculator EMIcalculator = new EMICalculator() {
			public double EMIcalculator(double EMIprincipal, double annualInterestRate, double tenureInMonths) {
				double monthlyRate = annualInterestRate / (12 * 100);
				double emi = EMIprincipal * monthlyRate * Math.pow(1 + monthlyRate, tenureInMonths)
						/ (Math.pow(1 + monthlyRate, tenureInMonths) - 1);
				return emi;
			}
		};
		CurrencyConverter currencyconvert=new CurrencyConverter() {
			public double convertINRtoUSD(double amountInINR) {
				double USD=amountInINR*0.012;
				return USD;
			}
		};

		System.out.println("the simple interest is " + interestCalculator.calculateSimpleInterest(1000, 5, 2));
		System.out.println("the EMI is " + EMIcalculator.EMIcalculator(2000, 3, 2));
		System.out.println("the INR in USD is "+ currencyconvert.convertINRtoUSD(10000));
	}

}
