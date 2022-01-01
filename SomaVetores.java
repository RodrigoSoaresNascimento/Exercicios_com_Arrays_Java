import java.util.Scanner;
/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado. */
public class SomaVetores {
    public static void main(String[] agrs){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos valores vai ter cada vetor? ");
        int tamanho = leitor.nextInt();
        int vetorA[] = new int[tamanho];
        int vetorB[] = new int[tamanho];
        int vetorSoma[] = new int[tamanho];
        System.out.println("Digite os valores do vetor A: ");
        for(int valores = 0; valores < tamanho; valores++){
            vetorA[valores] = leitor.nextInt();
            
        }
        System.out.println("Digite os valores do vetor B: ");
        for(int valores2 = 0; valores2 < tamanho; valores2++){
            
            vetorB[valores2] = leitor.nextInt();
        }
        System.out.println("VETOR RESULTANTE: ");
        for(int soma = 0; soma < tamanho; soma++){
            vetorSoma[soma] = vetorA[soma] + vetorB[soma];
            System.out.println(vetorSoma[soma]);
        }

        leitor.close();
    }
}
