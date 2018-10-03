package br.com.gof;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinhaApp {

	/**
	 * Abstract Factory é utilizado em familias de produtos bem definidas em contraponto ao factoryMethod (que tem boa expansibilidade)
	 * @param args
	 */
	
	public static void main(String[] args) {
		EmpresaOnibus viacaoXYZ = new ConcreteEmpresaOnibus();
		
		PassagemOnibusUrbano urbano = viacaoXYZ.emitePassagemUnibusUrbano("São Paulo", "Campinas", new GregorianCalendar(2016, Calendar.MARCH, 10, 11, 0));
		
		PassagemOnibusInterestadual interestadual = viacaoXYZ.emitePassagemUnibusInterestadual("Curitiba", "Mafra", new GregorianCalendar(2018, Calendar.NOVEMBER, 15, 8, 0));
		
		urbano.exibeDetalhes();
		interestadual.exibeDetalhes();
	}

}
