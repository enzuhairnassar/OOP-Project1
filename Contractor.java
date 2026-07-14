public class Contractor {

    private static int nextId = 1;


    // Attributes
    private int contractorId;
    private String contractorName;
    private String phone;
    private String address;



    // Constructor for new contractor

    public Contractor(String contractorName,
                      String phone,
                      String address) {


        this.contractorId = nextId++;


        setContractorName(contractorName);
        setPhone(phone);
        setAddress(address);

    }






    // Constructor for loading from TXT

    public Contractor(int contractorId,
                      String contractorName,
                      String phone,
                      String address) {


        this.contractorId = contractorId;


        if(contractorId >= nextId)
            nextId = contractorId + 1;



        this.contractorName = contractorName;
        this.phone = phone;
        this.address = address;

    }







    // Getters


    public int getContractorId() {

        return contractorId;
    }


    public String getContractorName() {

        return contractorName;
    }


    public String getPhone() {

        return phone;
    }


    public String getAddress() {

        return address;
    }







    // Setters (For Update)


    public void setContractorName(String contractorName) {


        if(contractorName == null ||
                contractorName.trim().isEmpty()) {


            throw new IllegalArgumentException(
                    "Contractor name cannot be empty."
            );
        }


        this.contractorName = contractorName;
    }





    public void setPhone(String phone) {

        this.phone = phone;
    }





    public void setAddress(String address) {

        this.address = address;
    }







    // Display Information


    public void displayInfo() {


        System.out.println("Contractor ID : " + contractorId);
        System.out.println("Name          : " + contractorName);
        System.out.println("Phone         : " + phone);
        System.out.println("Address       : " + address);

    }







    // Save to TXT


    public String toFileString() {


        return "Contractor," +
                contractorId + "," +
                contractorName + "," +
                phone + "," +
                address;
    }

}