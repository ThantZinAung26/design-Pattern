package com.design.compositePattern;

public class Main {
	public static void main(String[] args) {
		Employee CEO = new Employee("Thant Zin Aung","CEO",1000000);
		Employee manager = new Employee("Mg ko", "Manager", 600000);
		Employee hardSale = new Employee("Htet Htet", "HeadSale", 400000);
		
		Employee headMarketing = new Employee("Michel","Head Marketing",500000);
		Employee saleMan2 = new Employee("Ko Ko", "Sale", 300000);
		Employee saleMan1 = new Employee("Ko Ko Mg", "Sale", 330000);
		Employee marketer1 = new Employee("Thaw Zin", "Marketing", 200000);
		Employee marketer2 = new Employee("Hla Hla", "Marketing", 230000);
		
		CEO.add(manager);
		manager.add(hardSale);
		manager.add(headMarketing);
		hardSale.add(saleMan1);
		hardSale.add(saleMan2);
		headMarketing.add(marketer1);
		headMarketing.add(marketer2);
		
		System.out.println(CEO);
		for (Employee headEmployee: CEO.getSubordinates()) {
			System.out.println(headEmployee);
			for (Employee employee: headEmployee.getSubordinates()) {
				System.out.println(employee);
				for (Employee employeeB: employee.getSubordinates()) {
					System.out.println(employeeB);
				}
			}
		}
	}
}
