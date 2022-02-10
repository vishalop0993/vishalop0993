import java.util.*;

public class SortStrings {

    public static void main(String args[])
    {
        printStringCount("Mango,Orange,Mango,Apple,Orange,Mango");
    }


    static void printStringCount(String inp)
    {
        String nameAry[] = inp.split(",");
        Map<String,Integer> nameCountMap = new
                TreeMap<>( new MapComparator());

        for(int i = 0;i<nameAry.length;i++)
        {
            if(nameCountMap.containsKey(nameAry[i]))
            {
                nameCountMap.put(nameAry[i],nameCountMap.get(nameAry[i])+1);
            }
            else
                nameCountMap.put(nameAry[i],1);

        }

        //Collections.sort(nameCountMap, new MapComparator());

        for(String name : nameCountMap.keySet())
        {
            System.out.println(name + "  :  " + nameCountMap.get(name));
        }
    }
}


class MapComparator<E> implements Comparator<Map.Entry<String,Integer>>
{





    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        Map.Entry<String, Integer > ent1 = o1;
        Map.Entry<String, Integer > ent2 = o2;

        if(ent1.getValue()<ent2.getValue())
            return 1;
        else if (ent1.getValue()>ent1.getValue())
            return -1;
        else
            return ent1.getKey().compareTo(ent2.getKey());
    }
}