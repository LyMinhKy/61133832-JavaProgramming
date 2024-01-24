/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài HCN: ");
		double chdai = scanner.nextDouble();
		System.out.print("Nhập chiều rộng HCN: ");
		double chrong = scanner.nextDouble();
		
		double chuvi=(chdai + chrong)*2;
		double dientich=chdai*chrong;
		double canhnhonhat = Math.min(chdai, chrong);
		
		System.out.printf("Chu vi là: %.1f%n", chuvi);
		System.out.printf("Diện tích là: %.1f%n", dientich);
		System.out.printf("Cạnh nhỏ nhất là: %.1f%n", canhnhonhat);
		
		scanner.close();
	}

}
