package Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class SortArray {
    public static void main(String[] args)
    {
        ArrayList list=new ArrayList();
        list.add(2);
        list.add(1);
        list.add(3);
        Collections.sort(list);
        System.out.println(list);
    }
}
