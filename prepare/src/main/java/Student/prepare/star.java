package Student.prepare;

public class star {

	public static void main(String[] args) {
		
			//菱形星星排列
			for(int x=1;x<=5;x++){
					for(int z=1;z<=5-x;z++){
						System.out.print(" ");
					}
					for (int y = 1; y <= x; y++) {
						System.out.print("* ");
					}			
				System.out.println(" ");
			}
			for(int x=1;x<5;x++){
				for(int y=1;y<x+1;y++){
					System.out.print(" ");
				}
				for (int z = 1; z <= 5-x; z++) {
					System.out.print("* ");
				}
				System.out.println(" ");
			}

	}

}
