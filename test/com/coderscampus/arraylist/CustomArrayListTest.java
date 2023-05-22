package com.coderscampus.arraylist;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	public void should_add_item_to_list() {
		CustomList<String> list = new CustomArrayList<>();
		assertTrue(list.add("Element 1"));
		assertTrue(list.add("Element 2"));
		assertEquals(2, list.getSize());
	}

	@Test
	public void should_add_item_at_index() {
		CustomList<Integer> list = new CustomArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);

		list.add(1, 15);
		assertEquals(15, list.get(1));
		assertEquals(10, list.get(0));
		assertEquals(20, list.get(2));
		assertEquals(4, list.getSize());
	}

	@Test
	public void should_get_item_at_index() {
		CustomList<String> list = new CustomArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");

		assertEquals("Apple", list.get(0));
		assertEquals("Banana", list.get(1));
		assertEquals("Orange", list.get(2));
	}

	@Test
	public void should_remove_item_in_middle_of_list() {
		CustomList<Integer> list = new CustomArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);

		int removedElement = list.remove(1);
		assertEquals(20, removedElement);
		assertEquals(2, list.getSize());
		assertEquals(10, list.get(0));
		assertEquals(30, list.get(1));
	}

	@Test
	public void should_remove_at_index_beginning_of_list() {
		CustomList<Integer> list = new CustomArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);

		int removedElement = list.remove(0);
		assertEquals(10, removedElement);
		assertEquals(2, list.getSize());
		assertEquals(20, list.get(0));
		assertEquals(30, list.get(1));

	}

	@Test
	public void should_add_at_index_middle_of_list() {
		CustomList<Integer> list = new CustomArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		list.add(2, 25);
		assertEquals(5, list.getSize());
		assertEquals(10, list.get(0));
		assertEquals(20, list.get(1));
		assertEquals(25, list.get(2));
		assertEquals(30, list.get(3));
		assertEquals(40, list.get(4));
	}

	@Test
	public void should_remove_from_index_middle_of_list() {
		CustomList<String> list = new CustomArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Mango");

		String removedElement = list.remove(2);
		assertEquals("Orange", removedElement);
		assertEquals(3, list.getSize());
		assertEquals("Apple", list.get(0));
		assertEquals("Banana", list.get(1));
		assertEquals("Mango", list.get(2));
	}

	@Test
	public void should_add_item_to_empty_list() {
		CustomList<String> list = new CustomArrayList<>();

		assertTrue(list.add("Element 1"));
		assertEquals(1, list.getSize());
		assertEquals("Element 1", list.get(0));
	}

	@Test
	public void should_get_show_null_value_end_of_list() {
		CustomList<String> list = new CustomArrayList<>();
		list.add("Apple");
		assertEquals(null, list.get(1));
		assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
	}

	@Test
	public void should_throw_index_out_of_bounds_on_add_item_to_list() {
		CustomList<Integer> list = new CustomArrayList<>();
		list.add(10);
		list.add(20);
		assertThrows(IndexOutOfBoundsException.class, () -> list.add(5, 30));
	}

	@Test
	public void should_return_index_out_of_bounds_remove_from_empty_list() {
		CustomList<String> list = new CustomArrayList<>();
		assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
	}

	@Test
	public void should_throw_index_out_of_bounds_error_remove_from__end_of_list() {
		CustomList<Integer> list = new CustomArrayList<>();
		list.add(10);
		list.add(20);
		assertThrows(IndexOutOfBoundsException.class, () -> list.remove(2));
	}

	@Test
	public void should_throw_exception_remove_item_not_found() {
		CustomList<Integer> list = new CustomArrayList<>();

		list.add(10);
		list.add(20);

		assertThrows(IndexOutOfBoundsException.class, () -> list.remove(3));
		assertThrows(IndexOutOfBoundsException.class, () -> list.remove(4));

	}
	
	@Test
	public void should_remove_item_from_index_end_of_list() {
		
		CustomList<Integer> list = new CustomArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		
		int removedElement = list.remove(8);
		assertEquals(90, removedElement);
		assertEquals(9, list.getSize());
		assertEquals(10, list.get(0));
		assertEquals(100, list.get(8));
		assertEquals(null, list.get(9));
	}

}
