
public class TesteControleDePedidos {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Joao");
		
		ItemDePedido itp1 = new ItemDePedido(1,"Guarana",4.0);
		ItemDePedido itp2 = new ItemDePedido(2,"Pizza",20.0);
	
		Pedido p1 = new Pedido(1,c1);
		Pedido p2 = new Pedido(2,c1);
		
		p1.adicionaItem(itp1);
		p2.adicionaItem(itp2);
		
		ControleDePedido controle = new ControleDePedido();
		
		controle.adicionaPedido(p1);
		controle.adicionaPedido(p2);
		
		
		if(controle.CalculaQuantidadeDePedidosDoCliente(c1.getNome())== 2){
			System.out.println("Programa Correto");
			
		}else{
			System.out.println("Programa Incorreto");
		}
		
	
		
		
	
		
		
		
		
		
		

	}

}
