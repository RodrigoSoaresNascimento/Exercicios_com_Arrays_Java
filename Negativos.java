import java.util.Scanner;
public class Negativos{
    public static void main(String[]agrs){
        /*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        int numeros = entrada.nextInt();
        int[] valores = new int[numeros];
        for(int tamanho = 0; tamanho < numeros ; tamanho++){
            System.out.println("Digite um numero: ");
            valores[tamanho] = entrada.nextInt();
            
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for (int i=0; i<numeros; i++) {
	        if (valores[i] < 0) {
	        	System.out.printf("%d\n", valores[i]);
	        }
	    }
        
       
        
        
        entrada.close();

    }
    
    

}