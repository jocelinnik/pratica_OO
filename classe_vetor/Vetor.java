import java.util.*;

class Vetor{
	private int tamanho;
	private int[] vet;

	//METODO CONSTRUTOR QUE RECEBE A DIMENSAO DE UM VETOR E INICIALIZA OS ELEMENTOS COM ZERO
	Vetor(int tamVetor){
		this.setTamanho(tamVetor);
		this.vet = new int[tamanho];

		int cont;
		for(cont=0;cont<this.getTamanho();cont++){
			this.setElemento(cont,0);
		}
	}

	//METODO QUE RETORNA O TAMANHO DO VETOR
	public int getTamanho(){
		return this.tamanho;
	}

	//METODO QUE RETORNA O ELEMENTO DE UMA DADA POSICAO DO VETOR
	public int getElemento(int posicao){
		return this.vet[posicao];
	}

	//METODO QUE MODIFICA O TAMANHO DO VETOR
	public void setTamanho(int newTamanho){
		this.tamanho = newTamanho;
	}

	//METODO QUE MODIFICA O ELEMENTO DE UMA DADA POSICAO DO VETOR 
	public void setElemento(int posicao, int newElemento){
		this.vet[posicao] = newElemento;
	}

	//METODO QUE IMPRIME OS ELEMENTOS DO VETOR
	public void imprimeVetor(){
		int cont;

		System.out.print("[ ");
		for(cont=0;cont<this.getTamanho()-1;cont++){
			System.out.print(this.getElemento(cont) + " ] [ ");
		}
		System.out.println(this.getElemento(this.getTamanho()-1) + " ]");
	}

	//METODO QUE INICIALIZA OS ELEMENTOS DO VETOR COM NUMEROS RANDOMICOS
	public void inicializaRandomico(){
		Random gerador = new Random();
		int cont;

		for(cont=0;cont<this.getTamanho();cont++){
			this.setElemento(cont,gerador.nextInt(10));
		}
	}

	//METODO QUE REALIZA A SOMA DOS ELEMENTOS DE DOIS VETORES PARA UM TERCEIRO VETOR
	public void somaVetor(Vetor vet1, Vetor vet2){
		int cont;

		for(cont=0;cont<this.getTamanho();cont++){
			int soma = vet1.getElemento(cont) + vet2.getElemento(cont);
			this.setElemento(cont,soma);
			soma = 0;
		}
	}

	//METODO QUE REALIZA A SUBTRACAO DOS ELEMENTOS DE DOIS VETORES PARA UM TERCEIRO VETOR
	public void subtraiVetor(Vetor vet1, Vetor vet2){
		int cont, subtrai;

		for(cont=0;cont<this.getTamanho();cont++){
			subtrai = vet1.getElemento(cont) - vet2.getElemento(cont);
			this.setElemento(cont,subtrai);
			subtrai = 0;
		}	
	}

	//METODO QUE RETORNA O PRODUTO ESCALAR ENTRE DOIS VETORES DADOS
	public int produtoEscalar(Vetor vet1, Vetor vet2){
		int resposta, cont;

		resposta = 0;
		for(cont=0;cont<vet1.getTamanho();cont++){
			resposta = resposta + (vet1.getElemento(cont) * vet2.getElemento(cont));
		}

		return resposta;
	}
}