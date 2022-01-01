import java.util.Scanner;
/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome da pessoa mais velha. */

public class MaisVelho {
    public static void main(String[]agrs){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas pessoas voce vai digitar? ");
        int size = leitor.nextInt();
        int age[] = new int[size];
        String name[] = new String[size];
        int cont = 0;
        int oldestAge = 0;
        String oldestName = "";
        for(int i = 0; i < size; i++){
            cont++;
            System.out.println("Dados da " + cont +"a pessoa:");
            System.out.print("Nome ");
            name[i] = leitor.next();
            leitor.nextLine();
            System.out.print("Idade ");
            age[i] = leitor.nextInt();
        }
        for(int j = 0; j < size; j++){
            if(age[j] > oldestAge){
                oldestAge = age[j];
                oldestName = name[j];
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + oldestName);
        leitor.close();
    }
}
