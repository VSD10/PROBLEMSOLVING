public class Account {
    protected String accName;
    protected String accNo;
    protected String bankName;

    public Account(String a,String b,String c)
    {

        this.accName=a;
        this.accNo=b;
        this.bankName=c;
    }
    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void display() {
        System.out.println("Account Name:" + accName);
        System.out.println("Account Number:" + accNo);
        System.out.println("Bank Name:" + bankName);
    }
}
