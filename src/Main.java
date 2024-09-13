import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer.");
        num = scan.nextInt();
        if(num % 2 == 1){
            System.out.println("This number is odd.");
        }else{
            System.out.println("This number is even.");
        }
    }
}