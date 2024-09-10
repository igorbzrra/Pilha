package exercicio;

public class PrincipalPilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();

		pilha.empilhar(new Processo(1, "Documento 1"));
		pilha.empilhar(new Processo(2, "Documento 2"));
		pilha.empilhar(new Processo(3, "Documento 3"));

		System.out.println("Elementos na Pilha:");
		pilha.mostrarElementos();

		System.out.println("\nTopo da Pilha: " + pilha.verificarTopo());

		System.out.println("\nProcesso desempilhado: " + pilha.desempilhar());

		System.out.println("\nElementos restantes na Pilha:");
		pilha.mostrarElementos();
	}
}
