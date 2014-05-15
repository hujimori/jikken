import java.util.Scanner;


public class Ex201 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("数値を入力してください");
		
		
		num = scanner.nextInt();
		
		if (num < 0) {
			System.out.println("正でない値が入力されました");			
		}
		else {
		
		if(num %5 != 0) {
			System.out.println("入力された値は5で割りきれません");
		}
		else {
			System.out.println("入力された値は5でわりきれます");
		}
		
		}
	}

}


/*
数値を入力してください
-12
正でない値が入力されました
数値を入力してください
12
入力された値は5で割りきれません
数値を入力してください
5
入力された値は5でわりきれます

*/