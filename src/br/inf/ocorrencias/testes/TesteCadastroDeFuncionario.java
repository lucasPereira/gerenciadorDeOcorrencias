package br.inf.ocorrencias.testes;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.inf.ocorrencias.ExcecaoFuncionarioComIdentificadorJaCadastrado;
import br.inf.ocorrencias.Funcionario;
import br.inf.ocorrencias.Gerenciador;

public class TesteCadastroDeFuncionario {

	private Gerenciador gerenciador;

	@Before
	public void configurar() {
		gerenciador = new Gerenciador();
	}

	@Test
	public void semFuncionarioCadastrado() throws Exception {
		List<Funcionario> funcionarios = gerenciador.obterFuncionarios();
		assertEquals(0, funcionarios.size());
	}

	@Test
	public void cadastrarLucas() throws Exception {
		Funcionario lucas = new Funcionario(1, "Lucas");
		gerenciador.cadastrarFuncionario(lucas);
		List<Funcionario> funcionarios = gerenciador.obterFuncionarios();
		assertEquals(1, funcionarios.size());
		assertEquals(lucas, funcionarios.get(0));
	}

	@Test(expected = ExcecaoFuncionarioComIdentificadorJaCadastrado.class)
	public void cadastrarDoisFuncionariosComMesmoIdentificador()
			throws Exception {
		Funcionario lucas = new Funcionario(1, "Lucas");
		Funcionario luiz = new Funcionario(1, "Luiz");
		gerenciador.cadastrarFuncionario(lucas);
		gerenciador.cadastrarFuncionario(luiz);
	}

	
	
	
	
	
	
	
	
}
