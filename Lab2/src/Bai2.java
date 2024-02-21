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
		System.out.printf("Nhập số a: ");
		double a= scanner.nextDouble();
		System.out.printf("Nhập số b: ");
		double b= scanner.nextDouble();
		System.out.printf("Nhập số c: ");
		double c= scanner.nextDouble();
		
		if(a==0) {
			PTBN(a,b);
		}else {
			PTBH(a,b,c);
		}
		scanner.close();
	}
	public static void PTBN(double b, double c) {
		if(b==0) {
			if(c==0) {
				System.out.println("Phương trình có vô số nghiệm");
			}else {
				System.out.println("Phương trình vô nghiệm");
			}
		}else {
			double x = -c/b;
			System.out.printf("Phương trình có nghiệm: x = %.1f%n",x);
		}
	}
	public static void PTBH(double a, double b, double c) {
		double del = b*b-4*a*c;
		
		if(del<0) {
			System.out.println("Phương trình vô nghiệm");
		}if(del==0) {
			double x = -b/(2*a);
			System.out.printf("Phương trình có 1 nghiệm phân biệt x = %.1f%n",x);
		}if(del>0) {
			double x1=(-b+Math.sqrt(del)/(2*a));
			double x2=(-b-Math.sqrt(del)/(2*a));
			System.out.printf("Phương trình có 2 nghiệm phân biệt: x1=%.1f, x2=%.1f%n", x1,x2);
		}
			
	}
}
