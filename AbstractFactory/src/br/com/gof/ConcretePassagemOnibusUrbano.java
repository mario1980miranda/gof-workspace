package br.com.gof;

import java.util.Calendar;

public class ConcretePassagemOnibusUrbano extends PassagemOnibusUrbano {

	public ConcretePassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida) {
		super(origem, destino, dataHoraPartida);
	}

	public void exibeDetalhes() {
		System.out.println(
			String.format("Passagem de onibus urbano\n %s para %s, Data/Hora: %s", 
				this.getOrigem(), this.getDestino(), super.df.format(this.getDataHoraPartida().getTime())
			)
		);
	}

}
