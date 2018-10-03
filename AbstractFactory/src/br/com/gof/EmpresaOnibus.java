package br.com.gof;

import java.util.Calendar;

public abstract class EmpresaOnibus {

	public abstract PassagemOnibusUrbano emitePassagemUnibusUrbano(String origem, String destino, Calendar dataHora);
	
	public abstract PassagemOnibusInterestadual emitePassagemUnibusInterestadual(String origem, String destino, Calendar dataHora);
	
}
