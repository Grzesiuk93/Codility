package com.codility;

import java.util.Arrays;

public class OddOccurencesInArray {
	
	public static void main(String[] args) {
		OddOccurencesInArray odd = new OddOccurencesInArray();
		int[] table = {9, 3, 9, 3, 8, 7, 9};
		odd.solution(table);
	}

	public int solution(int[] A) {
	    Arrays.sort(A);
	    int i, j, count = 0;
	 
	    for (i = 0; i < A.length; i++) {
	        for (j = i + 1; j < A.length; j++) {
	            if (A[i] == A[j]) {
	                count++;
	            }
	            else break;
	        }
	        if (count % 2 == 0) {
	            return A[i];
	        }
	        else {
	            count = 0;
	            i = j - 1;
	        }
	    }
	    return 0;
	}
}
