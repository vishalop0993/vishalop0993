import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramStrings {

    public static  void main(String args[])
    {
        System.out.println(checkAnagram("ask","ska"));
    }

    private static boolean checkAnagram(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
       // Arrays.sort(ch1);
        //Arrays.sort(ch2);
        HashMap<Character, Integer> countMap1  = new HashMap<>();
        HashMap<Character, Integer> countMap2  = new HashMap<>();

         for(int i = 0;i<ch1.length;i++)
        {
           if(countMap1.containsKey(ch1[i]))
           {
               countMap1.put(ch1[i],countMap1.get(ch1[i])+1);
           }
           else
           {
               countMap1.put(ch1[i],1);
           }
        }


        for(int i = 0;i<ch2.length;i++)
        {
            if(countMap2.containsKey(ch2[i]))
            {
                countMap2.put(ch2[i],countMap2.get(ch2[i])+1);
            }
            else
            {
                countMap2.put(ch2[i],1);
            }
        }


        for(Character ch : countMap1.keySet() )
        {

            //System.out.println(ch + "  ---  " +  countMap1.get(ch)  + "  ---  " + countMap2.get(ch) );
           if(countMap1.get(ch) != countMap2.get(ch))
           {
               return false;
           }

        }
        return true;

    }
}
