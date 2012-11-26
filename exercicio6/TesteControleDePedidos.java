package br.ufpb.sistemapedidos;
import java.util.Scanner;


public class TesteControleDePedidos {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("José");
		
		Scanner teclado = new Scanner(System.in);
		
		Pedido p1 = new Pedido(1,c1);
		
		System.out.println("Digite Produto: ");
		String codigo = "";
		
		while(!teclado.nextLine().equals("0")){
			
			System.out.println("Digite Quantidade: ");
			String quantidade = teclado.nextLine();
			System.out.println("Digite Valor: ");
			String valorUnitario = teclado.nextLine();
			
			ItemDePedido itp = new ItemDePedido(codigo, Integer.parseInt(quantidade),Double.parseDouble(valorUnitario));
		
			p1.adicionaItem(itp);
			
		}
		
		System.out.println("Valor Total: R$ " + p1.getValorTotal());
	}

}
