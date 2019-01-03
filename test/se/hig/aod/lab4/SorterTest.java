package se.hig.aod.lab4;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import se.hig.aod.lab4.Sorter;

public class SorterTest {

	private ArrayList<Integer> integerArraylist;
	private ArrayList<String> stringArraylist;

	private Integer[] integerTestFixture = {10, 1, 57, 3, 85, 4, 4};
	private String[] stringTestFixture = {"fågel", "apa", "björn", "fisk", "räka", "ödla", "tiger", "apa"};

	@Before
	public void setUp() throws Exception {
		
		integerArraylist = new ArrayList<>();
		stringArraylist = new ArrayList<>();
		
		populateIntegerArrayList();
		populateStringArrayList();
	}

	@After
	public void tearDown() throws Exception {
		integerArraylist = null;
		stringArraylist = null;
	}

	@Test
	public void testSortIntegerArrayList() {
		
		Sorter.quickSort(integerArraylist);
	
		String stringContainingArraylistElements = "";

		for(int i = 0; i < integerArraylist.size(); i++)
			stringContainingArraylistElements += integerArraylist.get(i) + " ";
		
		assertEquals(stringContainingArraylistElements, "1 3 4 4 10 57 85 ");

	}
	
	@Test
	public void testSortStringArrayList() {
		
		Sorter.quickSort(stringArraylist);
	
		String stringContainingArraylistElements = "";

		for(int i = 0; i < stringArraylist.size(); i++)
			stringContainingArraylistElements += stringArraylist.get(i) + " ";

		assertEquals(stringContainingArraylistElements, "apa apa björn fisk fågel räka tiger ödla ");

	}

	private void populateIntegerArrayList() {

		for (Integer integer : integerTestFixture) {
			integerArraylist.add(integer);
		}
	}

	private void populateStringArrayList() {

		for (String string : stringTestFixture) {
			stringArraylist.add(string);
		}
	}

}
