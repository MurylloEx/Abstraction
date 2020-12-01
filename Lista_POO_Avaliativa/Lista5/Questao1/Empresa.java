package Lista5.Questao1;

import java.util.ArrayList;

public class Empresa {

	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public void adicionarFuncionario(Funcionario func) {
		funcionarios.add(func);
	}

	public void adicionarGerente(Gerente gerente) {
		funcionarios.add(gerente);
	}

	public void obterSalarioFuncionario(String nomeOuCpf) {
		for (Funcionario func : funcionarios) {
			if (func instanceof Funcionario) {
				if (func.getNome().toUpperCase().equals(nomeOuCpf.toUpperCase()) ||
					func.getCpf().toUpperCase().equals(nomeOuCpf.toUpperCase())){
					System.out.println("======================================");
					System.out.println("Nome do funcionário: " + func.getNome());
					System.out.println("Cpf do funcionário: " + func.getCpf());
					System.out.println("Data de nascimento: " + func.getDataNascimento());
					System.out.println("Salário: R$ " + func.calcularSalario());
					System.out.println("======================================\n");
				}	
			}
		}
	}

	public void obterSalarioGerente(String nomeOuCpf) {
		for (Funcionario func : funcionarios) {
			if (func instanceof Gerente) {
				if (func.getNome().toUpperCase().equals(nomeOuCpf.toUpperCase()) ||
					func.getCpf().toUpperCase().equals(nomeOuCpf.toUpperCase())){
					System.out.println("======================================");
					System.out.println("Nome do gerente: " + func.getNome());
					System.out.println("Cpf do gerente: " + func.getCpf());
					System.out.println("Data de nascimento: " + func.getDataNascimento());
					System.out.println("Salário: R$ " + func.calcularSalario());
					System.out.println("======================================\n");
				}
			}
		}
	}

}