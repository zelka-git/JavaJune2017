package classwork.lesson170701.genome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import classwork.lesson170629.classwork.DataGenerator;

public class GenomeWithSort {
	private static final int GENOME_SIZE = 30;
	private static final int WORD_SIZE = 4;
	
	static class Word implements Comparable<Word>{
		byte[] data;
		int offset;

		public Word(byte[] data, int i) {
			this.data = data;
			offset = i;
		}

		@Override
		public int compareTo(Word otherWord) {
			if(otherWord == null) {
				return WORD_SIZE + 1;
			}
			for (int i = 0; i < WORD_SIZE; i++) {
				int diff = data[offset + i] - data[otherWord.offset + i];
				if(diff != 0) {
					return diff;
				}
			}
			return 0;
		}
		
		public void print() {
			byte[] wordBytes = Arrays.copyOfRange(data, this.offset, this.offset + WORD_SIZE);
			System.out.println(Arrays.toString(wordBytes));
		}
	}

	public static void main(String[] args) {
		byte[] data = DataGenerator.generate(GENOME_SIZE);
		List<Word> list = new ArrayList<>();
		for (int i = 0; i < data.length - WORD_SIZE; i++) {
			list.add(new Word(data, i));
		}
		
		Collections.sort(list);
		
		for (Word word : list) {
			byte[] wordBytes = Arrays.copyOfRange(data, word.offset, word.offset + WORD_SIZE);
			System.out.println(Arrays.toString(wordBytes));
		}
		
		System.out.println("Print repeat");
		Word compareWord = null;
		int countRepeatWord = 0;
		
		for(int i = 0; i < list.size(); i++) {
			Word currentWord = list.get(i);
			if (currentWord.compareTo(compareWord) != 0) {
				System.out.println(" :countRepeatWord = " + countRepeatWord + "\n");
				compareWord = currentWord;
				countRepeatWord = 1;
				currentWord.print();
				System.out.print("position: " + currentWord.offset);
			}else {
				System.out.print(" " + currentWord.offset);
				countRepeatWord++;
			}
		}
		System.out.println(" :countRepeatWord = " + countRepeatWord + "\n");
	}
}
