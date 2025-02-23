import java.util.Scanner;

public class ex6 {
public static void main(String[]args) {
	Scanner ler = new Scanner(System.in);
	
	int num, res1, res2;
	
	System.out.println("Digite um número");
	num = ler.nextInt();
	
	res1 = num - 1;
	res2 = num + 1;

	System.out.println("Seu antecessor: " +res1);
	System.out.println("Seu sucessor: " +res2);
	}
}
