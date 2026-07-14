public class Material {

    private static int nextId = 1;

    private int materialId;
    private String materialName;
    private int quantity;
    private double unitPrice;
    private String supplier;


    // Constructor for new material
    public Material(String materialName,
                    int quantity,
                    double unitPrice,
                    String supplier) {

        this.materialId = nextId++;

        setMaterialName(materialName);
        setQuantity(quantity);
        setUnitPrice(unitPrice);
        setSupplier(supplier);
    }



    // Constructor for loading from file
    public Material(int materialId,
                    String materialName,
                    int quantity,
                    double unitPrice,
                    String supplier) {


        this.materialId = materialId;

        if(materialId >= nextId)
            nextId = materialId + 1;


        this.materialName = materialName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.supplier = supplier;
    }




    // Getters

    public int getMaterialId() {
        return materialId;
    }


    public String getMaterialName() {
        return materialName;
    }


    public int getQuantity() {
        return quantity;
    }


    public double getUnitPrice() {
        return unitPrice;
    }


    public String getSupplier() {
        return supplier;
    }



    // Setters

    public void setMaterialName(String materialName) {

        if(materialName == null || materialName.isEmpty())
            throw new IllegalArgumentException("Invalid material name");

        this.materialName = materialName;
    }



    public void setQuantity(int quantity) {

        if(quantity < 0)
            throw new IllegalArgumentException("Invalid quantity");

        this.quantity = quantity;
    }



    public void setUnitPrice(double unitPrice) {

        if(unitPrice < 0)
            throw new IllegalArgumentException("Invalid price");

        this.unitPrice = unitPrice;
    }



    public void setSupplier(String supplier) {

        this.supplier = supplier;
    }




    // Display

    public void displayInfo(){

        System.out.println("Material ID : " + materialId);
        System.out.println("Name        : " + materialName);
        System.out.println("Quantity    : " + quantity);
        System.out.println("Price       : " + unitPrice);
        System.out.println("Supplier    : " + supplier);

    }




    // Save to txt

    public String toFileString(){

        return "Material," +
                materialId + "," +
                materialName + "," +
                quantity + "," +
                unitPrice + "," +
                supplier;
    }
}