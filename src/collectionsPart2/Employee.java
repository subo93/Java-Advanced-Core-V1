package collectionsPart2;

public class Employee {

    String name;
    int age;
    double salary;
    String address;

    //generate constructors of no arguments, all arguments

    public Employee() {
    }

    public Employee(String name, int age, double salary, String address) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }
   //generate getter and setters

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getSalary() {
            return salary;
        }

        public String getAddress() {
            return address;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        //generate toString method
        @Override
        public String toString() {
            return "Employee{" + "name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address + '}';
        }


}
