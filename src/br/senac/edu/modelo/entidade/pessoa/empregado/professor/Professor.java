package br.senac.edu.modelo.entidade.pessoa.empregado.professor;

import br.senac.edu.modelo.entidade.pessoa.empregado.Empregado;
import br.senac.edu.modelo.entidade.turma.Turma;

public class Professor extends Empregado {

	private Turma turma;

	public Professor(String nome, byte idade, String cpf, String ctps, float valorHora, Turma turma) {
		
		super(nome, idade, cpf, ctps, valorHora);
		setTurma(turma);

	}

	public Turma getTurma() {
		return turma;

	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public float calcularSalario() {
		//classe concreta nao pode ter metodo abstrato
		return 1500;
	}

}
