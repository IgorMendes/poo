import java.util.List;

interface InterfaceSistemaDeControleDePedido {

	public void adicionaPedido(Pedido p);
	
	public List<Pedido> pesquisaPedidosIncluindoProdutos(String CodProduto);
	
	public void removePedido (long numPedido);
	
}
	