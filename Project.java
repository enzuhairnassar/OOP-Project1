public class Project {

    private static int nextId = 1;


    // Attributes
    private int projectId;
    private String projectName;
    private String location;
    private String startDate;
    private String endDate;
    private double budget;
    private String status;



    // Constructor for new project

    public Project(String projectName,
                   String location,
                   String startDate,
                   String endDate,
                   double budget,
                   String status) {


        this.projectId = nextId++;


        setProjectName(projectName);
        setLocation(location);
        setStartDate(startDate);
        setEndDate(endDate);
        setBudget(budget);
        setStatus(status);

    }





    // Constructor for loading from TXT

    public Project(int projectId,
                   String projectName,
                   String location,
                   String startDate,
                   String endDate,
                   double budget,
                   String status) {


        this.projectId = projectId;


        if(projectId >= nextId)
            nextId = projectId + 1;



        this.projectName = projectName;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.budget = budget;
        this.status = status;

    }






    // Getters


    public int getProjectId() {

        return projectId;
    }


    public String getProjectName() {

        return projectName;
    }


    public String getLocation() {

        return location;
    }


    public String getStartDate() {

        return startDate;
    }


    public String getEndDate() {

        return endDate;
    }


    public double getBudget() {

        return budget;
    }


    public String getStatus() {

        return status;
    }







    // Setters (For Update)


    public void setProjectName(String projectName) {


        if(projectName == null || projectName.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Project name cannot be empty."
            );
        }


        this.projectName = projectName;
    }





    public void setLocation(String location) {

        this.location = location;
    }





    public void setStartDate(String startDate) {

        this.startDate = startDate;
    }





    public void setEndDate(String endDate) {

        this.endDate = endDate;
    }





    public void setBudget(double budget) {


        if(budget < 0) {

            throw new IllegalArgumentException(
                    "Budget cannot be negative."
            );
        }


        this.budget = budget;
    }





    public void setStatus(String status) {

        this.status = status;
    }








    // Display Information


    public void displayInfo() {


        System.out.println("Project ID    : " + projectId);
        System.out.println("Name          : " + projectName);
        System.out.println("Location      : " + location);
        System.out.println("Start Date    : " + startDate);
        System.out.println("End Date      : " + endDate);
        System.out.println("Budget        : " + budget);
        System.out.println("Status        : " + status);

    }







    // Save to TXT


    public String toFileString() {


        return "Project," +
                projectId + "," +
                projectName + "," +
                location + "," +
                startDate + "," +
                endDate + "," +
                budget + "," +
                status;
    }

}