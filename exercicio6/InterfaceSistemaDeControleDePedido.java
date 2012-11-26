package br.ufpb.sistemapedidos;
import java.util.List;
/**
 * Interface que representa um sistema de que controla pedidos
 * @author Igor
 *
 */
interface InterfaceSistemaDeControleDePedido {
	
	/**
	 * Adiciona pedidos no sistema
	 * @param p É o pedido que será adicionado	
	 */
	
	public void adicionaPedido(Pedido p);
	
	/**
	 * Pesquisa um pedido pelo codigo do produto
	 * @param CodProduto O codigo do produto a ser pesquisado
	 * @return retorna um lista com todos os produtos encontrados
	 */
	
	public List<Pedido> pesquisaPedidosIncluindoProdutos(String CodProduto);
	/**
	 * Remove um pedido do sistema
	 * @param numPedido Numero do pedido a ser removido
	 */
	public void removePedido (long numPedido);
	
}
	