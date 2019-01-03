package se.hig.aod.lab4;
import java.util.ArrayList;

public class Launcher {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(5);
		arrayList.add(4);
		arrayList.add(1337);
		arrayList.add(1338);
		arrayList.add(9);
		arrayList.add(30);
		arrayList.add(50);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(99999999);
		
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		
		Sorter.quickSort(arrayList);
		
		System.out.println("After sort:");
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		
	}

}
