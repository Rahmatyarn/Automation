package pages;

public class Home {
	
	public static void main (String [] args) {
		
		double total = 2655;
		double interest = 0;
		
		
		// check to see if the total is within these ranges and change interest based on that
		// if total is more than 3500, then check to see if the number is odd or even
		// for odd, interest = 5.5
		// for even, interest = 6.5
		// for totals 2500 - 3500, interest should be 3.5
		// for totals 900 - 2500, interest should be 2.5
		// for totals 500 - 900, interest should be 1.5
		// for totals 100 - 500, interest should be 1.0
		
		if (total >= 3500) {
			// for odd, interest = 5.5
			// for even, interest = 6.5
		} else if (total >= 2500) {
			interest = total * 0.035;
		System.out.println("Yout total was" + total + " Which added 3.5% (" + interest +") which is going to be "
				+ (total + interest));
		} else if (total >= 900) {
			interest = total * 0.025;
			System.out.println(total + " 2.5% interest = " + ((total * 0.025) + total));
		} else if (total >= 500) {
			interest = total * 0.015;
			System.out.println(total + " 1.5% interest =" + ((total * 0.015) + total)); 
		} else if (total >= 100) {
			interest = total * 0.010;
			System.out.println(total + " 1% interest = " + ((total * 0.01) + total));
		} else {
			interest = total * 0.0;
			System.out.println(total + " 0 Interest =" + ((total * 0) + total));
			
		}
	}
}
  