package br.ufpb.sistemapedidos;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class ControleDePedido implements InterfaceSistemaDeControleDePedido {

	private List<Pedido> pedidos;
	private GravadorDePedidos gravador;

	public ControleDePedido(){
		
		gravador = new GravadorDePedidos();
		
	}
	
	public void recuperaPedidos(){
		try{
			pedidos = gravador.lePedidos();
		}catch(IOException e){
			System.err.println(e.getMessage());
		}
	}
	
	public void salvaPedidos(){
		
		try{
			
			gravador.gravaPedidos(pedidos);
			
		}catch(IOException e){
			System.err.println(e.getMessage());
			System.out.println("Novo arquivo criado");
			this.pedidos = new ArrayList<Pedido>();
		}
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
		}return retorno;
	}

	public void removePedido(long numPedido) {
		for (Pedido p: this.pedidos){
			if (p.getNumeroDoPedido()== numPedido){
				this.pedidos.remove(p);
				break;
		
	}
}
	}
}
				
