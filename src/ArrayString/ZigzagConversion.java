//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"
//
//Write the code that will take a string and make this conversion given a number of rows:
//
//string convert(string s, int numRows);
// 
//
//Example 1:
//
//Input: s = "PAYPALISHIRING", numRows = 3
//Output: "PAHNAPLSIIGYIR"
//Example 2:
//
//Input: s = "PAYPALISHIRING", numRows = 4
//Output: "PINALSIGYAHRPI"
//Explanation:
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
//Example 3:
//
//Input: s = "A", numRows = 1
//Output: "A"

package ArrayString;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        char[] charArray = s.toCharArray();
        char[][] font = new char[numRows][];
        
        if (numRows == 1) {
        	return s;
        }
        
        int inc = (numRows - 2 + 1) * 2;
        
    }
    
//    public String convert(String s, int numRows) {
//        StringBuilder sb = new StringBuilder();
//        List<Character>[] rows = new List[numRows];
//        int k = 0;
//        int direction = numRows == 1 ? 0 : -1;
//
//        for (int i = 0; i < numRows; ++i)
//          rows[i] = new ArrayList<>();
//
//        for (final char c : s.toCharArray()) {
//          rows[k].add(c);
//          if (k == 0 || k == numRows - 1)
//            direction *= -1;
//          k += direction;
//        }
//
//        for (List<Character> row : rows)
//          for (final char c : row)
//            sb.append(c);
//
//        return sb.toString();
//      }
}
