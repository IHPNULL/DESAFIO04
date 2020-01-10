package br.com.gft.model;

import java.util.List;

public class Loja {
	
	private String nomel;
	private String cnpj;
	private List<Livros> Livros;
	private List<Videogame> Videogame;
	
	public Loja() {
		
	}
	
	public Loja(String nomel,String cnpj,List<Livros> livros, List<Videogame> Videogame) {
		this.nomel = nomel;
		this.cnpj = cnpj;
		this.Livros = livros;
		this.Videogame = Videogame;
	}

	public String getNomel() {
		return nomel;
	}

	public void setNomel(String nomel) {
		this.nomel = nomel;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livros> getLivros() {
		return Livros;
	}

	public void setLivros(List<Livros> livros) {
		Livros = livros;
	}

	public List<Videogame> getVideogame() {
		return Videogame;
	}

	public void setVideogame(List<Videogame> videogame) {
		Videogame = videogame;
	}
	
	public void Listalivros() {

		System.out.println("---------------------------------------------");
		if(Livros.size() != 0) {
			System.out.println("a loja tem estes livros em estoque:");
			for(int i = 0;i<Livros.size();i++) {
				System.out.println( "Nome: " + Livros.get(i).getNome() + ", preço:  " + Livros.get(i).getPreco() + ", quantidade:  " + Livros.get(i).getQtd());
			}		
		}
		else {
			System.out.println("A loja nao tem livros em estoque");
		}
	}

	public void ListaVideogame() {
		System.out.println("---------------------------------------------");
		if(Videogame.size() != 0) {
			System.out.println("a loja tem estes video games em estoque:");
			for(int i = 0 ; i<Videogame.size() ; i++) {
				System.out.println( "Nome: " + Videogame.get(i).getNome() + ", preço:  " + Videogame.get(i).getPreco() + ", quantidade:  " + Videogame.get(i).getQtd());
			}					
		}
	}

	public void calculaPatrimonio() {
		System.out.println("---------------------------------------------");

		double patrimoniov = 0;
		double patrimoniol = 0;
		
		for(int i = 0 ; i < Videogame.size() ; i++) {
			patrimoniov += (Videogame.get(i).getPreco()*Videogame.get(i).getQtd());
			}
		
		for(int i = 0 ; i < Livros.size() ; i++) {
			patrimoniol += (Livros.get(i).getPreco()*Livros.get(i).getQtd());
			}
		
		System.out.println("Patrimonio da loja : " + (patrimoniov+patrimoniol));
		
		
		
		
	}
	
	

}
