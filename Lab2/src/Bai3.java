/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện sử dụng: ");
		int sodien = scanner.nextInt();
		
		double tiendien = TinhTienDien(sodien);
		
		System.out.printf("Tiền điện của tháng này là: %.1f%n",tiendien);
		scanner.close();
	}
	public static double TinhTienDien(int sodien) {
		
		double tiendien=0;
		if(sodien<=50) {
			tiendien=sodien*1000;
		}else {
			tiendien=50*1000+(sodien-50)*1200;
		}
		return tiendien;
	}
}
