package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio07 {
	// resolva um sistema de equações lineares
	
	public static void main(String[] args) {
		double a, b, c, d, e, f, x, y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o coeficiente a: ");
		a = leia.nextDouble();
		
		System.out.println("Insira o coeficiente b: ");
		b = leia.nextDouble();
		
		System.out.println("Insira o coeficiente c: ");
		c = leia.nextDouble();
		
		System.out.println("Insira o coeficiente d: ");
		d = leia.nextDouble();
		
		System.out.println("Insira o coeficiente e: ");
		e = leia.nextDouble();
		
		System.out.println("Insira o coeficiente f: ");
		f = leia.nextDouble();
		
		x = ((c*e) - (b*f))/((a*e) - (b*d));
		y = ((a*f) - (c*d))/((a*e) - (b*d));
		
		System.out.println("De acordo com os coeficientes fornecidos, o ponto (x, y) é igual a ("
							+ x + ", " + y + ").");
		
		leia.close();

	}

}
