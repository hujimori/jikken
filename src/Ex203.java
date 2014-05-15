import java.util.Scanner;


public class Ex203 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int num;
		
		Result result = new Result();
		
		Scanner scanner = new Scanner(System.in);
		
		num = scanner.nextInt();
		
		System.out.println("点数を入試してください");
		
		if (num >= 95 && num <= 100) {
			result.printResult("S");
		}
		else if (num >= 85 && num < 95) {
			result.printResult("A");
		}
		else if (num >= 75 && num < 85) {
			result.printResult("B");
		}
		else if (num >= 60 && num < 75) {
			result.printResult("C");
		}
		else if (num >= 0 && num < 60) {
			result.printResult("D");
		}
		else {
			result.printResult("不正な値です");
		}
	}
	
	
	

}

class Result {
	
	public void printResult(String string) {
		System.out.println(string);
	}
	
	public void errorResult(String string) {
		System.out.println(string);
	}
}

/*
 * 点数を入試してください
 *	S
 *点数を入試してください
 * A
 *点数を入試してください
 * B
 *点数を入試してください
 * C
 *点数を入試してください
 *D
 *点数を入試してください
 *不正な値です

 */
