
import java.util.Scanner;

public class App {

    public static void showPrimes(int[] lista)
    {
        for(int i=0; i<lista.length;i++){
            boolean prime = true;
            for(int o=2;o<lista[i];o++)
                if(lista[i]%o ==0)
                    prime =false;
            if(prime) System.out.println(lista[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] tab = new int[n];
        for(int i=0;i<n;i++){
            tab[i] = scanner.nextInt();
        }
        System.out.println("");
        showPrimes(tab);
    }
}
