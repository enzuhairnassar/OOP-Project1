public class Worker extends Employee {


    private String jobType;
    private double dailyWage;
    private int workDays;




    // Constructor for new Worker

    public Worker(String name,
                  int age,
                  String phone,
                  double salary,
                  String jobType,
                  double dailyWage,
                  int workDays) {


        super(name, age, phone, salary);


        setJobType(jobType);
        setDailyWage(dailyWage);
        setWorkDays(workDays);

    }






    // Constructor for loading from TXT

    public Worker(int employeeId,
                  String name,
                  int age,
                  String phone,
                  double salary,
                  String jobType,
                  double dailyWage,
                  int workDays) {


        super(employeeId, name, age, phone, salary);


        this.jobType = jobType;
        this.dailyWage = dailyWage;
        this.workDays = workDays;

    }






    public String getJobType() {

        return jobType;
    }


    public double getDailyWage() {

        return dailyWage;
    }


    public int getWorkDays() {

        return workDays;
    }





    public void setJobType(String jobType) {

        this.jobType = jobType;
    }




    public void setDailyWage(double dailyWage) {

        this.dailyWage = dailyWage;
    }




    public void setWorkDays(int workDays) {

        this.workDays = workDays;
    }





    @Override
    public double calculateSalary() {

        return dailyWage * workDays;
    }





    @Override
    public void displayInfo() {


        super.displayInfo();

        System.out.println("Job Type    : " + jobType);
        System.out.println("Daily Wage  : " + dailyWage);
        System.out.println("Work Days   : " + workDays);

    }





    @Override
    public String toFileString() {


        return "Worker," +
                getEmployeeId() + "," +
                getName() + "," +
                getAge() + "," +
                getPhone() + "," +
                getSalary() + "," +
                jobType + "," +
                dailyWage + "," +
                workDays;

    }
}