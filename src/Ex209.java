import java.util.Scanner;


public class Ex209 {

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
				for (int j = 0; j < (height - i) * 2 ; j++) {
				
				System.out.print(i + 1);
				}
				System.out.println();
			
			}
		}

	}
/*
行を入力してください
7
11111111111111
 222222222222
  3333333333
   44444444
    555555
     6666
      77

行を入力してください
5
1111111111
 22222222
  333333
   4444
    55

*/