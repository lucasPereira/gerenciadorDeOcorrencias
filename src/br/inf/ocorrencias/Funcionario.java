package br.inf.ocorrencias;

import com.sun.org.apache.bcel.internal.generic.IUSHR;

public class Funcionario {

	private Integer identificador;
	private String nome;

	public Funcionario(Integer identificador, String nome) {
		this.identificador = identificador;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%s)", nome, identificador);
	}
	
	@Override
	public boolean equals(Object objeto) {
		if (objeto instanceof Funcionario) {
			Funcionario funcionario = (Funcionario) objeto;
			return identificador.equals(funcionario.identificador);
		}
		return super.equals(objeto);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
