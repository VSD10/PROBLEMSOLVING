public class SavingsAccount extends Account {
    private String orgName;

  
    public SavingsAccount(String accName, String accNo, String bankName, String orgName) {
		super(accName,accNo,bankName);
		this.orgName=orgName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void display() {
        // System.out.println("Account Name:" + accName);
        // System.out.println("Account Number:" + accNo);
        // System.out.println("Bank Name:" + bankName);
        super.display();
		System.out.println("Organisation Name:" + orgName);
    }
}
