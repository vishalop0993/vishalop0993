import java.util.HashSet;

public class PatternSearch {
    public static void main(String args[])
    {
        String inputString = "hgehgeksforgeeks";
        //eksforg

        /**
         *
         *   ge
         */
        System.out.println(getLongestUniqueCharacterPattern(inputString));

    }

    private static String getLongestUniqueCharacterPattern(String inputString) {
       int startCharPos = 0;
       int endCharPos = 0;
       String outputString = "";
        HashSet<Character> set = new HashSet<Character>();
        while(endCharPos<inputString.length())
        {
            Character current = inputString.charAt(endCharPos);
            if(!set.contains(current)) {
                set.add(inputString.charAt(endCharPos));
                endCharPos++;
            }
            else
            {
                // remove character till first occurence of endCharPos
                while(startCharPos<=inputString.indexOf(current))
                {
                    set.remove(inputString.charAt(startCharPos));
                    startCharPos++;
                }
            }

            if((endCharPos-startCharPos)>outputString.length())
            {
                outputString = inputString.substring(startCharPos,endCharPos);
            }
        }

        return outputString;
    }
}
