package provaPratica;

import java.util.ArrayList;

public class VendaSite {
	private ArrayList<Ingresso> ingressoEvento;
	private int qtdeMax;

	public int getQtdeMax() {
		return qtdeMax;
	}

	public void setQtdeMax(int qtdeMax) {
		this.qtdeMax = qtdeMax;
	}

	public VendaSite(int qtdeMax) {
		this.ingressoEvento = new ArrayList<Ingresso>();
		this.qtdeMax = qtdeMax;
	}

	public boolean validaQtdeIngresso() {
		if (this.ingressoEvento.size() < this.qtdeMax) {
			return true;
		} else {
			return false;
		}
	}
	public void insereIngressoVenda(Ingresso ingresso) {
		this.ingressoEvento.add(ingresso);
	}


}
