import java.io.*;
import java.util.ArrayList;
public class FileManager {
    // ================= SAVE EMPLOYEES =================

    public static void saveEmployees(ArrayList<Employee> employees) {

        try (FileWriter writer = new FileWriter("employees.txt")) {


            for(Employee employee : employees) {

                writer.write(employee.toFileString());
                writer.write("\n");
            }


        } catch(IOException e) {

            System.out.println("Error saving employees: " + e.getMessage());
        }
    }




// ================= LOAD EMPLOYEES =================

    public static ArrayList<Employee> loadEmployees() {


        ArrayList<Employee> employees = new ArrayList<>();


        File file = new File("employees.txt");


        if(!file.exists()) {

            System.out.println("Employees file does not exist yet.");
            return employees;
        }




        try(BufferedReader reader =
                    new BufferedReader(new FileReader(file))) {



            String line;


            while((line = reader.readLine()) != null) {


                String[] data = line.split(",");



                if(data[0].equals("Engineer")) {


                    Engineer engineer = new Engineer(
                            Integer.parseInt(data[1]),
                            data[2],
                            Integer.parseInt(data[3]),
                            data[4],
                            Double.parseDouble(data[5]),
                            data[6],
                            Integer.parseInt(data[7]),
                            data[8]
                    );


                    employees.add(engineer);

                }



                else if(data[0].equals("Worker")) {


                    Worker worker = new Worker(
                            Integer.parseInt(data[1]),
                            data[2],
                            Integer.parseInt(data[3]),
                            data[4],
                            Double.parseDouble(data[5]),
                            data[6],
                            Double.parseDouble(data[7]),
                            Integer.parseInt(data[8])
                    );


                    employees.add(worker);

                }

            }



        } catch(Exception e) {

            System.out.println("Error loading employees: "
                    + e.getMessage());
        }



        return employees;
    }
    // ================= SAVE MATERIALS =================

    public static void saveMaterials(ArrayList<Material> materials) {

        try(FileWriter writer = new FileWriter("materials.txt")) {


            for(Material material : materials) {

                writer.write(material.toFileString());
                writer.write("\n");
            }


        } catch(IOException e) {

            System.out.println("Error saving materials: "
                    + e.getMessage());
        }
    }






// ================= LOAD MATERIALS =================

    public static ArrayList<Material> loadMaterials() {


        ArrayList<Material> materials = new ArrayList<>();


        File file = new File("materials.txt");


        if(!file.exists()) {

            return materials;
        }



        try(BufferedReader reader =
                    new BufferedReader(new FileReader(file))) {


            String line;


            while((line = reader.readLine()) != null) {


                String[] data = line.split(",");



                Material material = new Material(

                        Integer.parseInt(data[1]),
                        data[2],
                        Integer.parseInt(data[3]),
                        Double.parseDouble(data[4]),
                        data[5]

                );


                materials.add(material);

            }



        } catch(Exception e) {

            System.out.println("Error loading materials: "
                    + e.getMessage());
        }



        return materials;
    }







// ================= UPDATE MATERIAL =================

    public static void updateMaterial(int id,
                                      String name,
                                      int quantity,
                                      double price,
                                      String supplier,
                                      ArrayList<Material> materials) {



        for(Material material : materials) {


            if(material.getMaterialId() == id) {


                material.setMaterialName(name);
                material.setQuantity(quantity);
                material.setUnitPrice(price);
                material.setSupplier(supplier);



                saveMaterials(materials);


                System.out.println("Material updated successfully.");

                return;
            }
        }


        System.out.println("Material not found.");
    }






// ================= DELETE MATERIAL =================

    public static void deleteMaterial(int id,
                                      ArrayList<Material> materials) {


        Material remove = null;


        for(Material material : materials) {


            if(material.getMaterialId() == id) {

                remove = material;
                break;
            }
        }



        if(remove != null) {


            materials.remove(remove);

            saveMaterials(materials);


            System.out.println("Material deleted successfully.");

        }
        else {

            System.out.println("Material not found.");
        }
    }
    // ================= SAVE TOOLS =================

    public static void saveTools(ArrayList<Tool> tools) {


        try(FileWriter writer = new FileWriter("tools.txt")) {


            for(Tool tool : tools) {


                writer.write(tool.toFileString());
                writer.write("\n");

            }


        } catch(IOException e) {

            System.out.println("Error saving tools: "
                    + e.getMessage());
        }
    }







// ================= LOAD TOOLS =================

    public static ArrayList<Tool> loadTools() {


        ArrayList<Tool> tools = new ArrayList<>();


        File file = new File("tools.txt");


        if(!file.exists()) {

            return tools;
        }




        try(BufferedReader reader =
                    new BufferedReader(new FileReader(file))) {



            String line;


            while((line = reader.readLine()) != null) {


                String[] data = line.split(",");



                Tool tool = new Tool(

                        Integer.parseInt(data[1]),
                        data[2],
                        data[3],
                        Integer.parseInt(data[4]),
                        Double.parseDouble(data[5])

                );


                tools.add(tool);

            }


        } catch(Exception e) {


            System.out.println("Error loading tools: "
                    + e.getMessage());
        }




        return tools;
    }






// ================= UPDATE TOOL =================

    public static void updateTool(int id,
                                  String name,
                                  String type,
                                  int quantity,
                                  double price,
                                  ArrayList<Tool> tools) {



        for(Tool tool : tools) {


            if(tool.getToolId() == id) {


                tool.setToolName(name);
                tool.setToolType(type);
                tool.setQuantity(quantity);
                tool.setRentalPrice(price);



                saveTools(tools);


                System.out.println("Tool updated successfully.");

                return;
            }
        }


        System.out.println("Tool not found.");
    }







// ================= DELETE TOOL =================

    public static void deleteTool(int id,
                                  ArrayList<Tool> tools) {



        Tool remove = null;


        for(Tool tool : tools) {


            if(tool.getToolId() == id) {

                remove = tool;
                break;
            }
        }



        if(remove != null) {


            tools.remove(remove);

            saveTools(tools);


            System.out.println("Tool deleted successfully.");

        }
        else {

            System.out.println("Tool not found.");
        }
    }
    // ================= SAVE PROJECTS =================

    public static void saveProjects(ArrayList<Project> projects) {


        try(FileWriter writer = new FileWriter("projects.txt")) {


            for(Project project : projects) {


                writer.write(project.toFileString());
                writer.write("\n");

            }


        } catch(IOException e) {

            System.out.println("Error saving projects: "
                    + e.getMessage());
        }
    }






// ================= LOAD PROJECTS =================

    public static ArrayList<Project> loadProjects() {


        ArrayList<Project> projects = new ArrayList<>();


        File file = new File("projects.txt");


        if(!file.exists()) {

            return projects;
        }



        try(BufferedReader reader =
                    new BufferedReader(new FileReader(file))) {


            String line;


            while((line = reader.readLine()) != null) {


                String[] data = line.split(",");



                Project project = new Project(

                        Integer.parseInt(data[1]),
                        data[2],
                        data[3],
                        data[4],
                        data[5],
                        Double.parseDouble(data[6]),
                        data[7]

                );


                projects.add(project);
            }



        } catch(Exception e) {

            System.out.println("Error loading projects: "
                    + e.getMessage());
        }



        return projects;
    }






// ================= UPDATE PROJECT =================

    public static void updateProject(int id,
                                     String name,
                                     String location,
                                     String start,
                                     String end,
                                     double budget,
                                     String status,
                                     ArrayList<Project> projects) {


        for(Project project : projects) {


            if(project.getProjectId() == id) {


                project.setProjectName(name);
                project.setLocation(location);
                project.setStartDate(start);
                project.setEndDate(end);
                project.setBudget(budget);
                project.setStatus(status);



                saveProjects(projects);


                System.out.println("Project updated successfully.");

                return;
            }
        }


        System.out.println("Project not found.");
    }







// ================= DELETE PROJECT =================

    public static void deleteProject(int id,
                                     ArrayList<Project> projects) {


        Project remove = null;


        for(Project project : projects) {


            if(project.getProjectId() == id) {

                remove = project;
                break;
            }
        }



        if(remove != null) {


            projects.remove(remove);

            saveProjects(projects);


            System.out.println("Project deleted successfully.");

        }
        else {

            System.out.println("Project not found.");
        }
    }
    // ================= SAVE CLIENTS =================

    public static void saveClients(ArrayList<Client> clients) {


        try(FileWriter writer = new FileWriter("clients.txt")) {


            for(Client client : clients) {


                writer.write(client.toFileString());
                writer.write("\n");

            }


        } catch(IOException e) {

            System.out.println("Error saving clients: "
                    + e.getMessage());
        }
    }






// ================= LOAD CLIENTS =================

    public static ArrayList<Client> loadClients() {


        ArrayList<Client> clients = new ArrayList<>();


        File file = new File("clients.txt");


        if(!file.exists()) {

            return clients;
        }



        try(BufferedReader reader =
                    new BufferedReader(new FileReader(file))) {


            String line;


            while((line = reader.readLine()) != null) {


                String[] data = line.split(",");



                Client client = new Client(

                        Integer.parseInt(data[1]),
                        data[2],
                        data[3],
                        data[4]

                );


                clients.add(client);

            }



        } catch(Exception e) {

            System.out.println("Error loading clients: "
                    + e.getMessage());
        }



        return clients;
    }







// ================= UPDATE CLIENT =================

    public static void updateClient(int id,
                                    String name,
                                    String phone,
                                    String address,
                                    ArrayList<Client> clients) {


        for(Client client : clients) {


            if(client.getClientId() == id) {


                client.setClientName(name);
                client.setPhone(phone);
                client.setAddress(address);



                saveClients(clients);


                System.out.println("Client updated successfully.");

                return;
            }
        }


        System.out.println("Client not found.");
    }







// ================= DELETE CLIENT =================

    public static void deleteClient(int id,
                                    ArrayList<Client> clients) {


        Client remove = null;


        for(Client client : clients) {


            if(client.getClientId() == id) {

                remove = client;
                break;
            }
        }



        if(remove != null) {


            clients.remove(remove);

            saveClients(clients);


            System.out.println("Client deleted successfully.");

        }
        else {

            System.out.println("Client not found.");
        }
    }
    // ================= SAVE CONTRACTORS =================

    public static void saveContractors(ArrayList<Contractor> contractors) {


        try(FileWriter writer = new FileWriter("contractors.txt")) {


            for(Contractor contractor : contractors) {


                writer.write(contractor.toFileString());
                writer.write("\n");

            }


        } catch(IOException e) {

            System.out.println("Error saving contractors: "
                    + e.getMessage());
        }
    }






// ================= LOAD CONTRACTORS =================

    public static ArrayList<Contractor> loadContractors() {


        ArrayList<Contractor> contractors = new ArrayList<>();


        File file = new File("contractors.txt");


        if(!file.exists()) {

            return contractors;
        }




        try(BufferedReader reader =
                    new BufferedReader(new FileReader(file))) {



            String line;


            while((line = reader.readLine()) != null) {


                String[] data = line.split(",");



                Contractor contractor = new Contractor(

                        Integer.parseInt(data[1]),
                        data[2],
                        data[3],
                        data[4]

                );


                contractors.add(contractor);

            }



        } catch(Exception e) {

            System.out.println("Error loading contractors: "
                    + e.getMessage());
        }




        return contractors;
    }







// ================= UPDATE CONTRACTOR =================

    public static void updateContractor(int id,
                                        String name,
                                        String phone,
                                        String address,
                                        ArrayList<Contractor> contractors) {


        for(Contractor contractor : contractors) {


            if(contractor.getContractorId() == id) {


                contractor.setContractorName(name);
                contractor.setPhone(phone);
                contractor.setAddress(address);



                saveContractors(contractors);


                System.out.println("Contractor updated successfully.");

                return;
            }
        }


        System.out.println("Contractor not found.");
    }







// ================= DELETE CONTRACTOR =================

    public static void deleteContractor(int id,
                                        ArrayList<Contractor> contractors) {


        Contractor remove = null;


        for(Contractor contractor : contractors) {


            if(contractor.getContractorId() == id) {

                remove = contractor;
                break;
            }
        }



        if(remove != null) {


            contractors.remove(remove);


            saveContractors(contractors);


            System.out.println("Contractor deleted successfully.");

        }
        else {

            System.out.println("Contractor not found.");
        }
    }
}