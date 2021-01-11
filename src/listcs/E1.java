package listcs;

import java.util.ArrayList;
import java.util.List;

public class E1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(false);
        list.add("QQ") ;
        list.add("1.5");
        for (int i = 0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }


}
