package com.stackroute.pe2;

public class Member {
    private String Name;
    private int age;
    private double salary;

    public Member(String name, int age, double salary) {
        Name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String display()
    {
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
        System.out.println("Salary :"+getSalary());
        return getName()+" "+getAge()+" "+getSalary();
    }
}
class MemberVariable {
    public static String setMemberFields(String name,int age,double salary){
        Member Name=new Member(name,age,salary);
        return Name.display();

    }
}