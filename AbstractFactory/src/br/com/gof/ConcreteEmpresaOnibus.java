package br.com.gof;

import java.util.Calendar;

public class ConcreteEmpresaOnibus extends EmpresaOnibus {

	@Override
	public PassagemOnibusUrbano emitePassagemUnibusUrbano(String origem, String destino, Calendar dataHora) {
		
		return new ConcretePassagemOnibusUrbano(origem, destino, dataHora);
	}

	@Override
	public PassagemOnibusInterestadual emitePassagemUnibusInterestadual(String origem, String destino,
			Calendar dataHora) {

		return new ConcretePAssagemOnibusInterestadual(origem, destino, dataHora);
	}

}
