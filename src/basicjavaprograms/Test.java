package basicjavaprograms;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int row=5;
//		for(int i=1;i<=row;i++){
//		for(int j=1;j<=i;j++){
//		System.out.print("*");
//		}
//		System.out.println();
//		}

//		int row = 5;
//		for (int i = row; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

//		int row = 5;
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}

//		int row = 5;
//		int num = 1;
//		for (int i = 1; i <= row; i++) {
//			for (int j = row - i; j >= 1; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print(num + " ");
//				num++;
//			}
//			System.out.println();
//		}

//		int p[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 4, 6 }, { 2, 5, 8, 7 } };
//
//		int max = 0;
//		int sum = 0;
//
//		for (int i = 0; i < p.length; i++) {
//			for (int j = 0; j < p.length; j++) {
//
//				if (p[i][j] > max) {
//					max = p[i][j];
//				}
//				sum = sum + p[i][j];
//			}
//		}
//		System.out.println("Max Element in 2D array is:  " + max);
//
//		System.out.println("Sum of 2D array is:  " + sum);

		int p[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 4, 6 }, { 2, 5, 8, 7 } };
		int q[][] = { { 1, 2, 3, 4 }, { 4, 6, 5, 8 }, { 9, 0, 4, 6 }, { 2, 5, 8, 7 } };

		int count = 0;
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {

				if (p[i][j] != q[i][j]) {
					count++;
					break;
				}
			}
		}
		if (count == 0) {
			System.out.println("Both 2D array are equal");
		} else {
			System.out.println("Both 2D array are not equal");
		}
	}
}
