
public class BombaCombustivel {
	private String tipo;
	private double vlr;
	private int qtd;
	public void Bomba(String tipo, double vlr, int qtd) {
		this.tipo = tipo;
		this.vlr = vlr;
		this.qtd = qtd;
	}
	public String gettipo() {
		return tipo;
	}
	public void setipo(String tipo) {
		this.tipo = tipo;
	}
	public double getVlr() {
		return vlr;
	}
	public void setVlr(double vlr) {
		this.vlr = vlr;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public double Total() {
		double pagar;
		pagar = qtd * vlr;
		return pagar;
	}
	public String Menu() {
		return "[0] - Gasolina"+
			   "[1] - Etanol";
	}
	
}
