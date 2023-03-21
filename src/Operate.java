import java.util.Scanner;

public class Operate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double price=sc.nextDouble();
        double tip= sc.nextInt();
        double tax= sc.nextInt();
        double tip1=tip;
        double tip2;

        int discount =0;
        if(price>5000 && price<=10000){
            discount= 500;
        }
        else if(price>10000){
            discount=700;
             tip2=(tip1*((double)20/100));
             tip1=tip1-tip2;
        }

        double totaltax= price *(tax/100);
        double totaltip= price *(tip1/100);
        double total= totaltip+totaltax+price-discount;
        System.out.println((Math.round(total)));

    }
}
