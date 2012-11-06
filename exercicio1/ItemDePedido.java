public class ItemDePedido {

	private int quantidade;
	private String codProduto;
	private double valorUnitario;
	
	public ItemDePedido(){
		this(0 , "Vazio" , 0.0);
	}
	
	public ItemDePedido(int qtd, String cod, double valorUni) {
		
		this.quantidade = qtd;
		this.codProduto = cod;
		this.valorUnitario = valorUni;
	}

	
	public int getQuantidade(){
		return this.quantidade;
	}
	
	public void setQuantidade(int qtd){
		this.quantidade = qtd;
	}
	
	public String getCodProduto(){
		return this.codProduto;
	}
	
	public void setCodProduto( String codProduto){
		this.codProduto = codProduto;
	}
	public double getValorUnitario(){
		return this.valorUnitario;
	}
	
	public void setValorUnitario(double valorUni){
		this.valorUnitario = valorUni;
	}
}