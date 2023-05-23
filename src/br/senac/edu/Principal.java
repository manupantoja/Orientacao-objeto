package br.senac.edu;
import br.senac.edu.modelo.entidade.pessoa.aluno.Aluno;
import br.senac.edu.modelo.entidade.pessoa.empregado.professor.Professor;


public class Principal {

	public static void main(String[] args) {

		Aluno aluno01 = new Aluno("Maria", (byte) 20, "123.456.789.12");
		Professor professor01 = new Professor("Ribamar",(int) 202);

		System.out.println("""
				nome do aluno : %s
				idade do aluno : %d
				cpf do aluno : %s
				""".formatted(aluno01.getNome(), aluno01.getIdade(), aluno01.getCPF()));
		
		professor01.setNome("Ribamar");
		professor01.setTurma(202);

	}

}
