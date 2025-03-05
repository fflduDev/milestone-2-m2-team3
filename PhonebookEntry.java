
/**
 *   model a PhonebookEntry 
 *   
 *   PhonebookEntry has a phoneNumber and type
 *   
 *   
 *   
 */

class PhonebookEntry{

    private String phoneNumber;
    private String type;
 

    public PhonebookEntry(String phoneNumber, String type) {
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getType() {
        return type;
    }

    public String setPhoneNumber(String phoneNumber) {
        return this.phoneNumber = phoneNumber;
    }

    public String setType(String type) {
        return this.type = type;
    }
    


    
    




}
	