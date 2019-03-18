import java.util.*;
import java.lang.*;
import java.io.*;

public class LCS_Length {
	public static void main (String[] args) throws java.lang.Exception {
		String first = args[0];
		String second = args[1];
		
		int firstLength = first.length();
		int secondLength = second.length();
		
		int[][] lcsLength = new int[firstLength + 1][secondLength + 1];
		
		for(int i = 0; i <= firstLength; i++) {
			for(int j = 0; j <= secondLength; j++) {
				if(i == 0 || j == 0) {
					lcsLength[i][j] = 0;
				} else if(first.charAt(i - 1) == second.charAt(j - 1)) {
					lcsLength[i][j] = lcsLength[i-1][j-1] + 1;
				} else {
					lcsLength[i][j] = Integer.max(lcsLength[i-1][j], lcsLength[i][j-1]);
				}
			}
		}

		System.out.println(lcsLength[firstLength][secondLength]);
	}
}