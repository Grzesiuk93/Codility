package com.codility;

import java.util.Arrays;

public class BinaryGap {

	public static void main(String[] args) {
		BinaryGap binaryGap = new BinaryGap();
		binaryGap.solution(986);
	}
	
	public int solution(int N) {
		String str = Integer.toBinaryString(N);	
    
		str = str.replaceAll("0", " ").trim();
		String[] oneOcurrences = str.split("1");
		
		int[] gaps = new int[oneOcurrences.length];
		for(int i=0; i < oneOcurrences.length; i++) {
			gaps[i] = oneOcurrences[i].length();
		}
		Arrays.sort(gaps);
		return gaps[gaps.length-1];
	}
}
