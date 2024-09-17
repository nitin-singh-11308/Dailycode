import java.util.Scanner;
public class factor {
    public static void main(String[] args){
        System.out.println("Enter the number...");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Factors of " +n+" are");
        for(int i =1 ; i<n; i++){
           if(n % i ==0){ 
               System.out.println(i);
               sum = sum + i;
               if(sum==n){
                   System.out.println("Number is perfect");
               }
           }
        }

        System.out.println("Sum Of Factor Is "+sum);
    }
}
