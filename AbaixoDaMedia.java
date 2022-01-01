import java.util.Scanner;
/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. */
public class AbaixoDaMedia {
    public static void main(String[]agrs){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos valores vai ter cada vetor? ");
        int size = leitor.nextInt();
        double array[] = new double[size];
        double sum = 0;
        for(int number = 0; number < size; number++){
            System.out.println("Digite um numero: ");
            array[number] = leitor.nextDouble();
            sum += array[number];   
        }
        double average = sum/size;
        System.out.println("MEDIA DO VETOR = " + average);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for(int smaller = 0; smaller < size; smaller++ ){
            if(array[smaller] < average){
                System.out.println(array[smaller]);
            }
        }
        leitor.close();
    }
}
