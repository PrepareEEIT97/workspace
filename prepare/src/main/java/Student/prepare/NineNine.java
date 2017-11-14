package Student.prepare;

public class NineNine {

	public static void main(String[] args) {
		for(int a=1;a<=9;a++){
			for(int b=1;b<=9;b++){
				System.out.printf("%d*%d=%02d ",b,a,a*b);
			}
			System.out.println("");
		}
	}

}
