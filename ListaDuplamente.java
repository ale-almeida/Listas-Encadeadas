
public class ListaDuplamente <T> {
// Lista duplamente encadeada (Adicionar no inicio, adicionar no fim, remover no inicio, remover no fim, listar)
	private Celula inicio, fim;
	int tamanho;

	public void inserirInicio(T info) {
		Celula celula = new Celula();
		celula.setInformacao(info);
		celula.setAnterior(null);
		celula.setProximo(inicio);
		if(inicio!= null) {
			inicio.setAnterior(celula);
		}
		inicio = celula;
		if(tamanho == 0){
			fim  = inicio;
		}
		tamanho++;
	}
	public void retirarInicio() {
		if (inicio == null) {
			inicio = null;
		}
		inicio.getInformacao();
		inicio = inicio.getProximo();
		if(inicio!= null) {
			inicio.setAnterior(null);
			tamanho--;
		}else {
			fim = null;
			tamanho--;
		}

	}
	public void inserirFim(Celula info) {
		Celula celula = new Celula();
		celula.setInformacao(info);
		celula.setProximo(null);
		celula.setAnterior(fim);
		if (fim != null){
			fim.setProximo(celula);
		}
		fim = celula;
		if(tamanho == 0) {
			inicio = fim;
		}
		tamanho++;
	}
	public void retirarFim() {
		if (inicio == null) {
			inicio = null;
		}
		fim.getInformacao();
		fim = fim.getAnterior();

		if(fim!= null) {
			fim.setProximo(null);
			tamanho--;
		}
	
	}
	public String toString () {
		String imprime = "Tamanho da lista: [" + tamanho + "] " + "\n";
		Celula valor = inicio;
		while (valor !=null) {
			imprime += valor.getInformacao() + " ";
			valor = valor.getProximo();
		}
		return imprime;
	}

}
