package br.com.gof.builder;

public class MinhaApp {

	public static void main(String[] args) {
		Cozinha cozinha = new Cozinha();
		
		//Builders
		SanduicheBuilder b1 = new HamburguerBuilder();
		SanduicheBuilder b2 = new FishBuilder();
		
		cozinha.fazSanduiche(b1);
		b2.getSanduiche();
	}

}
