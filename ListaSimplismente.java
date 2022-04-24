
public class ListaSimplismente <T>{
	//Lista simplesmente encadeada (adicionar, remover e listar)
	private No primeiro;
	private No ultimo;
	private int tamanho;

	public void adiciona(T elemento) {
		No<T> celula = new No <T> (elemento);
		celula.setValor(elemento);
		if(primeiro == null && ultimo == null) {
			primeiro  = celula;
			ultimo = celula;
			tamanho ++;
		}else {
			ultimo.setProximo(celula);
			ultimo = celula;
			tamanho ++;
		}

	}
	public void removerInicio() {
		if(primeiro == null && ultimo == null) {
			primeiro = ultimo =null;	
		}else {
			primeiro = primeiro.getProximo();
			tamanho --;
		}		
	}
	
	@Override
	public String toString() {
		String imprime = "Tamanho da lista: [" + tamanho + "] " + "\n";
		No valor = primeiro;
		while (valor !=null) {
			imprime += valor.getValor() + " ";
			valor = valor.getProximo();
		}
		return imprime;
	}

}
