package TwoPointers;

public class SumOfDigitsInBaseK {
    public int sumBase(int n, int k) {
    	StringBuilder sb = new StringBuilder();
    	
    	while (n != 0) {
    		int remainder = n % k;
    		sb.insert(0, remainder);
    		n = n / k;
    	}
    	
    	String str = sb.toString();
    	int sum = 0;
    	for (int i = 0; i < str.length(); i++) {
    		sum += Integer.parseInt(String.valueOf(str.charAt(i)));
    	}
    	return sum;
    }
}
