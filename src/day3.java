public class day3 {
    public static void main(String[] args) {
        //operators
        int a= 4;
        int b = 5;
        String msg="When";
        String check="Why";
        if(a==b){
            System.out.println("Equal");

        } else if (a<b) {
            System.out.println("less a");

        }
        else if(b<a){
            System.out.println("less b");
        }
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(a&b);
        if(a==1 && b==1){
            a++;
         }
        int c=a*b+a/2;
        System.out.println(c);
    }
}
