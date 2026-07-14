public abstract class Employee {

    // Automatic ID Generator
    private static int nextId = 1;

    // Attributes
    private int employeeId;
    private String name;
    private int age;
    private String phone;
    private double salary;

    // Default Constructor
    public Employee() {
    }

    // Constructor for creating a new employee
    public Employee(String name, int age, String phone, double salary) {

        this.employeeId = nextId++;

        setName(name);
        setAge(age);
        setPhone(phone);
        setSalary(salary);
    }

    // Constructor for loading employee from TXT file
    public Employee(int employeeId, String name, int age,
                    String phone, double salary) {

        this.employeeId = employeeId;

        if (employeeId >= nextId) {
            nextId = employeeId + 1;
        }

        setName(name);
        setAge(age);
        setPhone(phone);
        setSalary(salary);
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    // Setters with Validation
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee name cannot be empty.");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 18 || age > 70) {
            throw new IllegalArgumentException("Age must be between 18 and 70.");
        }
        this.age = age;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be empty.");
        }
        this.phone = phone;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.salary = salary;
    }

    // Abstract Method
    public abstract double calculateSalary();

    // Display Information
    public void displayInfo() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Phone       : " + phone);
        System.out.println("Salary      : " + calculateSalary());
    }

    // Save data to TXT file
    public String toFileString() {
        return employeeId + "," +
                name + "," +
                age + "," +
                phone + "," +
                salary;
    }
}