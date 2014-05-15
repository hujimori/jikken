import java.util.Scanner;


public class Ex207 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		int height;
		int width;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("行を入力してください");
		height = scanner.nextInt();
		
		System.out.println("列を入力");
		width = scanner.nextInt();
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				
				System.out.print("*");
			}
		System.out.print("\n");
		
		}
	
	}

}

/*
行を入力してください
7
列を入力
9
*********
*********
*********
*********
*********
*********
*********

行を入力してください
5
列を入力
7
*******
*******
*******
*******
*******

*/