/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ tên sinh viên: ");
		String hoten = scanner.nextLine();
		System.out.print("Nhập điểm: ");
		double diemtb = scanner.nextDouble();
		scanner.close();
		System.out.printf("%s %.1f điểm",hoten,diemtb);
	}

}
