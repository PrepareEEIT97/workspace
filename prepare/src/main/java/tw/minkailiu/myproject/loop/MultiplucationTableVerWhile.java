package tw.minkailiu.myproject.loop;

public class MultiplucationTableVerWhile {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.printf("%d x %d = %2d\t", j, i, j * i);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
