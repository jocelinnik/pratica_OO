import java.util.*;

class Matriz{
	private int numLinhas;
	private int numColunas;
	private int[][] mat;

	//METODO CONSTRUTOR QUE RECEBE AS DIMENSOES DA MATRIZ E INICIALIZA TODOS OS ELEMENTOS COM ZERO
	Matriz(int numLinhas, int numColunas){
		this.setNumLinhas(numLinhas);
		this.setNumColunas(numColunas);
		this.mat = new int[numLinhas][numColunas];

		int conti, contj;
		for(conti=0;conti<this.getNumLinhas();conti++){
			for(contj=0;contj<this.getNumColunas();contj++){
				this.setElemento(conti,contj,0);
			}
		}
	}

	Matriz(int ordem){
		this.setNumLinhas(ordem);
		this.setNumColunas(ordem);
		this.mat = new int[ordem][ordem];

		int conti, contj;
		for(conti=0;conti<this.getNumLinhas();conti++){
			for(contj=0;contj<this.getNumColunas();contj++){
				this.setElemento(conti,contj,0);
			}
		}
	}

	//METODO QUE RETORNA O NUMERO DE LINHAS DA MATRIZ
	public int getNumLinhas(){
		return this.numLinhas;
	}

	//METODO QUE RETORNA O NUMERO DE COLUNAS DA MATRIZ
	public int getNumColunas(){
		return this.numColunas;
	}

	//METODO QUE RETORNA O ELEMENTO DE UMA DADA POSICAO DA MATRIZ
	public int getElemento(int linha, int coluna){
		return this.mat[linha][coluna];
	}

	//METODO QUE MODIFICA O VALOR DO NUMERO DE LINHAS DA MATRIZ
	public void setNumLinhas(int newLinhas){
		this.numLinhas = newLinhas;
	}

	//METODO QUE MODIFICA O VALOR DO NUMERO DE COLUNAS DA MATRIZ
	public void setNumColunas(int newColunas){
		this.numColunas = newColunas;
	}

	//METODO QUE MODIFICA O ELEMENTO DE UMA DADA POSICAO DA MATRIZ
	public void setElemento(int linha, int coluna, int elemento){
		this.mat[linha][coluna] = elemento;
	}

	//METODO QUE INICIALIZA TODOS OS ELEMENTOS DA MATRIZ COM NUMEROS RANDOMICOS
	public void inicializaRandomico(){
		Random gerador = new Random();
		int conti, contj;

		for(conti=0;conti<this.getNumLinhas();conti++){
			for(contj=0;contj<this.getNumColunas();contj++){
				this.setElemento(conti,contj,gerador.nextInt(10));
			}
		}
	}

	public void iniciaRandom(int limite){
		Random gerador = new Random();
		int conti, contj;

		for(conti=0;conti<this.getNumLinhas();conti++){
			for(contj=0;contj<this.getNumColunas();contj++){
				this.setElemento(conti,contj,gerador.nextInt(limite));
			}
		}	
	}

	public void inicializaCom(int num){
		int conti, contj;

		for(conti=0;conti<this.getNumLinhas();conti++){
			for(contj=0;contj<this.getNumColunas();contj++){
				this.setElemento(conti,contj,num);
			}
		}
	}

	public void copiaMatriz(Matriz mat){
		int conti, contj;

		for(conti=0;conti<this.getNumLinhas();conti++){
			for(contj=0;contj<this.getNumColunas();contj++){
				this.setElemento(conti,contj,mat.getElemento(conti,contj));
			}
		}
	}

	public void iniciaPelaMatriz(Matriz mat){
		this.copiaMatriz(mat);
	}

	//METODO QUE IMPRIME OS ELEMENTOS DA MATRIZ
	public void imprimeMatriz(){
		int conti, contj;

		for(conti=0;conti<this.getNumLinhas();conti++){
			System.out.print("| ");
			for(contj=0;contj<this.getNumColunas()-1;contj++){
				System.out.print(this.getElemento(conti,contj) + " | ");
			}
			System.out.println(this.getElemento(conti,this.getNumColunas()-1) + " |");
		}
	}

	//METODO QUE REALIZA A SOMA DOS ELEMENTOS DE DUAS MATRIZES PARA UMA TERCEIRA MATRIZ
	public void somaMatriz(Matriz mat1, Matriz mat2){
		int conti, contj;

		for(conti=0;conti<mat1.getNumLinhas();conti++){
			for(contj=0;contj<mat1.getNumColunas();contj++){
				this.setElemento(conti,contj,mat1.getElemento(conti,contj)+mat2.getElemento(conti,contj));
			}
		}
	}

	//METODO QUE REALIZA A SUBTRACAO DOS ELEMENTOS DE DUAS MATRIZES PARA UMA TERCEIRA MATRIZ
	public void subtraiMatriz(Matriz mat1, Matriz mat2){
		int conti, contj;

		for(conti=0;conti<mat1.getNumLinhas();conti++){
			for(contj=0;contj<mat1.getNumColunas();contj++){
				this.setElemento(conti,contj,mat1.getElemento(conti,contj)-mat2.getElemento(conti,contj));
			}
		}
	}

	//METODO QUE REALIZA A MULTIPLICACAO DE UM NUMERO INTEIRO POR TODOS OS ELEMENTOS DA MATRIZ
	public void multiplicaNumPorMatriz(int num){
		int conti, contj;

		for(conti=0;conti<this.getNumLinhas();conti++){
			for(contj=0;contj<this.getNumColunas();contj++){
				this.setElemento(conti,contj,num*this.getElemento(conti,contj));
			}
		}
	}

	//METODO QUE REALIZA A MULTIPLICACAO DOS ELEMENTOS DE DUAS MATRIZES PARA UMA TERCEIRA MATRIZ
	public void multiplicaMatriz(Matriz mat1, Matriz mat2){
		int conti, contj, aux, somatorio;

		for(conti=0;conti<this.getNumLinhas();conti++){
			for(contj=0;contj<this.getNumColunas();contj++){
				somatorio = 0;
				for(aux=0;aux<mat1.getNumLinhas();aux++){
					somatorio = somatorio + (mat1.getElemento(conti,aux) * mat2.getElemento(aux,contj));
				}
				this.setElemento(conti,contj,somatorio);
			}
		}
	}
}