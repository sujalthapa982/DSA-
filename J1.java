import java.util.Scanner;

class J1{
    public static void sum(int a, int b){
        System.out.println("the sum of a and b is: "+(a+b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);
    }
}