// Problem statement = https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3299/

class Solution 
{
    public static String stringShift(String s, int[][] shift)
    {
        int numOfLeftShifts=0, numOfRightShifts=0;
        for(int i=0;i<shift.length;i++)
        {
            if(shift[i][0] == 0)
                numOfLeftShifts += shift[i][1];
            else
                numOfRightShifts += shift[i][1];
        }

        System.out.println("numOfLeftShifts = " + numOfLeftShifts);
        System.out.println("numOfRightShifts = " + numOfRightShifts);

        if(numOfLeftShifts == numOfRightShifts)
            return s;
        else if(numOfLeftShifts > numOfRightShifts)
        {
            numOfLeftShifts -= numOfRightShifts;
            numOfLeftShifts %= s.length();

            String sToBeShifted = s.substring(0,numOfLeftShifts);
            String sWhichRemains = s.substring(numOfLeftShifts,s.length());
            s = sWhichRemains + sToBeShifted;
            return s;
        }
        else
        {
            numOfRightShifts -= numOfLeftShifts;
            numOfRightShifts %= s.length();

            String sToBeShifted = s.substring(s.length()-numOfRightShifts,s.length());
            String sWhichRemains = s.substring(0,s.length()-numOfRightShifts);
            s = sToBeShifted + sWhichRemains;
            return s;
        }
    }
}
