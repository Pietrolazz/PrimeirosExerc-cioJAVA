import java.util.Scanner;

public class ex4 {
public static void main(String[]args) {
	
	Scanner ler = new Scanner(System.in);
	
	double valor1, quant1, valor2, quant2, IPI, res;
	int cod1, cod2;
	
	System.out.println("Digite o código, valor e quantidade do produto 1");
	cod1 = ler.nextInt();
	valor1 = ler.nextDouble();
			quant1 = ler.nextDouble();
			
	System.out.println("Digite o código, valor e quantidade do produto 2");
		cod2 = ler.nextInt();
				valor2 = ler.nextDouble();
					quant2 = ler.nextDouble();
	
	System.out.println("Digite o valor do IPI");
				IPI = ler.nextDouble();
	
	res = (valor1 * quant1 + valor2 * quant2) * (IPI / 100 + 1);
	
	System.out.println("O total a ser pago é: "+res);
	}
}
