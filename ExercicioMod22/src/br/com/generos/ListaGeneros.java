package br.com.generos;

import java.util.List;
import java.util.stream.Stream;




public class ListaGeneros {

	public static void main(String[] args) {
		
	System.out.println(" *** Lista por sexo Feminino ***");	
	
		List<HomensMulheres> lista = new HomensMulheres(null, null).pessoasGenero();
		  lista.stream()
		 .filter(genero -> genero.getSexo().equals("Feminino"))
	     .forEach(p -> System.out.println(p.getNome()));
		  
		  System.out.println(" *** Lista separada por vírgula ***");
	     
		  System.out.println(lista.toString());
	  }
	  
	  

}
