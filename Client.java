public class Client {

    private static int nextId = 1;


    // Attributes
    private int clientId;
    private String clientName;
    private String phone;
    private String address;



    // Constructor for new client

    public Client(String clientName,
                  String phone,
                  String address) {


        this.clientId = nextId++;


        setClientName(clientName);
        setPhone(phone);
        setAddress(address);

    }





    // Constructor for loading from TXT

    public Client(int clientId,
                  String clientName,
                  String phone,
                  String address) {


        this.clientId = clientId;


        if(clientId >= nextId)
            nextId = clientId + 1;



        this.clientName = clientName;
        this.phone = phone;
        this.address = address;

    }





    // Getters


    public int getClientId() {

        return clientId;
    }


    public String getClientName() {

        return clientName;
    }


    public String getPhone() {

        return phone;
    }


    public String getAddress() {

        return address;
    }







    // Setters (For Update)


    public void setClientName(String clientName) {


        if(clientName == null || clientName.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Client name cannot be empty."
            );
        }


        this.clientName = clientName;
    }





    public void setPhone(String phone) {

        this.phone = phone;
    }
    public void setName(String clientName) {

        this.clientName = clientName;

    }




    public void setAddress(String address) {

        this.address = address;
    }








    // Display Information


    public void displayInfo() {


        System.out.println("Client ID : " + clientId);
        System.out.println("Name      : " + clientName);
        System.out.println("Phone     : " + phone);
        System.out.println("Address   : " + address);

    }







    // Save to TXT


    public String toFileString() {


        return "Client," +
                clientId + "," +
                clientName + "," +
                phone + "," +
                address;
    }

}