package entidade;

public class Dolar {
	
	public double cotacao;
	public double quantidade;
	
	public void valorEmReal() {
		double valor = cotacao * quantidade;
		double iof = valor * 0.06;
		valor += iof;
		System.out.println(valor);
	}
	
}
