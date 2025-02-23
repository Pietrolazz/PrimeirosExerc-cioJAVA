import java.util.Scanner;

public class ex2 {
	public static void main(String[]agrs) {
		Scanner ler = new Scanner(System.in);
		double n1 = 4, n2 = 5, n3 = 6, med1;
		double n4 = 8, n5 = 9, n6 = 7, med2; 
		double medt;
		
		med1 = (n1 + n2 + n3) / 3;
		med2 = (n4 + n5 + n6) / 3;
		medt = (med1 + med2) / 2;
		
		System.out.println("A média das médias é: "+medt);
	}

}
