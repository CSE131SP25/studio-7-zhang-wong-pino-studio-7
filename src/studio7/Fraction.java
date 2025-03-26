package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public 
	
	public Fraction sum (Fraction newFraction) {
		Fraction sum;
		sum.numerator = this.denominator * newFraction.numerator + this.numerator * newFraction.denominator;
		sum.denominator = this.denominator * newFraction.denominator;
		return sum;
		
	}
	
	public Fraction product (Fraction newFraction) {
		Fraction product = null;
		product.numerator = this.numerator * newFraction.numerator;
		product.denominator = this.denominator * newFraction.denominator;
		return product;
	}
	
	pubic Fraction simplification (Fraction newFraction) {
		if (numerator % denominator == 0) {
			newFraction.numerator = numerator / denominator; 
			newFraction.denominator = 1;
			return newFraction;
		} else if (denominator % numerator == 0) {
			newFraction.numerator = 1; 
			newFraction.denominator = denominator / numerator;
			return newFraction;
		} else ()
			
		}
	}

}
