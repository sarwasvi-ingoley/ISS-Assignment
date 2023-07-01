package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10,"Ramesh", 34));
        employees.add(new Employee(20,"Suresh", 29));
        employees.add(new Employee(30,"Kartik", 32));

        Collections.sort(employees, new MySort()); // ascending order via class
        System.out.println(employees);

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getId()- o1.getId(); // sorting desc order
            }
        });
        System.out.println(employees);
    }
}

class MySort implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
}
