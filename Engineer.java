public class Engineer extends Employee {


    private String specialization;
    private int experienceYears;
    private String licenseNumber;



    // Constructor for new Engineer

    public Engineer(String name,
                    int age,
                    String phone,
                    double salary,
                    String specialization,
                    int experienceYears,
                    String licenseNumber) {


        super(name, age, phone, salary);


        setSpecialization(specialization);
        setExperienceYears(experienceYears);
        setLicenseNumber(licenseNumber);

    }




    // Constructor for loading from TXT

    public Engineer(int employeeId,
                    String name,
                    int age,
                    String phone,
                    double salary,
                    String specialization,
                    int experienceYears,
                    String licenseNumber) {


        super(employeeId, name, age, phone, salary);


        this.specialization = specialization;
        this.experienceYears = experienceYears;
        this.licenseNumber = licenseNumber;

    }




    public String getSpecialization() {

        return specialization;
    }


    public int getExperienceYears() {

        return experienceYears;
    }


    public String getLicenseNumber() {

        return licenseNumber;
    }





    public void setSpecialization(String specialization) {

        this.specialization = specialization;
    }




    public void setExperienceYears(int experienceYears) {

        if(experienceYears < 0)
            throw new IllegalArgumentException("Invalid experience");

        this.experienceYears = experienceYears;
    }




    public void setLicenseNumber(String licenseNumber) {

        this.licenseNumber = licenseNumber;
    }





    @Override
    public double calculateSalary() {

        return getSalary() + (experienceYears * 100);
    }





    @Override
    public void displayInfo() {


        super.displayInfo();

        System.out.println("Specialization : " + specialization);
        System.out.println("Experience     : " + experienceYears);
        System.out.println("License Number : " + licenseNumber);

    }





    @Override
    public String toFileString() {


        return "Engineer," +
                getEmployeeId() + "," +
                getName() + "," +
                getAge() + "," +
                getPhone() + "," +
                getSalary() + "," +
                specialization + "," +
                experienceYears + "," +
                licenseNumber;
    }
}