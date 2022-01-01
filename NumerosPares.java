/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares. */
import java.util.Scanner;
public class NumerosPares {
    public static void main(String[]agrs) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas?");
        int pares = entrada.nextInt();
        int vetorNumeros [] = new int [pares];
        for(int controle = 0; controle < pares; controle++ ){
            System.out.println("Digite um numero: ");
            vetorNumeros[controle] = entrada.nextInt();
        }
        int cont = 0;
        System.out.println("NUMEROS PARES");
        for(int controle2 = 0; controle2 < pares; controle2++){
            if(vetorNumeros[controle2] % 2 == 0){
                
                System.out.print(" "+vetorNumeros[controle2]);
                cont++;

            }
        }
        
       
        System.out.print("\n QUANTIDADE DE PARES " + cont);
        
        
        entrada.close();
    }
}
