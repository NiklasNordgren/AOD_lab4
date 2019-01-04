package se.hig.aod.lab4;
import java.util.ArrayList;

public class Launcher {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(1);
		arrayList.add(8);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		
		Sorter.quickSort(arrayList);
	
		String string = "";
		
		for(Integer i : arrayList)
			string += i + " ";
		
		System.out.println(string);
	}

}
