package main;

public class SubSequenceCount {
    public static void main(String args[])
    {
       printOccurence("34441");
    }

    private static void printOccurence(String input) {
        int count  = 1;
        for(int i = 1;i<input.length();i++)
        {
            if(input.charAt(i-1) == input.charAt(i))
            {
                count++;
            }
            else
            {
                System.out.print(count + "" +input.charAt(i-1) + "  ");
                count =1;
            }
            if(i == input.length()-1)
            {
                System.out.print(count + "" +input.charAt(i) + ".");

            }
        }
    }
}
