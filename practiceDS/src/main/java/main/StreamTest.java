package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String args[])
    {
        int k = 4;
        List<Integer> aList = Arrays.asList(1,1,1,1);
        System.out.println(aList);
        aList =  aList.stream().map(e->e+k).collect(Collectors.toList());

        System.out.println(aList);
    }
}
