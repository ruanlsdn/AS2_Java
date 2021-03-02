package Guerra;

public class Casa {
	private String nomeCasa;
	private String nomeResp;
	private int qtdeSoldados;
	private float moedas;

	public Casa(String nomeCasa, String nomeResp, int qtdeSoldados) {
		this.nomeCasa = nomeCasa;
		this.nomeResp = nomeResp;
		this.qtdeSoldados = qtdeSoldados;
	}

	public void calcularMoeda() {
		int multiplicador;
		multiplicador = this.qtdeSoldados / 1000;
		this.moedas = multiplicador * 50;
		this.moedas += this.qtdeSoldados * 0.1;
	}

	public String getNomeCasa() {
		return nomeCasa;
	}

	public String getNomeResp() {
		return nomeResp;
	}

	public int getQtdeSoldados() {
		return qtdeSoldados;
	}

	public float getMoedas() {
		return moedas;
	}

}
