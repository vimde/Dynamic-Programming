public class LCS_Length {
    
    public int findLengthOfLongestCommonSubsequence(String first, String second, int positionOfFirst, int positionOfSecond) {

        if(positionOfFirst == 0 || positionOfSecond == 0) {
            return 0;
        }

        if(first.charAt(positionOfFirst - 1) == second.charAt(positionOfSecond - 1)) {
            return 1 + findLengthOfLongestCommonSubsequence(first, second, positionOfFirst - 1, positionOfSecond - 1);
        }

        return Integer.max(findLengthOfLongestCommonSubsequence(first, second, positionOfFirst - 1, positionOfSecond),
                    findLengthOfLongestCommonSubsequence(first, second, positionOfFirst, positionOfSecond - 1));
    }

    public static void main(String[] args) {
        String first = args[0];
        String second = args[1];
        LCS_Length lcsLength = new LCS_Length();
        int longestLength = lcsLength.findLengthOfLongestCommonSubsequence(first, second, first.length(), second.length());
        System.out.println("Longest length of LCS: "+longestLength);
    }
}