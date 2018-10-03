package br.com.gof;

import java.util.Calendar;

public class ConcretePAssagemOnibusInterestadual extends PassagemOnibusInterestadual {

	public ConcretePAssagemOnibusInterestadual(String origem, String destino, Calendar dataHoraPartida) {
		super(origem, destino, dataHoraPartida);
	}

	@Override
	public void exibeDetalhes() {
		System.out.println(
			String.format("Passagem de onibus interestadual\n %s para %s, Data/Hora: %s", 
				this.getOrigem(), this.getDestino(), super.df.format(this.getDataHoraPartida().getTime())
			)
		);
	}
}
