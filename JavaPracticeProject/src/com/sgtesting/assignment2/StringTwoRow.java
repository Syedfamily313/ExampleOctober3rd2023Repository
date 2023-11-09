package com.sgtesting.assignment2;

class Sample {
	Sample(char ch[][]) {
		char b[] = new char[ch.length * ch[0].length];
		int k = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				b[k] = ch[i][j];
				k++;
			}
		}

	}
}

public class StringTwoRow {

	public static void main(String[] args) {

		char[][] d = { { 'a', 'b', 'c' }, { 'e', 'f', 'g' } };
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}

	}
}
