package basic.ded;

public class Student {
	private String name;
	private int age;
	private String address;
	private String phone;
	private double average;
	
	public Student (String name, int age, String address, String phone, double average) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.average = average;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public double getAverage() {
		return average;
	}
}