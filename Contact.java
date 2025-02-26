package template;

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

}
