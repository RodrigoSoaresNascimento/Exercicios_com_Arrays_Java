/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR" */
import java.util.Scanner;

public class MediaDosPares {
    public static void main(String[]agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos valores vai ter cada vetor? ");
        int size = input.nextInt();
        int myArray[] = new int[size];
        double sum = 0;
        int cont = 0;
        for(int i = 0; i < size; i++){
            System.out.println("Digite um numero: ");
            myArray[i] = input.nextInt();
            if (myArray[i] % 2 == 0){
                sum += myArray[i];
                cont++;
            }
        }
        double avegare = sum / cont;
        if(cont == 0){
            System.out.println("Não há numeros pares!");
        }else{
            System.out.println("MEDIA DOS PARES = " + avegare);
        }
        
        
        
        
        
        
        
        input.close();
    }
}
