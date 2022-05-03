package fila_prioridade;

import java.time.Duration;
import java.time.LocalTime;

public interface Agencia {

	public Duration tempoEsperandoNaFila(LocalTime horaEntrada, LocalTime horaSaida);
	public Duration tempoDeAtendimento(LocalTime horaEntrada, LocalTime horaSaida);
	public Double saque(Double valor);
	public Double deposito(Double valor);
	public void imprimeExtrato();
	public void relatorio(Cliente cliente);
	
}
