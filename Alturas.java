/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver. */
import java.util.Scanner;
public class Alturas {
    public static void main(String[]agrs){
        Scanner entrada = new Scanner(System.in);
       
        int cont = 0;
        do{
            System.out.println("Quantas pessoas serao digitadas?");
            int tamanho = entrada.nextInt();
            int[] vetorIdade =  new int [tamanho];
            Double.valueOf(tamanho);
            String.valueOf(tamanho);
            double[] vetorAltura = new double [tamanho];
            String[] vetorNomes = new String[tamanho];
            int increm = 0;
            double alturaMedia = 0;
            int porcentagem = 0;
           
            for(int laco1 = 0; laco1 < tamanho; laco1++){
                increm++;
                System.out.println("Dados da "+increm+"pessoa");
                System.out.println("Nome: ");
                vetorNomes[laco1] = entrada.next();
                System.out.println("Idade:");
                vetorIdade[laco1] = entrada.nextInt();
                System.out.println("Altura:");
                vetorAltura[laco1] = entrada.nextDouble();
                alturaMedia += vetorAltura[laco1];
            }
            double mediaAltura = alturaMedia/tamanho;
            for(int laco2 = 0; laco2 < tamanho ; laco2++){
                if(vetorIdade[laco2] < 16){
                    porcentagem ++;
                    System.out.println(vetorIdade[laco2]);
                    
                }
            }
            porcentagem = (porcentagem * 100)/ tamanho;
            System.out.println("Altura Media: "+ mediaAltura);
            System.out.println("Pessoas com menos de 16 anos: "+porcentagem + "%");
            cont++;
        }while(cont < 1);
        
        entrada.close();
    }
}
