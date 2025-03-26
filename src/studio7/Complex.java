package studio7;

public class Complex {
	
	private double real;
	private double imaginary;
	
	public String sum(Complex newComplex) {
		double realSum = this.real + newComplex.real;
		double imaginarySum = this.imaginary + newComplex.imaginary;
		String result = realSum + imaginarySum + ""
		return result;
	}

}
