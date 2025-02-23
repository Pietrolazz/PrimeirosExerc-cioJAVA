import java.util.Scanner;

public class ex3 {
public static void main(String[]agrs) {
	Scanner ler = new Scanner(System.in);
	
	
	System.out.println("Digite o salário p/ ser reajustado");
	double sal = ler.nextDouble();
	sal = (sal * (1.0/100)) + sal;
	System.out.println("O seu salário reajustado é: "+sal);
}
	
}
