package basic.ded;

import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[2];

		input(sc, students);
		print(students);
	}

	public static void print(Student[] students) {
		System.out.println("Danh sach 2 sinh vien da nhap: ");
		for (int i = 0; i < students.length; i++) {
			System.out.println("Sinh vien thu " + (i + 1) + ": ");
			System.out.println("Name: " + students[i].getName());
			System.out.println("Age: " + students[i].getAge());
			System.out.println("Address: " + students[i].getAddress());
			System.out.println("Phone number: " + students[i].getPhone());
			System.out.println("Average Score: " + students[i].getAverage());
			System.out.println("========================");
		}
	}
	public static void input(Scanner sc, Student[] students) {
	    for (int i = 0; i < students.length; i++) {
	    	System.out.print("Nhap ten sinh vien thu " + (i + 1) + ": ");
	    	String name = sc.nextLine();
	    	System.out.print("Nhap tuoi sinh vien thu " + (i + 1) + ": ");
	    	int age = sc.nextInt();
	    	sc.nextLine();
	    	System.out.print("Nhap dia chi sinh vien thu " + (i + 1) + ": ");
	    	String address = sc.nextLine();
	    	System.out.print("Nhap so dien thoai sinh thu " + (i + 1) + ": ");
	    	String phone = sc.nextLine();
	    	System.out.print("Nhap diem trung binh sinh vien thu " + (i + 1) + ": ");
	    	double average = sc.nextDouble();
	    	sc.nextLine();
	    	System.out.println();
	    	System.out.println("========================");

	    	students[i] = new Student(name, age, address, phone, average);
	    }
	}
}
