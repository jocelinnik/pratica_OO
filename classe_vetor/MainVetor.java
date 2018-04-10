import java.util.*;

class MainVetor{

	//CLASSE DE TESTE PARA A CLASSE VETOR CRIADA
	public static void main(String[] args) {
		Vetor vet1, vet2, vet3;

		vet1 = new Vetor(10);
		vet2 = new Vetor(10);
		vet3 = new Vetor(10);

		vet1.inicializaRandomico();
		System.out.println("VETOR 1");
		vet1.imprimeVetor();
		System.out.println();

		vet2.inicializaRandomico();
		System.out.println("VETOR 2");
		vet2.imprimeVetor();
		System.out.println();

		vet3.somaVetor(vet1,vet2);
		System.out.println("VETOR 1 SOMADO COM O VETOR 2");
		vet3.imprimeVetor();
		System.out.println();

		vet1.subtraiVetor(vet3,vet2);
		System.out.println("VETOR 1 SUBTRAIDO DO VETOR 2");
		vet1.imprimeVetor();
		System.out.println();

		System.out.println("PRODUTO ESCALAR ENTRE OS VETORES 1 E 2: " + vet1.produtoEscalar(vet1,vet2));
	}
}