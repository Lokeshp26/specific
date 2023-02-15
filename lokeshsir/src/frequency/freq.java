package frequency;

import java.util.Scanner;

public class freq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String str = sc.nextLine();
		String ch[] = str.split(" ");
		int dup = -1;
		int fr[] = new int[ch.length];
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i].equals(ch[j])) {
					count++;
					fr[j] = dup;
				}
			}
			if (fr[i] != dup) {
				fr[i] = count;
			}
		}
		for (int i1 = 0; i1 < fr.length; i1++) {
			if (fr[i1] != dup)
				System.out.println(ch[i1] + "=" + fr[i1]);
		}

	}
}
