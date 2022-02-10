package main;

import java.util.List;

/**
 *
 * Given a list of  repeating integers between 0 to 7, find the unique 'node pairs' that can be formed. 'node pairs' are of the form:
 * (0,1)
 * (2,3)
 * (4,5)
 * (6,7)
 * Pairs like (1,2) would not count as node pair.
 * Ex:
 * i/p:[0,1,2,3,4,5,6,7,0,1],o/p: [{0,1},{0,1},{2,3}{,4,5},{6,7}]
 * i/p:[0,1,0,1,0,0,1,1],o/p:[{0,1},{0,1},{0,1},{0,1}]
 * i/p: [1,0,2,3,4,5,6,8,8,1,1], o/p: [][]
 * i/p: [0,0,2,3,4,5,6,7,1], o/p: [][]
 * i/p:[1,2,3,4], o/p:[][]
 *  [0,1,8]
 *
 *
 */

public class Test2 {
    public static void main(String args[])
    {
        int inputArr[] = {1,2,3,4};

        int countArr[] = new int[8];
        String output = "";
        for(int i = 0;i<inputArr.length;i++)
        {
            if(inputArr[i] >7 || inputArr[i]<0) {
                System.out.print("[][]");
                return;
            }
            countArr[inputArr[i]]++;
        }
        for(int i = 0;i<countArr.length-1;i = i+2)
        {
            if(countArr[i] == countArr[i+1])
            {
                for(int j = 0;j < countArr[i]; j++)
                {
                output = output + "{" + i+ "," + (i+1) + "}";
            }
        }
            else
            {
                output = "[][]";
                break;
            }
    }
        System.out.println(output);




}



}