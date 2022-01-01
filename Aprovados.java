/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou igual a 7.0 (sete).*/
import java.util.Scanner;

public class Aprovados {
    public static void main(String[]agrs){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas pessoas voce vai digitar? ");
        int size = leitor.nextInt();
        double grade1[] = new double[size];
        double grade2[] = new double[size];
        double average[] = new double[size];
        String name[] = new String[size];
        int cont = 0;
        String okay = "";
        for(int i = 0; i < size; i++){
            cont++;
            System.out.println("Digite nome, primeira e segunda nota do " + cont +"a Aluno");
            System.out.print("Nome ");
            name[i] = leitor.next();
            leitor.nextLine();
            System.out.print("Nota 1 ");
            grade1[i] = leitor.nextDouble();
            System.out.print("Nota 2 ");
            grade2[i] = leitor.nextDouble();
        }
        System.out.println("Alunos aprovados:");
        for(int j = 0; j < size; j++){
            average[j] = (grade1[j] + grade2[j]) / 2;
            if(average[j] >= 7){
                okay = name[j];
                System.out.println(okay);
            }
        }
        leitor.close();
    }
}
