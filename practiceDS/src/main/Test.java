package main;

import java.util.Arrays;

/**
Given a binary slice, return the max number of consecutive 1s in the slice.
        Ex: i/p:[1,1,0,0,1,1,1], o/p: 3
        i/p: [0,0,0,0],o/p: 0
*/

public class Test {
    public static void main(String args[])

}

    private static int getCount(int[] arrInp) {
        int count = 0;
        int len = arrInp.length;
        int tempCount = 0;

        for(int i = 0; i<len; i++)
        {
            tempCount  = tempCount + arrInp[i] ;
            if(arrInp[i] == 0 ||  i == len-1)
            {
                if(count<tempCount)
                    count = tempCount;
                tempCount = 0;
            }
        }
        return count;

    }
}
