package palindrome.numbers;

public class PalindromicNumber {
	
	int i,j,result;
	
	public PalindromicNumber(int _i, int _j, int _temp) {
		i=_i;
		j=_j;
		result=_temp;
	}
	
	public String getI() {
		return Integer.toString(i);
	}
	
	public String getJ() {
		return Integer.toString(j);
	}
	
	public String getResult() {
		return Integer.toString(result);
	}
	
	public int getIntResult() {
		return result;
	}

}
