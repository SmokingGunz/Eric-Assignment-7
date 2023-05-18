package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			items = doubleBackingArraySize();
		}
		items[size] = item;
		size++;
		return true;
	}

	private Object[] doubleBackingArraySize() {
		Object[] newArray = new Object[size * 2];
		for (int i = 0; i < size; i++) {
			newArray[i] = items[i];
		}
		return newArray;
	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index >= size) {
			throw new IndexOutOfBoundsException("Hey! DUMMY! Your index, " + index
					+ ", went out of bounds of the array size of " + size + ". Try again!");
		}
		return (T) items[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {

		if (index >= size) {
			throw new IndexOutOfBoundsException("Hey! DUMMY! Your index, " + index
					+ ", went out of bounds of the array size of " + size + ". Try again!");
		}
		if (size == items.length) {
			items = doubleBackingArraySize();
		}
		for (int i = size - 1; i >= index; i--) {
			items[i + 1] = items[i];
		}
		items[index] = item;
		size++;

		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {

		if (index >= size) {
			throw new IndexOutOfBoundsException("Hey! DUMMY! Your index, " + index
					+ ", went out of bounds of the array size of " + size + ". Try again!");
		}
		@SuppressWarnings("unchecked")
		T item = (T) items[index];

		for (int i = index; i < size - 1; i++) {
			items[i] = items[i + 1];
		}

		size--;

		return item;
	}

}
