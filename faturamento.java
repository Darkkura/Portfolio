package portfolio01;

public class faturamento {
	
	static final Double metaDeVendas = 10000.0;
	
	static final Integer valorMinimoNoEstoque = 10;
	
	String produto;
	
	Integer quantidadeNoEstoque;
	
	Double valorTotalDeVendas;

	String getProduto() {
		return produto;
	}

	void setProduto(String produto) {
		this.produto = produto;
	}

	Integer getQuantidade() {
		return quantidadeNoEstoque;
	}

	void setQuantidade(Integer quantidade) {
		this.quantidadeNoEstoque = quantidade;
	}

	Double getValorTotalDeVendas() {
		return valorTotalDeVendas;
	}

	void setValorTotalDeVendas(Double valorTotalDeVendas) {
		this.valorTotalDeVendas = valorTotalDeVendas;
	}
	
	String retornarMetaDeVendas() {
		if(valorTotalDeVendas > metaDeVendas ) {
			return "Felizmente batemos nossa meta de vendas!";
		}return "Infelizmente não batemos nossa meta!";
	}
		
	String necessidadeDeReporOEstoque() {
		if(quantidadeNoEstoque < valorMinimoNoEstoque ) {
			return "É necessario repor o estoque";
		}return "Não é necessario repor o estoque";
	}

}
