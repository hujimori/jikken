import java.util.Scanner;


public class Ex208 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	int height;

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("行を入力してください");
		height = scanner.nextInt();
		
	
	
		for (int i = 0; i < height; i++) {
			
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < height - i; j++) {
			
			System.out.print("*");
			}
			System.out.println();
		
		}
	}

}
/*
行を入力してください
5
*****
 ****
  ***
   **
    *
行を入力してください
7
*******
 ******
  *****
   ****
    ***
     **
      *

*/
