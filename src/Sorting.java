import java.util.ArrayList;
import java.util.List;
import java.util.*;



public class Sorting {
    public static void main(String[]args){
        List a= new ArrayList();
        a.add(2);
        a.add("why");

        System.out.println(a.size());
        System.out.println(a.isEmpty());
        System.out.println(a);

        a.remove(1);
        System.out.println(a);
        Iterator s=a.iterator();
        while(s.hasNext()){
            System.out.println(s.next());
        }
    }

}
