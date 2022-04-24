
public class Celula <T>{
	private T informacao ;
	private Celula <T> anterior; 
	private Celula <T> proximo;
	
	public T getInformacao() {
		return informacao;
	}
	public void setInformacao(T informacao) {
		this.informacao = informacao;
	}
	public Celula<T> getAnterior() {
		return anterior;
	}
	public void setAnterior(Celula<T> anterior) {
		this.anterior = anterior;
	}
	public Celula<T> getProximo() {
		return proximo;
	}
	public void setProximo(Celula<T> proximo) {
		this.proximo = proximo;
	} 

}
