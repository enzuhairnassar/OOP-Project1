import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    static Scanner input = new Scanner(System.in);



    // Lists

    static ArrayList<Employee> employees;
    static ArrayList<Material> materials;
    static ArrayList<Tool> tools;
    static ArrayList<Project> projects;
    static ArrayList<Client> clients;
    static ArrayList<Contractor> contractors;





    public static void main(String[] args) {



        // Load Data

        employees = FileManager.loadEmployees();

        materials = FileManager.loadMaterials();

        tools = FileManager.loadTools();

        projects = FileManager.loadProjects();

        clients = FileManager.loadClients();

        contractors = FileManager.loadContractors();




        int choice;



        do {


            System.out.println("\n===== Construction Company Management System =====");

            System.out.println("1. Add Engineer");
            System.out.println("2. Add Worker");

            System.out.println("3. Add Material");
            System.out.println("4. Add Tool");

            System.out.println("5. Add Project");
            System.out.println("6. Add Client");
            System.out.println("7. Add Contractor");


            System.out.println("------------------------------");


            System.out.println("8. Display All Data");


            System.out.println("9. Update Employee");
            System.out.println("10. Delete Employee");


            System.out.println("11. Update Material");
            System.out.println("12. Delete Material");


            System.out.println("13. Update Tool");
            System.out.println("14. Delete Tool");


            System.out.println("15. Update Project");
            System.out.println("16. Delete Project");


            System.out.println("17. Update Client");
            System.out.println("18. Delete Client");


            System.out.println("19. Update Contractor");
            System.out.println("20. Delete Contractor");


            System.out.println("0. Exit");



            System.out.print("Choose: ");

            choice = getIntInput();

            input.nextLine();





            switch(choice) {


                case 1:
                    addEngineer();
                    break;


                case 2:
                    addWorker();
                    break;


                case 3:
                    addMaterial();
                    break;


                case 4:
                    addTool();
                    break;


                case 5:
                    addProject();
                    break;


                case 6:
                    addClient();
                    break;


                case 7:
                    addContractor();
                    break;



                case 8:
                    displayAll();
                    break;




                case 9:
                    updateEmployee();
                    break;


                case 10:
                    deleteEmployee();
                    break;




                case 11:
                    updateMaterial();
                    break;


                case 12:
                    deleteMaterial();
                    break;




                case 13:
                    updateTool();
                    break;


                case 14:
                    deleteTool();
                    break;




                case 15:
                    updateProject();
                    break;


                case 16:
                    deleteProject();
                    break;




                case 17:
                    updateClient();
                    break;


                case 18:
                    deleteClient();
                    break;




                case 19:
                    updateContractor();
                    break;


                case 20:
                    deleteContractor();
                    break;





                case 0:

                    System.out.println("Program closed.");

                    break;




                default:

                    System.out.println("Invalid choice.");

            }



        } while(choice != 0);



    }
    static void addEngineer() {


        System.out.print("Name: ");
        String name = input.nextLine();


        System.out.print("Age: ");
        int age = getIntInput();;
        input.nextLine();


        System.out.print("Phone: ");
        String phone = input.nextLine();


        System.out.print("Salary: ");
        double salary =getDoubleInput();;
        input.nextLine();


        System.out.print("Specialization: ");
        String specialization = input.nextLine();


        System.out.print("Experience Years: ");
        int experience = getIntInput();;
        input.nextLine();


        System.out.print("License Number: ");
        String license = input.nextLine();



        Engineer engineer = new Engineer(
                name,
                age,
                phone,
                salary,
                specialization,
                experience,
                license
        );


        employees.add(engineer);


        FileManager.saveEmployees(employees);


        System.out.println("Engineer added successfully.");

    }
    static void addWorker() {


        System.out.print("Name: ");
        String name = input.nextLine();


        System.out.print("Age: ");
        int age = getIntInput();;
        input.nextLine();


        System.out.print("Phone: ");
        String phone = input.nextLine();


        System.out.print("Salary: ");
        double salary = getDoubleInput();;
        input.nextLine();


        System.out.print("Job Type: ");
        String jobType = input.nextLine();


        System.out.print("Daily Wage: ");
        double wage = getDoubleInput();;


        System.out.print("Work Days: ");
        int days = getIntInput();;

        input.nextLine();



        Worker worker = new Worker(
                name,
                age,
                phone,
                salary,
                jobType,
                wage,
                days
        );


        employees.add(worker);


        FileManager.saveEmployees(employees);


        System.out.println("Worker added successfully.");

    }
    static void addMaterial() {


        System.out.print("Material Name: ");
        String name = input.nextLine();


        System.out.print("Quantity: ");
        int quantity = getIntInput();;


        System.out.print("Unit Price: ");
        double price = getDoubleInput();;
        input.nextLine();


        System.out.print("Supplier: ");
        String supplier = input.nextLine();



        Material material = new Material(
                name,
                quantity,
                price,
                supplier
        );


        materials.add(material);


        FileManager.saveMaterials(materials);


        System.out.println("Material added successfully.");

    }
    static void addTool() {


        System.out.print("Tool Name: ");
        String name = input.nextLine();


        System.out.print("Tool Type: ");
        String type = input.nextLine();


        System.out.print("Quantity: ");
        int quantity = getIntInput();;


        System.out.print("Rental Price: ");
        double price = getDoubleInput();;
        input.nextLine();



        Tool tool = new Tool(
                name,
                type,
                quantity,
                price
        );


        tools.add(tool);


        FileManager.saveTools(tools);


        System.out.println("Tool added successfully.");

    }
    static void addProject() {


        System.out.print("Project Name: ");
        String name = input.nextLine();


        System.out.print("Location: ");
        String location = input.nextLine();


        System.out.print("Start Date: ");
        String start = input.nextLine();


        System.out.print("End Date: ");
        String end = input.nextLine();


        System.out.print("Budget: ");
        double budget = getDoubleInput();;
        input.nextLine();


        System.out.print("Status: ");
        String status = input.nextLine();




        Project project = new Project(
                name,
                location,
                start,
                end,
                budget,
                status
        );


        projects.add(project);


        FileManager.saveProjects(projects);


        System.out.println("Project added successfully.");

    }
    static void addClient() {


        System.out.print("Client Name: ");
        String name = input.nextLine();


        System.out.print("Phone: ");
        String phone = input.nextLine();


        System.out.print("Address: ");
        String address = input.nextLine();



        Client client = new Client(
                name,
                phone,
                address
        );


        clients.add(client);


        FileManager.saveClients(clients);


        System.out.println("Client added successfully.");

    }
    static void addContractor() {


        System.out.print("Contractor Name: ");
        String name = input.nextLine();


        System.out.print("Phone: ");
        String phone = input.nextLine();


        System.out.print("Address: ");
        String address = input.nextLine();




        Contractor contractor = new Contractor(
                name,
                phone,
                address
        );


        contractors.add(contractor);


        FileManager.saveContractors(contractors);


        System.out.println("Contractor added successfully.");

    }
    static void displayAll() {


        System.out.println("\n===== Employees =====");

        if(employees.isEmpty()) {

            System.out.println("No employees found.");

        } else {

            for(Employee employee : employees) {

                employee.displayInfo();
                System.out.println("--------------------");

            }
        }





        System.out.println("\n===== Materials =====");


        if(materials.isEmpty()) {

            System.out.println("No materials found.");

        } else {


            for(Material material : materials) {

                material.displayInfo();
                System.out.println("--------------------");

            }
        }






        System.out.println("\n===== Tools =====");


        if(tools.isEmpty()) {

            System.out.println("No tools found.");

        } else {


            for(Tool tool : tools) {

                tool.displayInfo();
                System.out.println("--------------------");

            }
        }






        System.out.println("\n===== Projects =====");


        if(projects.isEmpty()) {

            System.out.println("No projects found.");

        } else {


            for(Project project : projects) {

                project.displayInfo();
                System.out.println("--------------------");

            }
        }







        System.out.println("\n===== Clients =====");


        if(clients.isEmpty()) {

            System.out.println("No clients found.");

        } else {


            for(Client client : clients) {

                client.displayInfo();
                System.out.println("--------------------");

            }
        }







        System.out.println("\n===== Contractors =====");


        if(contractors.isEmpty()) {

            System.out.println("No contractors found.");

        } else {


            for(Contractor contractor : contractors) {

                contractor.displayInfo();
                System.out.println("--------------------");

            }
        }

    }
    static int getIntInput() {

        while(true) {

            try {

                return input.nextInt();

            } catch (java.util.InputMismatchException e) {

                System.out.println("Invalid input! Please enter numbers only.");

                input.nextLine();
            }
        }
    }
    static double getDoubleInput() {


        while(true) {


            try {

                return input.nextDouble();


            } catch (java.util.InputMismatchException e) {


                System.out.println("Invalid input! Please enter a number.");


                input.nextLine();

            }
        }
    }
    static void updateEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = getIntInput();
        input.nextLine();


        for(Employee emp : employees) {

            if(emp.getEmployeeId() == id) {


                System.out.print("New Name: ");
                String name = input.nextLine();


                System.out.print("New Phone: ");
                String phone = input.nextLine();


                System.out.print("New Salary: ");
                double salary = getDoubleInput();
                input.nextLine();


                emp.setName(name);
                emp.setPhone(phone);
                emp.setSalary(salary);


                FileManager.saveEmployees(employees);


                System.out.println("Employee updated successfully.");

                return;
            }
        }


        System.out.println("Employee not found.");

    }
    static void deleteEmployee() {


        System.out.print("Enter Employee ID: ");
        int id = getIntInput();


        for(int i = 0; i < employees.size(); i++) {


            if(employees.get(i).getEmployeeId() == id) {


                employees.remove(i);


                FileManager.saveEmployees(employees);


                System.out.println("Employee deleted successfully.");

                return;
            }
        }


        System.out.println("Employee not found.");

    }
    static void updateMaterial() {


        System.out.print("Enter Material ID: ");
        int id = getIntInput();
        input.nextLine();


        for(Material material : materials) {


            if(material.getMaterialId() == id) {


                System.out.print("New Material Name: ");
                String name = input.nextLine();


                System.out.print("New Quantity: ");
                int quantity = getIntInput();


                System.out.print("New Unit Price: ");
                double price = getDoubleInput();
                input.nextLine();


                System.out.print("New Supplier: ");
                String supplier = input.nextLine();



                material.setMaterialName(name);
                material.setQuantity(quantity);
                material.setUnitPrice(price);
                material.setSupplier(supplier);



                FileManager.saveMaterials(materials);


                System.out.println("Material updated successfully.");

                return;

            }

        }


        System.out.println("Material not found.");

    }
    static void deleteMaterial() {


        System.out.print("Enter Material ID: ");
        int id = getIntInput();


        for(int i = 0; i < materials.size(); i++) {


            if(materials.get(i).getMaterialId() == id) {


                materials.remove(i);


                FileManager.saveMaterials(materials);


                System.out.println("Material deleted successfully.");


                return;

            }

        }


        System.out.println("Material not found.");

    }
    static void updateTool() {


        System.out.print("Enter Tool ID: ");
        int id = getIntInput();
        input.nextLine();


        for(Tool tool : tools) {


            if(tool.getToolId() == id) {


                System.out.print("New Tool Name: ");
                String name = input.nextLine();


                System.out.print("New Tool Type: ");
                String type = input.nextLine();


                System.out.print("New Quantity: ");
                int quantity = getIntInput();


                System.out.print("New Rental Price: ");
                double price = getDoubleInput();
                input.nextLine();




                tool.setToolName(name);
                tool.setToolType(type);
                tool.setQuantity(quantity);
                tool.setRentalPrice(price);



                FileManager.saveTools(tools);


                System.out.println("Tool updated successfully.");


                return;

            }

        }


        System.out.println("Tool not found.");

    }
    static void deleteTool() {


        System.out.print("Enter Tool ID: ");
        int id = getIntInput();



        for(int i = 0; i < tools.size(); i++) {


            if(tools.get(i).getToolId() == id) {


                tools.remove(i);


                FileManager.saveTools(tools);


                System.out.println("Tool deleted successfully.");


                return;

            }

        }


        System.out.println("Tool not found.");

    }
    static void updateProject() {


        System.out.print("Enter Project ID: ");
        int id = getIntInput();
        input.nextLine();



        for(Project project : projects) {


            if(project.getProjectId() == id) {



                System.out.print("New Project Name: ");
                String name = input.nextLine();



                System.out.print("New Location: ");
                String location = input.nextLine();



                System.out.print("New Start Date: ");
                String start = input.nextLine();



                System.out.print("New End Date: ");
                String end = input.nextLine();



                System.out.print("New Budget: ");
                double budget = getDoubleInput();
                input.nextLine();



                System.out.print("New Status: ");
                String status = input.nextLine();




                project.setProjectName(name);
                project.setLocation(location);
                project.setStartDate(start);
                project.setEndDate(end);
                project.setBudget(budget);
                project.setStatus(status);




                FileManager.saveProjects(projects);



                System.out.println("Project updated successfully.");


                return;

            }

        }



        System.out.println("Project not found.");

    }
    static void deleteProject() {


        System.out.print("Enter Project ID: ");
        int id = getIntInput();



        for(int i = 0; i < projects.size(); i++) {



            if(projects.get(i).getProjectId() == id) {



                projects.remove(i);



                FileManager.saveProjects(projects);



                System.out.println("Project deleted successfully.");


                return;

            }

        }



        System.out.println("Project not found.");

    }
    static void deleteClient() {


        System.out.print("Enter Client ID: ");
        int id = getIntInput();



        for(int i = 0; i < clients.size(); i++) {



            if(clients.get(i).getClientId() == id) {



                clients.remove(i);



                FileManager.saveClients(clients);



                System.out.println("Client deleted successfully.");


                return;

            }

        }



        System.out.println("Client not found.");

    }
    static void updateClient() {


        System.out.print("Enter Client ID: ");
        int id = getIntInput();
        input.nextLine();



        for(Client client : clients) {


            if(client.getClientId() == id) {



                System.out.print("New Client Name: ");
                String name = input.nextLine();



                System.out.print("New Phone: ");
                String phone = input.nextLine();



                System.out.print("New Address: ");
                String address = input.nextLine();




                client.setName(name);
                client.setPhone(phone);
                client.setAddress(address);




                FileManager.saveClients(clients);



                System.out.println("Client updated successfully.");


                return;

            }

        }



        System.out.println("Client not found.");

    }
    static void updateContractor() {


        System.out.print("Enter Contractor ID: ");
        int id = getIntInput();
        input.nextLine();



        for(Contractor contractor : contractors) {


            if(contractor.getContractorId() == id) {



                System.out.print("New Contractor Name: ");
                String name = input.nextLine();



                System.out.print("New Phone: ");
                String phone = input.nextLine();



                System.out.print("New Address: ");
                String address = input.nextLine();
                contractor.setContractorName(name);
                contractor.setPhone(phone);
                contractor.setAddress(address);




                FileManager.saveContractors(contractors);



                System.out.println("Contractor updated successfully.");
                return;

            }
        }

        System.out.println("Contractor not found.");
    }
    static void deleteContractor() {
        System.out.print("Enter Contractor ID: ");
        int id = getIntInput();
        for(int i = 0; i < contractors.size(); i++) {
            if(contractors.get(i).getContractorId() == id) {
                contractors.remove(i);
                FileManager.saveContractors(contractors);
                System.out.println("Contractor deleted successfully.");
                return;
            }

        }
        System.out.println("Contractor not found.");

    }
        }


