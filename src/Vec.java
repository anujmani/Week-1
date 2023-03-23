import java.util.*;
public class Vec {
    public static void main(String[] args) {
        /*Vector v= new Vector();
        v.add(2);
        v.add(3);
        v.addElement(3);
        System.out.println(v);
        System.out.println(v.size());*/
        ArrayList a= new ArrayList();
        a.add(3);
        a.add(5);
        a.removeAll(a);
        System.out.println(a);

    }
}
