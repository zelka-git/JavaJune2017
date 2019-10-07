package classwork.lesson170629.classwork;

import java.util.Arrays;

public class Genome {
	/*
	 * A C G T
	 * 
	 * N = 3.2G пусть N = 100000
	 * 
	 * V
	 * AAACCAGTAACGTGATAGATAGGAAAAGGGATTTC
	 * ^
	 * 
	 * AAA
	 * AAC
	 * ACC
	 * CCA
	 * 
	 * 1Tb
	 * 
	 * N = 8 
	 * W = 2
	 * 0
	 * ACGT
	 * 
	 */
	public static void main(String[] args) {
		byte[] data = DataGenerator.generate(30);
		System.out.println(data);
		System.out.println(Arrays.toString(data));
		for(byte b : data) {
			System.out.print((char)b);
		}
		findDuplicates(data, 2);
	}

	private static void findDuplicates(byte[] data, int w) {
		int counter = 0;
		for (int i = 0; i < data.length - w; i++) {
			INNER :for (int j = i+1; j < data.length - w + 1; j++) {
				for (int k = 0; k < w; k++) {
					if(data[i + k] != data[j + k]) {
						continue INNER;
					}
				}
				counter++;
				System.out.println("hurray!");
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println(counter);
		
	}
}
