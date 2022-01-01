/*Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto, mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de venda das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas mercadorias proporcionaram: 
 lucro < 10% 
 10% ≤ lucro ≤ 20% 
 lucro > 20% 
Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.*/
import java.util.Scanner;

public class Comerciante {
    public static void main(String[]agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("Serao digitados dados de quantos produtos?");
        int size = input.nextInt();
        String [] product = new String [size];
        double [] buyPrice = new double [size];
        double [] sellPrice = new double [size];
        double [] profit = new double[size];
        double totalBuy = 0;
        double totalSell = 0;
        double totalProfit = 0;
        int low = 0;
        int between = 0;
        int uper = 0;

        int cont = 0;
        for(int i = 0; i < size; i++){
            cont++;
            System.out.println("Produto " + cont+ " :");
            System.out.print("Nome : ");
            product[i] = input.next();
            System.out.print("Preco de compra: ");
            buyPrice[i] = input.nextDouble();
            System.out.print("Preco de venda:");
            sellPrice[i] = input.nextDouble();
            totalBuy += buyPrice[i];
            totalSell += sellPrice[i];

        } 
        for(int j = 0; j < size; j++){
            profit[j] = ((sellPrice[j] * 100) / buyPrice[j]) - 100;
            if(profit[j] < 10){
                low++;
            }else if(profit[j] >= 10 && profit[j] <= 20){
                between++;
            }else{
                uper++;
            }

        }
        totalProfit = totalSell - totalBuy;
        System.out.println("Lucro abaixo de 10%:" + low);
        System.out.println("Lucro entre 10% e 20%:" + between);
        System.out.println("Lucro acima de 20%: " + uper);
        System.out.println("Valor total de compra: "+ totalBuy);
        System.out.println("Valor total de venda:" + totalSell);
        System.out.println("Lucro total:" + totalProfit);
        input.close();
        
        
    }
}
