/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número de homens. */
import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[]agrs){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas pessoas voce vai digitar? ");
        int size = leitor.nextInt();
        double tall[] = new double[size];
        char tipe[] = new char[size];
        double tallest = 0;
        double smaller = 0;
        double average = 0;
        double sum = 0;
        int cont = 0;
        int contM = 0;
        int contWomen = 0;
        for(int i = 0; i < size; i++){
            cont++;
            System.out.print("Altura da " + cont +"a pessoa:");
            tall[i] = leitor.nextDouble();
            System.out.print("Genero da " + cont +"a pessoa:");
            tipe[i] = leitor.next().charAt(0);
            tallest = tall[i];
            smaller = tall[i];
            if(tipe[i] == 'M'){
                contM++;
            }else if(tipe[i] == 'F'){
                sum += tall[i];
                contWomen++;
            } 
        }
        for(int j = 0; j < size; j++){
            
            if( tall[j] > tallest){
                tallest = tall[j];
            }else if(tall[j] < smaller){
                smaller = tall[j];
            }
        }
        
        average = sum/contWomen;
        System.out.println("Menor altura = "+ smaller);
        System.out.println("Maior altura = "+ tallest);
        System.out.println("Media das alturas das mulheres = "+ average);
        System.out.println("Numero de homens = "+ contM);
        leitor.close();
    }
}
