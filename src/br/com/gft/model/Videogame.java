package br.com.gft.model;

public class Videogame extends Produto {
	
	private String marca;
	private String modelo;
	private boolean usado;
	
	public Videogame() {
		
	}
	
	public Videogame(String nome, double preco, int qtd, String marca, String modelo,boolean usado) {
		super(nome, preco, qtd);
		this.modelo = modelo;
		this.marca = marca;
		this.usado = usado;		
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return usado;
	}



	public void setUsado(boolean usado) {
		this.usado = usado;
	}

	public void calculaImposto() {
		
		if(this.usado == false)
		{
			System.out.println("Imposto sobre " + this.getNome() + " " + this.getModelo() + " R$:" + (this.getPreco()*0.45));
			
		}
		else
		{
			System.out.println("Imposto sobre " + this.getNome() + " " + this.getModelo() + " Usado " + " R$:" + (this.getPreco()*0.25));
		}
			
	}
	
}
