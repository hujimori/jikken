

public class Ex210 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		int height = 9;
		int width = 9;
		
	
		System.out.print(" " + "|");
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\n");
		System.out.print("-+----------------------------------");
		System.out.print("\n");
	
	for (int i = 1; i <= height; i++) {
			
		System.out.print(i  + "|");
		
		for (int j = 0; j < width; j++) {
			
				System.out.print((j + 1) * i + " ");
		}
		System.out.print("\n");
		
	}
	
	}
}
