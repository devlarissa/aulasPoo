package fila_prioridade;

import java.time.LocalTime;

public class Cliente {
	private String nome;
	private String numeroConta;
	private boolean prioridade;
	
	private LocalTime horaEntradaFila;
	private LocalTime horaSaidaFila;
	
	private LocalTime horaEntradaAtendimento;
	private LocalTime horaSaidaAtendimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public boolean isPrioridade() {
		return prioridade;
	}
	public void setPrioridade(boolean prioridade) {
		this.prioridade = prioridade;
	}
	public LocalTime getHoraEntradaFila() {
		return horaEntradaFila;
	}
	public void setHoraEntradaFila(LocalTime horaEntradaFila) {
		this.horaEntradaFila = horaEntradaFila;
	}
	public LocalTime getHoraSaidaFila() {
		return horaSaidaFila;
	}
	public void setHoraSaidaFila(LocalTime horaSaidaFila) {
		this.horaSaidaFila = horaSaidaFila;
	}
	public LocalTime getHoraEntradaAtendimento() {
		return horaEntradaAtendimento;
	}
	public void setHoraEntradaAtendimento(LocalTime horaEntradaAtendimento) {
		this.horaEntradaAtendimento = horaEntradaAtendimento;
	}
	public LocalTime getHoraSaidaAtendimento() {
		return horaSaidaAtendimento;
	}
	public void setHoraSaidaAtendimento(LocalTime horaSaidaAtendimento) {
		this.horaSaidaAtendimento = horaSaidaAtendimento;
	}
}
