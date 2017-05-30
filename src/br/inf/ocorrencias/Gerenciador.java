package br.inf.ocorrencias;

import java.util.LinkedList;
import java.util.List;

public class Gerenciador {

	private List<Funcionario> funcionarios;

	public Gerenciador() {
		funcionarios = new LinkedList<>();
	}

	public List<Funcionario> obterFuncionarios() {
		return funcionarios;
	}

	public void cadastrarFuncionario(Funcionario funcionario) {
		if (funcionarios.contains(funcionario)) {
			throw new ExcecaoFuncionarioComIdentificadorJaCadastrado();
		}
		funcionarios.add(funcionario);
	}

}






