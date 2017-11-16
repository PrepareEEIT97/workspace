package Student.prepare;

public class LeetcodeReverseString {

	public static void main(String[] args) {
		// 字串反轉
		
		String test="asdjkas5";
		String value="";
		for(int x=test.length()-1;x>=0;x--){
			value=value+test.charAt(x);
		}
		System.out.println(value);
	}

}
