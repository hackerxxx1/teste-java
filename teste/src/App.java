

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        double x = 10 ;
        System.out.print("escreva o valor da variavel x: ");
        x= ler.nextDouble();
        System.out.println("esse e o valor de x: "+x);
    }
}
