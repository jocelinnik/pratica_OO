import java.util.*;

class MainMatriz{

	//CLASSE DE TESTE PARA A CLASSE MATRIZ CRIADA
	public static void main(String[] args) {
		Matriz mat1, mat2, mat3, mat4, mat5;

		mat1 = new Matriz(5,5);
		mat2 = new Matriz(5,5);
		mat3 = new Matriz(5,5);
		mat4 = new Matriz(5,5);
		mat5 = new Matriz(5,5);

		mat1.inicializaRandomico();
		mat2.inicializaRandomico();

		System.out.println("MATRIZ 1");
		mat1.imprimeMatriz();
		System.out.println();
		System.out.println("MATRIZ 2");
		mat2.imprimeMatriz();
		System.out.println();

		System.out.println("MATRIZ 1 MULTIPLICADA PELA MATRIZ 2");
		mat5.multiplicaMatriz(mat1,mat2);
		mat5.imprimeMatriz();
		System.out.println();

		mat3.somaMatriz(mat1,mat2);
		System.out.println("MATRIZ 3");
		mat3.imprimeMatriz();
		System.out.println();

		mat4.subtraiMatriz(mat3,mat2);
		System.out.println("MATRIZ 4");
		mat4.imprimeMatriz();
		System.out.println();

		mat2.multiplicaNumPorMatriz(2);
		System.out.println("MATRIZ 2 MULTIPLICADA POR 2");
		mat2.imprimeMatriz();
		System.out.println();
	}
}