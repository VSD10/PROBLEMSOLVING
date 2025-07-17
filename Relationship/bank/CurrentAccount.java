public class CurrentAccount extends Account {
    private String tinNumber;
    public CurrentAccount(String accName, String accNo, String bankName, String tinNumber) {
        super(accName,accNo,bankName);
		this.tinNumber=tinNumber;
 
    }

    public String getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    public void display() {
        //  System.out.println("Account Name:" + accName);
        // System.out.println("Account Number:" + accNo);
        // System.out.println("Bank Name:" + bankName);
        super.display();
		System.out.println("TIN Number:" + tinNumber);
 
    }
}