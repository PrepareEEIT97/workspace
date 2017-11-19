package Student.prepare;

public class LeetcodeHappyNumber {

	public static void main(String[] args) {
		
		int sum=19;
		int a=0,b=0,c=0;
		while(sum!=1){
				a=(sum/100)*(sum/100);
				b=(sum%100/10)*(sum%100/10);
				c=(sum%100%10)*(sum%100%10);
				sum=a+b+c;
				System.out.println(sum);
			
		}	
	}

}
