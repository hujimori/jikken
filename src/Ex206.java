import java.util.Scanner;



public class Ex206 {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
	
		
		for (int i = 1; i <= num; i++ ) {
			
			 
			System.out.print((int)Math.pow(2, i) );
			
			
		}
	}

}
/*
12
2,4,8,16,32,64,128,256,512,1024,2048,4096
*/