package fila_prioridade;

import java.time.Duration;
import java.time.LocalTime;

import javax.swing.JOptionPane;

public class CaixaEletronico implements Agencia {
	
	private Double saldo;
	private String extrato;
	
	public Double saque(Double valor){
		if(saldo < valor){
			JOptionPane.showMessageDialog(null, "Operacao invalida");
		}
		else{
			this.saldo -= valor; 
		}
		return this.saldo;
	}
	
	public Double deposito(Double valor){
		this.saldo += valor; 
		return this.saldo;
	}
	
	public void imprimeExtrato(){
		JOptionPane.showMessageDialog(null, extrato);
	}
	
	public void relatorio(Cliente cliente){
		JOptionPane.showMessageDialog(null, cliente.getHoraEntradaFila().toString() + cliente.getHoraSaidaAtendimento().toString()
		+ tempoEsperandoNaFila(cliente.getHoraEntradaFila(), cliente.getHoraSaidaFila())
		+ tempoDeAtendimento(cliente.getHoraEntradaAtendimento(), cliente.getHoraSaidaAtendimento()) + extrato);
	}

	public Duration tempoEsperandoNaFila(LocalTime horaEntrada, LocalTime horaSaida){
		Duration duration = Duration.between(horaEntrada, horaSaida);
		return duration;
	}
	
	public Duration tempoDeAtendimento(LocalTime horaEntrada, LocalTime horaSaida){
		Duration duration = Duration.between(horaEntrada, horaSaida);
		return duration;
	}
}
