package Relationship.OnetoOne;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contactList = new ArrayList<>();
contactList.in
        System.out.println("Enter the number of contact-address pair:");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the address " + (i + 1) + ":");
            String addressInput = sc.nextLine();
            String[] addrParts = addressInput.split(",");

            Address address = new Address(
                    addrParts[0].trim(),
                    addrParts[1].trim(),
                    addrParts[2].trim(),
                    addrParts[3].trim(),
                    Integer.parseInt(addrParts[4].trim())
            );

            System.out.println("Enter the contact " + (i + 1) + ":");
            String contactInput = sc.nextLine();
            String[] contactParts = contactInput.split(",");

            Contact contact = new Contact(
                    Integer.parseInt(contactParts[0].trim()),
                    Integer.parseInt(contactParts[1].trim()),
                    Integer.parseInt(contactParts[2].trim()),
                    contactParts[3].trim()
            );

            // Set bidirectional references
            contact.setAddress(address);
            address.setContact(contact);

            // Add to contact list
            contactList.add(contact);
        }

        System.out.println("Enter the mobile of the contact to be searched:");
        Integer searchMobile = Integer.parseInt(sc.nextLine());

        boolean found = false;
        int count = 1;
        for (Contact contact : contactList) {
            if (contact.getMobile().equals(searchMobile)) {
                System.out.println("Contact-Address " + count);
                System.out.println(contact.getAddress().toString());
                count++;
                found = true;
            }
        }

        if (!found) {
            System.out.println("No contact with mobile " + searchMobile + " found");
        }
    }
}
