package Easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        List<Integer> temp = new ArrayList<>();
        for (int element : array) {
            if (element == toMove) {
                temp.add(element);
            }
        }
        array.removeAll(temp);
        array.addAll(temp);

//        int pointer1 = 0;
//        while(pointer1<array.size()){
//            if(array.get(pointer1).equals(toMove)){
//                array.add(toMove);
//                array.remove(array.get(pointer1));
//            }
//            pointer1++;
//        }

        return array;
    }
}
