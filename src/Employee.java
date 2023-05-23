public class Employee {

    boolean isPayedPerHour;

    int age;

    String department;

    String name;

    Employee (int age, String department, boolean isPayedPerHour, String name) {
        this.age = age;
        this.department= department;
        this.isPayedPerHour = isPayedPerHour;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name ;
//                ", Age: " + age +
//                ", Department: " + department +
//                ", Is payed per hour: " + isPayedPerHour;
    }

    public String getName() {
        return name;
    }
}
