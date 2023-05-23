package br.senac.edu.modelo.entidade.turma;

import br.senac.edu.modelo.entidade.pessoa.aluno.Aluno;
import br.senac.edu.modelo.entidade.pessoa.empregado.professor.Professor;

public class Turma {

	private String nome;
	private byte cargaHoraria;
	private Professor professor;
	private Aluno[] alunos;
	private byte quantidadeAlunosMatriculados;

	public Turma(String nome, byte cargaHoraria, byte tamanho) {
		setNome(nome);
		setCargaHoraria(cargaHoraria);
		alunos = new Aluno[tamanho];
		quantidadeAlunosMatriculados = 0;

	}

	public Turma(String nome, byte idade, Professor professor, byte tamanho) {

		setNome(nome);
		setCargaHoraria(cargaHoraria);
		setProfessor(professor);
		alunos = new Aluno[tamanho];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {

		this.nome = nome;
	}

	public byte getCargaHoraria() {

		return cargaHoraria;
	}

	public void setCargaHoraria(byte cargaHoraria) {

		this.cargaHoraria = cargaHoraria;
	}

	public Professor getProfessor() {

		return professor;
	}

	public void setProfessor(Professor professor) {

		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	// se tiver espaço na turma true;
	public boolean inserirAlunos(Aluno aluno) {

		if (quantidadeAlunosMatriculados == alunos.length) {
			return false;
		}

		alunos[quantidadeAlunosMatriculados] = aluno;
		quantidadeAlunosMatriculados++;

		return true;
	}

	public boolean removerAluno(String cpf) {

		if (quantidadeAlunosMatriculados == 0) {
			return false;
		}

		for (int i = 0; i < alunos.length; i++) {

			if (alunos[i] != null && alunos[i].getCPF().equals(cpf)) {

				alunos[i] = null;
				quantidadeAlunosMatriculados--;

				alunos = realocarAlunos(alunos);
			}

		}

		return false;
	}

	public Aluno recuperarAlunos(String cpf) {

		if (quantidadeAlunosMatriculados == 0) {
			return null;
		}

		for (int i = 0; i < alunos.length; i++) {

			if (alunos[i] != null && alunos[i].getCPF().equals(cpf)) {

				return alunos[i];
			}

		}

		return null;

	}

	private Aluno[] realocarAlunos(Aluno[] aluno) {

		Aluno[] alunosRealocados = new Aluno[alunos.length];

		byte indice = 0;

		for (int i = 0; i < alunos.length; i++) {

			if (alunos[i] != null) {

				alunosRealocados[indice] = alunos[i];
				indice++;

			}
		}

		return alunosRealocados;

	}

}
