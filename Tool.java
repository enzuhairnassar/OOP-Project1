public class Tool {

    private static int nextId = 1;


    // Attributes
    private int toolId;
    private String toolName;
    private String toolType;
    private int quantity;
    private double rentalPrice;



    // Constructor for new Tool

    public Tool(String toolName,
                String toolType,
                int quantity,
                double rentalPrice) {


        this.toolId = nextId++;

        setToolName(toolName);
        setToolType(toolType);
        setQuantity(quantity);
        setRentalPrice(rentalPrice);
    }





    // Constructor for loading from TXT file

    public Tool(int toolId,
                String toolName,
                String toolType,
                int quantity,
                double rentalPrice) {


        this.toolId = toolId;


        if(toolId >= nextId)
            nextId = toolId + 1;


        this.toolName = toolName;
        this.toolType = toolType;
        this.quantity = quantity;
        this.rentalPrice = rentalPrice;
    }





    // Getters


    public int getToolId() {

        return toolId;
    }


    public String getToolName() {

        return toolName;
    }


    public String getToolType() {

        return toolType;
    }


    public int getQuantity() {

        return quantity;
    }


    public double getRentalPrice() {

        return rentalPrice;
    }






    // Setters (For Update)


    public void setToolName(String toolName) {


        if(toolName == null || toolName.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Tool name cannot be empty."
            );
        }


        this.toolName = toolName;
    }





    public void setToolType(String toolType) {


        if(toolType == null || toolType.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Tool type cannot be empty."
            );
        }


        this.toolType = toolType;
    }





    public void setQuantity(int quantity) {


        if(quantity < 0) {

            throw new IllegalArgumentException(
                    "Quantity cannot be negative."
            );
        }


        this.quantity = quantity;
    }





    public void setRentalPrice(double rentalPrice) {


        if(rentalPrice < 0) {

            throw new IllegalArgumentException(
                    "Rental price cannot be negative."
            );
        }


        this.rentalPrice = rentalPrice;
    }







    // Display Information


    public void displayInfo() {


        System.out.println("Tool ID       : " + toolId);
        System.out.println("Tool Name     : " + toolName);
        System.out.println("Tool Type     : " + toolType);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Rental Price  : " + rentalPrice);

    }






    // Save to TXT file


    public String toFileString() {


        return "Tool," +
                toolId + "," +
                toolName + "," +
                toolType + "," +
                quantity + "," +
                rentalPrice;
    }

}