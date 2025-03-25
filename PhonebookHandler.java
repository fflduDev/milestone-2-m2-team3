import java.util.*;

public class PhonebookHandler implements iPhonebookHander {

    private Map<Contact, List<PhonebookEntry>> phonebook;

    public PhonebookHandler(Map<Contact, List<PhonebookEntry>> phonebook) {
        this.phonebook = phonebook;
    }

    // Bubble Sort by Contact name
    @Override
    public List<Contact> sortByName() {
        List<Contact> contacts = new ArrayList<>(phonebook.keySet());
        int n = contacts.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (contacts.get(j).getName().compareTo(contacts.get(j + 1).getName()) > 0) {
                    // swap
                    Contact temp = contacts.get(j);
                    contacts.set(j, contacts.get(j + 1));
                    contacts.set(j + 1, temp);
                }
            }
        }
        return contacts;
    }

    // Binary Search by Contact name
    @Override
    public List<PhonebookEntry> binarySearch(List<Contact> sortedContacts, String name) {
        int left = 0;
        int right = sortedContacts.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midName = sortedContacts.get(mid).getName();
            if (midName.equals(name)) {
                return sortedContacts.get(mid).getPhonebookEntries();
            } else if (midName.compareTo(name) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("No contact found with name: " + name);
        return new ArrayList<>();
    }

    // Display sorted contact list
    @Override
    public void display(List<Contact> sortedContacts) {
        System.out.println("Sorted Phonebook (Bubble Sort):");
        for (Contact c : sortedContacts) {
            System.out.println(c.getName());
        }
    }
}
