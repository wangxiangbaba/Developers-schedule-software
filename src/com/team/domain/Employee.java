package com.team.domain;

public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(int id,int age,String name,double salary) {
        super();
        this.id = id;
        this.age= age;
        this.name = name;
        this.salary = salary;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getDetails(){
        return id+"\t"+age+"\t"+name+"\t"+salary;
    }
    @Override
    public String toString() {
        return getDetails();
    }
}
