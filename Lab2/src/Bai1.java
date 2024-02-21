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
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập số a: ");
		double a= scanner.nextDouble();
		System.out.printf("Nhập số b: ");
		double b= scanner.nextDouble();
		PTBN(a,b);
		scanner.close();
	}
	public static void PTBN(double a, double b) {
		if(a==0) {
			if(b==0) {
				System.out.println("Phương trình có vô số nghiệm");
			}else {
				System.out.println("Phương trình vô nghiệm");
			}
		}else {
			double x = -b/a;
			System.out.printf("Phương trình có nghiệm: x = %.1f%n",x);
		}
	}
}
