package Student.prepare;

public class FeisSeries {

	public static void main(String[] args) {
		//列出費式數列，值為20
		int a[]={0,1};
		for(int x=0;x<=20;x++){
			
			if(x%2==0){
				System.out.print(a[0]+" ");
				a[0]=a[0]+a[1];
			}
			if(x%2!=0){
				System.out.print(a[1]+" ");
				a[1]=a[0]+a[1];
			}
			
		}

	}

}
