package streams;

public class Ecommerce {
	
	private String produto;
	private double desconto;
	private double frete;
	
	public Ecommerce(String produto, double desconto, double frete) {
		this.produto = produto;
		this.desconto = desconto;
		this.frete = frete;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getFrete() {
		return frete;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}
	
	

}
