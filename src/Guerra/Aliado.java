package Guerra;

import java.util.ArrayList;
import java.util.List;

public class Aliado {
	private List<Casa> casas;
	private int totalSoldados;

	public Aliado() {
		this.casas = new ArrayList<Casa>();
	}

	public void cadastrarCasa(Casa casa) {
		this.casas.add(casa);
	}

	public void somaSoldados() {
		for (Casa c : this.casas) {
			this.totalSoldados += c.getQtdeSoldados();
		}
	}

	public List<Casa> getCasa() {
		return this.casas;
	}

	public int getTotalSoldados() {
		return this.totalSoldados;
	}
}
