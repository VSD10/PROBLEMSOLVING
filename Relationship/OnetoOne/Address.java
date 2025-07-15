package Relationship.OnetoOne;
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private Integer pincode;
    private Contact contact;

    public Address(String addressLine1, String addressLine2, String city, String state, Integer pincode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Contact getContact() {
        return contact;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public Integer getPincode() {
        return pincode;
    }

    @Override
    public String toString() {
        return "Mobile:" + contact.getMobile() + "\n" +
               "Alternate Mobile:" + contact.getAlternateMobile() + "\n" +
               "Landline:" + contact.getLandline() + "\n" +
               "Email:" + contact.getEmail() + "\n" +
               "Address Line1:" + addressLine1 + "\n" +
               "Address Line2:" + addressLine2 + "\n" +
               "City:" + city + "\n" +
               "State:" + state + "\n" +
               "Pincode:" + pincode;
    }
}
