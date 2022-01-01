/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.*/
import java.util.Scanner;
import java.util.Arrays;
public class SomaVetor{
    public static void main(String[]agrs){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        int tamanho = entrada.nextInt();
        int vetor[] = new int[tamanho];
        int adiciona = 0;
        double media = 0;
        for(int valores = 0; valores < tamanho; valores++){
            System.out.println("Digite um numero: ");
            vetor[valores] = entrada.nextInt();
            adiciona += vetor[valores];
            
        }
        media = adiciona / tamanho;
        System.out.println("Elements of the array are: " + Arrays.toString(vetor));
        System.out.println("Sum of the elements of the array ::" + adiciona);
        System.out.println("media of the elements of the array ::" + media);
        entrada.close();

    }
}