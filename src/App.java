import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Entrada de um double
        double entrada = sc.nextDouble();
        sc.close();

        String[] arr = new String[2];
        arr = String.valueOf(entrada).split("\\.");
        int valor = Integer.parseInt(arr[0]);
        int valor2 = Integer.parseInt(arr[1]);


        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        int nota1 = 0;
        int resto =0;
 
        //calcula as notas 
        nota100 = valor / 100;
        resto = valor % 100;
 
        nota50 = resto / 50;
        resto = resto % 50;
 
        nota20 = resto / 20;
        resto = resto % 20;
 
        nota10 = resto / 10;
        resto = resto % 10;
 
        nota5 = resto / 5;
        resto = resto % 5;
 
        nota2 = resto / 2;
        resto = resto % 2;

        nota1 = resto / 1;
        resto = resto % 1;

        //Calcula o valor das moedas
        int moeda50 = 0;
        int moeda25 = 0;
        int moeda10 = 0;
        int moeda5 = 0;
        int moeda1 = 0;
        int resto2 = 0;

        resto2 = valor2 % 100;

        moeda50 = resto2 / 50;
        resto2 = resto2 % 50;

        moeda25 = resto2 / 25;
        resto2 = resto2 % 25;

        moeda10 = resto2 / 10;
        resto2 = resto2 % 10;

        moeda5 = resto2 / 5;
        resto2 = resto2 % 5;

        moeda1 = resto2 / 1;
        resto2  = resto2  % 1;

       

        System.out.println("NOTAS:");
        System.out.println(nota100+" nota(s) de R$ 100.00");
        System.out.println(nota50 +" nota(s) de R$ 50.00");
        System.out.println(nota20 +" nota(s) de R$ 20.00");
        System.out.println(nota10 +" nota(s) de R$ 10.00");
        System.out.println(nota5 +" nota(s) de R$ 5.00");
        System.out.println(nota2 +" nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(nota1 +" nota(s) de R$ 1.00");
        System.out.println(moeda50 +" moeda(s) de R$ 0.50");
        System.out.println(moeda25 +" moeda(s) de R$ 0.25");
        System.out.println(moeda10 +" moeda(s) de R$ 0.10");
        System.out.println(moeda5 +" moeda(s) de R$ 0.05");
        System.out.println(moeda1  +" moeda(s) de R$ 0.01");

        
    }
}
