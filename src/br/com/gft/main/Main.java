package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.model.Livros;
import br.com.gft.model.Loja;
import br.com.gft.model.Videogame;

public class Main {

	public static void main(String[] args) {
		
		Livros l1 = new Livros("Harry potter", 40,50, "J. K. Rowling" , "fantasma" ,300);
		Livros l2 = new Livros("Senhor dos aneis", 60,30, "J. K. Rowling" , "fantasma" ,500);
		Livros l3 = new Livros("Java poo", 20 , 50 , "GFT" , "educativo" , 500 );
		
		Videogame PS4 = new Videogame("PS4", 1800 , 100 , "SONY" , "Slim" , false);
		Videogame PS4usado = new Videogame("PS4", 1000 , 7 , "SONY" , "Slim" , true);
		Videogame xbox = new Videogame("xbox", 1500 , 500 , "microsoft" , "one" , false);
		
		List<Livros> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);

		List<Videogame> videogame = new ArrayList<>();
		videogame.add(PS4);
		videogame.add(PS4usado);
		videogame.add(xbox);
		
		Loja americanas = new Loja("Americanas" , "12345678" , livros , videogame);
		
		l2.calculaImposto();
		l3.calculaImposto();
		
		PS4usado.calculaImposto();
		PS4.calculaImposto();
				
		americanas.Listalivros();

		americanas.ListaVideogame();
		
		americanas.calculaPatrimonio();
		}
}