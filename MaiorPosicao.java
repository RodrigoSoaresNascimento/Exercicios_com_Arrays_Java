/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero). */
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[]agrs) {
        Scanner input = new Scanner (System.in);
        System.out.println("Quanto numeros voce vai digitar? ");
        int arraySize = input.nextInt();
        int[] myArray = new int [arraySize];
        int bigest = 0;
        for(int i = 0; i < arraySize; i++){
            System.out.println("Digite um numero: ");
            myArray[i] = input.nextInt();   
        }
        for(int j = 0; j < arraySize; j++){
            if(j == 0){
                bigest = myArray[j];
            }
            if(bigest < myArray[j]){
                bigest = myArray[j];
                System.out.println("MAIOR VALOR = " + myArray[j]);
                System.out.println("POSICAO DO MAIOR VALOR " + j);
            }
            
        }
        
        input.close();
    }
}
