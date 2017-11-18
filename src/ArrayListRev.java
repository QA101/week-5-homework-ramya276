import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListRev rev = new ArrayListRev();
		String[] reverseStr=rev.backwardChars("FOOTBALL");
		for (int i=0;i<reverseStr.length;i++ ){
			System.out.print(reverseStr[i]+"");	
		}
		System.out.println();
		System.out.println(Arrays.deepToString(reverseStr));
	}

	public String[] backwardChars(String str) {

		ArrayList<String> charsList = backwardCharsB(str);
		String chars[] = new String[charsList.size()];
		for (int i = 0; i < charsList.size(); i++) {
			chars[i] = charsList.get(i);
		}
		return chars;
	}

	public ArrayList<String> backwardCharsB(String str) {
		ArrayList<String> arrLst = new ArrayList<String>();
		char[] arr = str.toCharArray(); // b,a,l,l
		for (int i = arr.length - 1; i >= 0; i--) {
			arrLst.add(String.valueOf(arr[i]));
		}
		return arrLst;
	}
}
