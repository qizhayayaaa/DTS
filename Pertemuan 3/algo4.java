import java.util.Scanner;
public class algo4{

    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Masukkan Bilangan 1 : ");
        int a=scan.nextInt();

        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Bilangan 2 : ");
        int b=input.nextInt();

        if(a==b){
            System.out.println("Bilangan 1 : "+a+" (=) sama dengan Bilangan 2 : "+b);
        }else if(a<b){
            System.out.println("Bilangan 1 : "+a+" (<) lebih kecil dari Bilangan 2 : "+b);
        }else if(a>b){
            System.out.println("Bilangan 1 : "+a+" (>) lebih besar dari Bilangan 2 : "+b);
        }
    }
}