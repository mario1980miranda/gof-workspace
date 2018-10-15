
public class MinhaApp {
	
	public static void main(String args[]) {
		//Tomadores de decis�o
		TomadorDeDecisao presidente = new Presidente();
		TomadorDeDecisao vicepresidente = new VicePresidente();
		TomadorDeDecisao diretor = new Diretor();
		TomadorDeDecisao gerente = new Gerente();
		
		gerente.setSucessor(diretor);
		diretor.setSucessor(vicepresidente);
		vicepresidente.setSucessor(presidente);
		
		Compra compra = new Compra(5000F);
		gerente.aprova(compra);
	}
}
