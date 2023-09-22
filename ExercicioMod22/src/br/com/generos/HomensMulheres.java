package br.com.generos;

import java.util.List;


public class HomensMulheres {

    private String nome;
	
	private String sexo;
	
	public HomensMulheres(String nome, String sexo) {
		this.nome = nome;
		this.sexo = sexo;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public List<HomensMulheres> pessoasGenero(){
		
		HomensMulheres pessoa1 = new HomensMulheres("Lucas", "Masculino");
		HomensMulheres pessoa2 = new HomensMulheres("Marcos", "Masculino");
		HomensMulheres pessoa3 = new HomensMulheres("Stefani", "Feminino");
		HomensMulheres pessoa4 = new HomensMulheres("Alexandro", "Masculino");
		HomensMulheres pessoa5 = new HomensMulheres("Alexa", "Feminino");
		HomensMulheres pessoa6 = new HomensMulheres("Mariana", "Feminino");
    	return List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6);
		
	}

	@Override
	public String toString() {
		return " nome= " + nome + " - sexo= " + sexo ;
	}
	
	
	
}

	

