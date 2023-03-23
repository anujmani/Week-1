public class SingleNum{
    public static void main(String[] args) {
        int a=1234;
        SingleNum s= new SingleNum();

        System.out.println(s.reverse(a));


    }
    public int reverse(int a){

        int n;
        int  b=0;
        while (a!=0){
            n=a%10;
            a=a/10;
            b=b*10+n;




        }
        return b;
    }
}
