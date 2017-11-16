package Student.prepare;

public class LeetcodeReverseInteger {

	public static void main(String[] args) {
		//數字反轉
		int x=(int)(Math.random()*10000);
		System.out.println(x);
		int rev=0;
		while(x!=0){
			rev=rev*10+x%10;
			x=x/10;
		}
		System.out.println(rev);
		
		
	}

}
