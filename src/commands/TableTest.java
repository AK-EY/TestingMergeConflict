package commands;

import java.util.Random;

public class TableTest {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int n = rand.nextInt(100);
		
		for(int i=1; i<=10; i++)
			System.out.print(n*i+" ");
	}

}
