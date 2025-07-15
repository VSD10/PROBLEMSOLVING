package Relationship.OnetoOne;
public class Contact {
    private Integer mobile;
    private Integer alternateMobile;
    private Integer landline;
    private String email;
    private Address address;

    public Contact(Integer mobile, Integer alternateMobile, Integer landline, String email) {
        this.mobile = mobile;
        this.alternateMobile = alternateMobile;
        this.landline = landline;
        this.email = email;
    }

    public Integer getMobile() {
        return mobile;
    }

    public Integer getAlternateMobile() {
        return alternateMobile;
    }

    public Integer getLandline() {
        return landline;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Contact) {
            Contact other = (Contact) obj;
            return this.mobile.equals(other.mobile);
        }
        return false;
    }
}
