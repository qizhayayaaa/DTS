import java.util.Scanner;
public class algo2{

    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Masukkan Bilangan Sembarang : ");
        int a=scan.nextInt();

        int b = a % 2;

        if(b == 0){
            System.out.println("Hasil bagi yaitu " + b + " dan merupakan Bilangan Genap");
        } else {
            System.out.println("Hasil bagi yaitu " + b + " dan merupakan Bilangan Ganjil");
        }
    }
}