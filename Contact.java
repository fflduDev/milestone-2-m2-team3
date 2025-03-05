import java.util.List;
import java.util.ArrayList;



/**
 * model a Contact 
 * Contact has a name & list of phonebook entries
 * 
 * Support adding phonebookEntry to a contact
 * 
 * @Override hashCode and equals
 * 
 */

class Contact {

    private String name;
    private List<PhonebookEntry> phonebookEntries = new ArrayList<PhonebookEntry>();

    public Contact(String name) {
        this.name = name;
    }

    public List<PhonebookEntry> getPhonebookEntries() {
        return phonebookEntries;
    }

    public void addPhonebookEntry(String phoneNumber, String type) {
        phonebookEntries.add(new PhonebookEntry(phoneNumber, type));
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        for(PhonebookEntry entry : phonebookEntries){
            System.out.println(entry.getPhoneNumber() + " " + entry.getType());
        }
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) obj;
        return name.equals(contact.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
