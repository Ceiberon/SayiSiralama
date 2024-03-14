import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Gir: ");
        int n = input.nextInt();

        int[] b = new int[n];
        System.out.println("Dizi elemanı girin");
        for (int i = 0 ; i < n; i++){
            b[i] = input.nextInt();
        }

        Arrays.sort(b);

        System.out.print("dizi :   ");
        for (int i = 0; i< n ; i++){
            System.out.print(b[i] + "  ");
        }

    }
}