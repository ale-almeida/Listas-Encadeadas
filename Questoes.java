
public class Questoes {

	public static void main(String[] args) {
		ListaSimplismente<Integer> lista = new ListaSimplismente<>();
		ListaDuplamente<Integer> lista2 = new ListaDuplamente<>();
		for (int i = 0; i < 5; i++) {
			lista.adiciona(i);	
		}
		System.out.println("Adicionado no Inicio:");
		System.out.println(lista);
		for (int i = 0; i < 3; i++) {
			lista.removerInicio();	
		}
		System.out.println("Removendo no Inicio:");
		System.out.println(lista);
	System.out.println("------------------------------------------\n");
	for (int i = 0; i < 5; i++) {
		lista2.inserirInicio(i);	
	}
	System.out.println("Adicionado no Inicio:");
	System.out.println(lista2);
	for (int i = 0; i < 2; i++) {
		lista2.retirarInicio();	
	}
	System.out.println("retirado 2 no Inicio:");
	System.out.println(lista2);
	
	lista2.retirarFim();
	System.out.println("retirado no 1 no fim:");
	System.out.println(lista2);
}
}
