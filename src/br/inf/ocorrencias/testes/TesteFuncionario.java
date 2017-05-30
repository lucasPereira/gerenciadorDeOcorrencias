package br.inf.ocorrencias.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.inf.ocorrencias.Funcionario;

public class TesteFuncionario {

	@Test
	public void lucas() throws Exception {
		Funcionario lucas = new Funcionario(1, "Lucas");
		assertEquals("Lucas (1)", lucas.toString());
	}

	@Test
	public void igualdade() throws Exception {
		Funcionario lucas1 = new Funcionario(1, "Lucas");
		Funcionario lucas2 = new Funcionario(1, "Lucas");
		Funcionario luiz = new Funcionario(1, "Luiz");
		assertEquals(lucas1, lucas2);
		assertEquals(lucas1, luiz);
	}

	
	
	
	
	
	
	
	
}
