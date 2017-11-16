package Student.prepare;

public class LeetcodeReverseString_II {

	public static void main(String[] args) {
//		Example:
//			Input: s = "abcdefg", k = 2
//			Output: "bacdfeg"
		LeetcodeReverseString_II leetcodeReverseString_II=new LeetcodeReverseString_II();
		System.out.println(leetcodeReverseString_II.reverseStr("abcdefgh",2));
			
	}
	public String reverseStr(String s, int k) {
		
		String val="";
		
		for(int x=k;x>0;x--){
			
			val=val+s.substring(x-1,x);
		}
		s=val+s.substring(k);
		
		return s;
        
    }
}
