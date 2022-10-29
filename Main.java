import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        numDes(num);


    }
    public static void numDes(int a){
        a = a / 10;
        a = a % 10;
        System.out.println(a);
    }
}