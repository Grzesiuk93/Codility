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
		int i;
    
		for(i=0; i<A.length-1 && A[i] == A[i+1]; i+=2);
		return A[i];
	}
}
