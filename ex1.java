import java.util.Scanner;

public class ex1 {
	public static void main(String[]agrs) {
		Scanner ler = new Scanner(System.in);
		
		int ano, mes, dia, res;
		
		System.out.println("Digite um ano, um mês e um dia: \n");
		
		ano = ler.nextInt();
		mes = ler.nextInt();
		dia = ler.nextInt();
		
			ano = ano * 365;
			mes = mes * 30;
			
				res = ano + mes + dia;
						System.out.println("O seu total é: "+res);
	}

}
