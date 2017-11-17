import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringOp op = new StringOp();
		subStringFind("aaacodebbbscodecodebbb", "code");
		halfString("Crammers");
		System.out.println(strEndChk("abc","abXaBc"));
		strRev("Seattle is cool");
		System.out.println();
	}
//1
	public static void subStringFind(String word, String sub) {
	System.out.println("1.");
		int startIdx = 0, tempIdx = 0, count=0;
		System.out.println("word:"+word+ "  length:" + word.length());
		if (word.length() > 0) {
			while (tempIdx != -1) {
				tempIdx = word.substring(startIdx, (word.length() - 1)).indexOf(sub);
				if (tempIdx != -1) {
					count++;
					startIdx += tempIdx + (sub.length());
				}
			}
		}
		System.out.println("No. of times "+sub+" appears:"+count);
		System.out.println();
	}
	
//3
	public static void halfString(String fullStr) {
		System.out.println("3.");
		char[] halfArr= fullStr.toCharArray();
		int half=fullStr.length()/2;
			for(int i=0;i<half;i++)
			{
				System.out.print(halfArr[i]);	
			}
		System.out.println();
	}
	
//2 
	public static boolean strEndChk(String str1, String str2){
		System.out.println("2.");
		if(str2.toLowerCase().endsWith(str1)||str1.toLowerCase().endsWith(str2)){
			return true;
		}
		else {
			return false;
		}
	}
	
//4	
	public static void strRev(String origString) {
		System.out.println("4.");
		char[] arrStr=origString.toCharArray();
		for(int i=origString.length()-1;i>=0;i--) {
			System.out.print(arrStr[i]);
		}
	}
}