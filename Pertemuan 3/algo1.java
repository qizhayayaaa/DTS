import java.util.Scanner;
public class algo1{

    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        int a=scan.nextInt();

        int x=1;
        int y=x*x;

        while(y != a){
            x++;
            y=x*x;
        }
        System.out.print("Akar = " + x);
    }
}