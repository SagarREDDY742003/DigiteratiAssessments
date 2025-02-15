package collectionApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		// create an array list, add some colors (strings) and print out the collection
		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		System.out.println(colorList);

		// iterate through all elements in an array list.
		for (String color : colorList) {
			System.out.println(color);
		}

		// insert an element into the array list at the first position.
		colorList.add(0, "Yellow");
		System.out.println(colorList);

		// Retrieve an element (at a specified index) from a given array list:
		String element = colorList.get(3);
		System.out.println(element);

		// Update an array element by the given element:
		colorList.set(0, "Violet");
		System.out.println(colorList);

		// remove the third element from an array list.
		colorList.remove(1);
		System.out.println(colorList);

		// search for an element in an array list.
		boolean contain = colorList.contains("Blue");
		System.out.println("contains Blue:" + contain);

		// sort a given array list.
		Collections.sort(colorList);
		System.out.println(colorList);

		// copy one array list into another.
		ArrayList<String> newCopy = new ArrayList<String>();
		newCopy.addAll(colorList);
		System.out.println(newCopy);

		// shuffle elements in an array list
		Collections.shuffle(colorList);
		System.out.println(colorList);

		LinkedList<String> list = new LinkedList<>();
		list.add("Red");
		list.add("Green");
		list.add("Blue");

		// Append the specified element to the end of a linked list:
		list.addLast("Yellow");
		System.out.println(list);

		// Iterate through all elements in a linked list:
		for (String color : list) {
			System.out.println(color);
		}

		// Iterate through all elements in a linked list starting at the specified
		// position:
		for (int i = 2; i < list.size(); i++)
			System.out.println(list.get(i));

		// Iterate a linked list in reverse order:
		ListIterator<String> listItr = list.listIterator(list.size());
		while (listItr.hasPrevious())
			System.out.println(listItr.previous());

		// Insert the specified element at the specified position in the linked list:
		list.add(1, "Violet");
		System.out.println(list);

		// Insert elements into the linked list at the first and last positions
		list.addFirst("Orange");
		list.addLast("Pink");
		System.out.println(list);

		// Insert some elements at the specified position into a linked list
		LinkedList<String> newElements = new LinkedList<>();
		newElements.add("Brown");
		newElements.add("Pink");
		list.addAll(2, newElements);
		System.out.println(list);

		// Get the first and last occurrence of the specified elements in a linked list:
		String firstOcc = list.getFirst();
		String lastOcc = list.getLast();
		System.out.println("firstOcc " + firstOcc);
		System.out.println("lastOcc " + lastOcc);

	}

}
