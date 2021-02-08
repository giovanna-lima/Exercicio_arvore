package exercicio_arvore;

public class Arvore <Integer extends Comparable>  {
	
	private Elemento <Integer> raiz;
	
	
	public void emOrdem (Elemento<Integer> atual) {
		if(atual != null) {
			emOrdem(atual.getL());
			System.out.println(atual.getValor());
			emOrdem(atual.getR());
			
		}
		
	}
	
	public void preOrdem (Elemento<Integer> atual) {
		if(atual != null) {
			System.out.println(atual.getValor());
			preOrdem(atual.getL());
			preOrdem(atual.getR());
			
		}
		
	}
	
	public void posOrdem (Elemento<Integer> atual) {
		if(atual != null) {
			posOrdem(atual.getL());
			posOrdem(atual.getR());
			System.out.println(atual.getValor());
			
		}
		
	}
	
	
	public Arvore () {
		this.raiz= null;
	}
	
  public Elemento<Integer> getRaiz() {
		return raiz;
	}

	public void setRaiz(Elemento<Integer> raiz) {
		this.raiz = raiz;
	}

public void add(Integer valor) { 
	Elemento <Integer> n1 = new Elemento <Integer>(valor);
	
	if(raiz ==null) {
		this.raiz= n1;
	}
	else {
		Elemento <Integer> atual = this.raiz;
		
		while(true) {
			
			if(n1.getValor() .compareTo(atual.getValor())== -1 ){
				if (atual.getL() !=null) {
					atual = atual.getL();
				} else {
					atual.setL(n1);	
					break;
				}
			    } 
			else {
			 if (atual.getR() !=null) {
						atual = atual.getR();
					} else {
						atual.setR(n1);	
						break;
					}	
				
			}
		}
	}
	
	
	
}


	
	
	
	
	
  }

