import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int Cent01, cent05, cent010, cent025, cent050, um, dois, cinco, dez, vinte, cinquenta, cem;
        double valor;
        
        valor = leia.nextDouble();
        
        System.out.println("NOTAS");
        
        //gambiarra a seguir na proxima linha <3
        valor = valor + 0.00001;
        
        cem = (int)(valor/100);
        valor = valor % 100;
        
        cinquenta = (int)(valor/50);
        valor = valor % 50;
        
        vinte = (int)(valor/20);
        valor = valor % 20;
        
        dez = (int)(valor/10.);
        valor = valor % 10;
        
        cinco = (int)(valor/5);
        valor = valor % 5;
        
        dois = (int)(valor/2);
        valor = valor % 2;
        
        um = (int)(valor/1);
        valor = valor % 1;
        
        cent050 = (int) (valor/0.50);
        valor = valor % 0.50;
        
        cent025 = (int) (valor/0.25);
        valor = valor % 0.25;
        
        cent010 = (int) (valor/0.10);
        valor = valor % 0.10;
        
        cent05 = (int) (valor/0.05);
        valor =  valor % 0.05;
        
        Cent01 = (int) (valor/0.01);
         
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        
        System.out.println("NOTAS");
        System.out.println(um + " moeda(s) de R$ 1.00");
        System.out.println(cent050 + " moeda(s) de R$ 0,50");
        System.out.println(cent025 + " moeda(s) de R$ 0,25");
        System.out.println(cent010 + " moeda(s) de R$ 0,10");
        System.out.println(cent05 + " moeda(s) de R$ 0,05");
        System.out.println(Cent01 + " moeda(s) de R$ 0,01");
    }
}
