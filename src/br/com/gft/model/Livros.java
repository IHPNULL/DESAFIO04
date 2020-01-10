package br.com.gft.model;

public class Livros extends Produto {

	private String autor;
	private String tema;
	private int qtdpags;
	
	
	public Livros() {
		// TODO Auto-generated constructor stub
	}
	
	public Livros(String nome,double preco, int qtd, String autor, String tema, int qtdpags) {
		super(nome,preco,qtd);
		this.autor = autor;
		this.qtdpags = qtdpags;
		this.tema = tema;
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdpags() {
		return qtdpags;
	}

	public void setQtdpags(int qtdpags) {
		this.qtdpags = qtdpags;
	}

	public void calculaImposto() {
		
		if(tema ==  "educativo")
			System.out.println("Livro educatico nao tem imposto: " + this.getNome());
		else
		{
			System.out.println("Imposto sobre o livro: R$ " + (this.getPreco()*0.1));
			this.setPreco(this.getPreco() + (this.getPreco()*0.1));
		}
	}	
}