package br.senac.edu.modelo.entidade.pessoa.empregado;

import br.senac.edu.modelo.entidade.pessoa.Pessoa;

public abstract class Empregado extends Pessoa {

	private String ctps;
	private float valorHora;

	protected Empregado(String nome, byte idade, String cpf, String ctps, float valorHora) {

		super(nome, idade, cpf);
		setCtps(ctps);
		setValorHora(valorHora);
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {

		this.ctps = ctps;
	}
	
	public float getValorHora() {
		return valorHora;
	}
	
	public void setValorHora(float valorHora) {
		
		this.valorHora = valorHora;
	}

	public abstract float calcularSalario();
	
	public float calcularSalrio(int quantidadeHorasTrabalhadas) {
		
		return quantidadeHorasTrabalhadas * valorHora;
	}
	
}

