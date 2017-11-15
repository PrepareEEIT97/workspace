package Student.prepare;

public class NineNineMultiplicationTable {

	public static void main(String[] args) {
		//99乘法表
		for(int a=1;a<=9;a++){
			for(int b=1;b<=9;b++){
				System.out.printf("%d*%d=%02d ",b,a,a*b);
			}
			System.out.println("");
		}
	}

}
