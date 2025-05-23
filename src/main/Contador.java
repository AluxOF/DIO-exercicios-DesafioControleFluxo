package main;
import java.util.Scanner;

import main.execeções.ParametrosInvalidosException;
public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            exception.printStackTrace();
            System.out.println("Operação inválida, o segundo valor deve ser MAIOR que o primeiro!");
		}
		terminal.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
		}

		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for ( int i = 0; (i+1) < contagem; i++) {
            System.out.println("Interação nº " + i);
        }
	}
}
