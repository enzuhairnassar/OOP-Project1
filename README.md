Construction Company Management System Project Description A comprehensive software system designed to manage the data of 
a construction company. The system enables users to manage employees (engineers and workers), construction materials, tools, projects, clients, and contractors efficiently.
It includes persistent data storage using text files (TXT) to ensure data integrity across sessions. Interface Type Console-based Application: The system operates via an interactive
menu-driven interface, allowing users to input data and perform operations directly through the command-line terminal. Key FeaturesComprehensive Management: Full support for managing all company
assets (Employees, Projects, Materials, Tools, Clients, and Contractors). Data Persistence: Automatic saving and loading of data using local textfiles. Input Validation: Built-in constraints for
data integrity (e.g., age validation between 18-70, budget validation, and empty-string checks). Flexible Architecture: Modular design built on Object-Oriented Programming (OOP)
principles for easy scalability. OOP Concepts Used The system is built leveraging core OOP principles: Inheritance: Engineer and Worker classes inherit from the abstract Employee base
class. Polymorphism: Method overriding (e.g., calculateSalary() and displayInfo()) is implemented in subclasses to provide specific behaviors.Abstraction: The Employee class is marked as abstract to
define a common interface and enforce implementation in subclasses. Encapsulation: Attributes are protected using private modifiers, with access provided through Getters
and Setters accompanied by validation logic. Key Classes Main: The entry point of the system;
handles the user interface and main logic loop. Employee (Abstract): The base class containing shared attributes for all staff. Engineer & Worker:
Subclasses representing different types of employees. FileManager: Handles all I/O operations (reading and writing data to/from text files).
Project, Material, Tool, Client, Contractor: Entity classes representing the company's core data models.AI Usage Disclosure Artificial Intelligence was utilized during the development of this project to:
Architect the class hierarchy and ensure the correct application of OOP principles. Implement robust validation logic within setter methods to prevent data corruption.
Debug File I/O operations to ensure data is saved and retrieved accurately. Assist in drafting this documentation. How to Run Ensure JDK (Java Development Kit)
is installed on your machine. Place all .java files in the same directory. Compile the files: javac *.java Run the program: java Main Follow theon-screen menu prompts to interact with the system.
Project Team
Zuhair Nassar
Ahmed Ayesh
Ahmed Askar
Mahmoud Dabboor
