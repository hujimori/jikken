import java.util.Scanner;


public class Ex202 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double num;
		
		System.out.println("球の面積と堆積を求めます");
		
		System.out.println("球の半径をにゅうりょくしてください");
		
		Scanner scanner = new Scanner(System.in);
		
		num = scanner.nextDouble();
		
		Caluculate caluculate = new Caluculate();
		caluculate.setNum(num);
		
		System.out.println("球の表面積は"+caluculate.getSurfaceArea()+"です");
		System.out.println("球の堆積は"+caluculate.getVolume()+"です");
		
		
	}


}


class Caluculate {
	
	private double num;
	
	public void setNum(double x) {
		
		if (x > 0) {
		this.num = x;
		}
	}
	
	public double getSurfaceArea() {
		
		return   4 * Math.PI * num * num;
	}
	
	public double getVolume() {
		return 4 / 3 * num * num * num;
	}
}

/*
球の面積と堆積を求めます
球の半径をにゅうりょくしてください
5.5
球の表面積は380.1327110843649です
球の堆積は166.375です
*/
