import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.printf("Enter the number to till get even number...");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++) {
        if (i%2==0) {
            System.out.println(i);
        }
        }
    }
}