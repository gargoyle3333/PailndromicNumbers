package palindrome.numbers;

import java.util.ArrayList;

public class LargestPalindromicNumber {
	
	ArrayList<PalindromicNumber> palindromes;
	
	public LargestPalindromicNumber(int lowerLimit, int upperLimit) {
		int i=lowerLimit,j=lowerLimit,temp;
		palindromes = new ArrayList<PalindromicNumber>();
		while (i<upperLimit) {
			while (j<upperLimit) {
				temp=i*j;
				System.out.println(temp);
				if(testPalindrome(temp)) palindromes.add(new PalindromicNumber(i,j,temp));
				j++;
			}
			i++;
			j=lowerLimit;
		}
	}
	
	public boolean testPalindrome(int i) {
		String str = Integer.toString(i);
		StringBuffer rev = new StringBuffer(str).reverse();
		if(str.contentEquals(rev)) return true;
		else return false;
	}
	
	public void printResults() {
		System.out.println("First Number \t Second Number \t Result");
		for (PalindromicNumber x : palindromes) {
			System.out.println(x.getI() +"\t\t"+ x.getJ() +"\t\t"+ x.getResult());
		}
	}
	
	public PalindromicNumber findHighest() {
		PalindromicNumber x = new PalindromicNumber(0, 0, 0);
		for (PalindromicNumber pn : palindromes) {
			if (pn.getIntResult()>x.getIntResult()) x=pn;
		}
		return x;
	}

	public static void main(String[] args) {
		LargestPalindromicNumber lpn = new LargestPalindromicNumber(1,1000);
		lpn.printResults();
		System.out.println("\n" + "Highest number: " + lpn.findHighest().getResult());
	}

}
