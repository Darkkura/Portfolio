package portfolio01;

import java.util.Scanner;

public class ExecutarCodigo {
	public static void main(String[] args) {
		faturamento faturamento = new faturamento();
		
		Scanner scanner = new Scanner(System.in);
		
		imprimirEContinuarNaMesmaLinha("Digite o nome do produto: ");
		faturamento.produto = scanner.nextLine();
		
		imprimirEContinuarNaMesmaLinha("Digite a quantidade no estoque: ");
		faturamento.quantidadeNoEstoque = scanner.nextInt();
		
		imprimirEContinuarNaMesmaLinha("Digite o valor total das vendas: ");
		faturamento.valorTotalDeVendas = scanner.nextDouble();
		
		imprimirLinha();
		
		imprimir("O produto: " + faturamento.getProduto() + " Faturou " + faturamento.getValorTotalDeVendas());
		
		imprimir(faturamento.retornarMetaDeVendas());
		
		imprimir(faturamento.necessidadeDeReporOEstoque());
		
		scanner.close();
	}
	
	static void imprimir(String string) {
		System.out.println(string);
	}
	
	static void imprimirEContinuarNaMesmaLinha(String string) {
		System.out.print(string);
	}
	
	static void imprimirLinha() {
		System.out.println("-----------------------------------------------------------------");
	}
}
