import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FindOdd {
    public static int findIt(int[] a) {

        List <Integer> list = new ArrayList<Integer>(a.length);
        for (int val : a)
        {
            list.add(val);
        }
         while(!list.isEmpty()){
             if((Collections.frequency(list,list.get(0))) % 2 != 0){
                break;
             }
                 list.removeAll(Collections.singleton(list.get(0)));
             }
         return list.get(0);
         }
}