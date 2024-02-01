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
		
		System.out.print("Nhập chiều dài khối lập phương: ");
		double chdai = scanner.nextDouble();
		
		System.out.print("Nhập chiều rộng khối lập phương: ");
		double chrong = scanner.nextDouble();
		
		System.out.print("Nhập chiều cao khối lập phương: ");
		double chcao = scanner.nextDouble();
		
		double thetich = chdai*chrong*chcao;
		
		System.out.printf("Thể tích khối lập phương: %.1f%n", thetich);
		scanner.close();
		}

}
