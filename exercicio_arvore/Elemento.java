package exercicio_arvore;

public class Elemento <Integer> {
	
	private Integer valor;
	private Elemento <Integer> L;
	private Elemento <Integer> R;

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
		this.L = null;
		this.R = null;
	}

	public Elemento(Integer valor) {
		
		this.valor = valor;
	}

	public Elemento<Integer> getL() {
		return L;
	}

	public void setL(Elemento<Integer> l) {
		L = l;
	}

	public Elemento<Integer> getR() {
		return R;
	}

	public void setR(Elemento<Integer> r) {
		R = r;
	}


	
	

}
