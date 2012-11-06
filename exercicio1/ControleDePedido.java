import java.util.List;
import java.util.ArrayList;

public class ControleDePedido implements InterfaceSistemaDeControleDePedido {

	private List<Pedido> pedidos; 
	
	public ControleDePedido(){
		pedidos = new ArrayList<Pedido>();
	}
	
	public int CalculaQuantidadeDePedidosDoCliente(String nomeCliente){
		int cont = 0;
		for( Pedido p : pedidos){
			if (p.getCliente().getNome().equals(nomeCliente)){
				cont++;
			}
		}
		return cont;
	
	}
		
	
	public void adicionaPedido(Pedido p){
		this.pedidos.add(p);
	}
	
	public List<Pedido> pesquisaPedidosIncluindoProdutos(String CodProduto){
		List<Pedido> retorno = new ArrayList<Pedido>();
		for( Pedido p : pedidos){
			List<ItemDePedido> itens = p.getItens();
			for (ItemDePedido it : itens){
				if(it.getCodProduto().equals(CodProduto)){
					retorno.add(p);
				}
			}
		}
		
		return retorno;
	}
				
	
	public void removePedido (long numPedido){
	
		for( Pedido p : pedidos){
			if ((p.getNumeroDoPedido())==(numPedido)){
				pedidos.remove(p);
			}
		}
	}				
					
}
