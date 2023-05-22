package com.coderscampus.arraylist;

public class CustomArrayListApp {

	public static void main(String[] args) {

		example3();		
		example1();	
       example2();
	}

	public static void example3() {
		CustomList<Integer> customList = new CustomArrayList<>();
		
		for (int i = 1; i <= 36; i++) {
			customList.add(i);
		}
		
		for (int i = 0; i < customList.getSize(); i++) {
			System.out.println(customList.get(i));
		}
		
		System.out.println("");
		System.out.println("Number of items in custom list: \n");
		System.out.println(customList.getSize());
	}
	
	private static void example1() {
		
		
		CustomList<Integer> customList = new CustomArrayList<>();
		
        for (int i = 1; i <= 36; i++) {
            customList.add(i);
        }
        
        for (int i = 0; i < customList.getSize(); i++) {
            System.out.println(customList.get(i));
        }
        
        customList.remove(1);
        System.out.println(customList.get(1));

	}
	
	private static void example2() {

		CustomList<Integer> customList = new CustomArrayList<>();
		
		customList.add(1);
        customList.add(2);
        customList.add(3);
        customList.add(4);
        customList.add(5);
        customList.add(6);
        customList.add(7);
        customList.add(8);
        customList.add(9);
        customList.add(10);
        
        System.out.println(customList.get(8));
        System.out.println(customList.getSize());
        
        customList.remove(8);
        
        System.out.println(customList.getSize());
        
        System.out.println(customList.get(9));
               
	}

}
