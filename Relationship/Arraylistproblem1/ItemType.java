
public class ItemType {
	private String name;
	private Double deposit;
	private Double costPerDay;

	public void ItemType(String name,Double d,Double c)
	{
		this.name=name;
		this.deposit=d;
		this.costPerDay=c;
	}
	public void setName(String n) this.name=n;
	public void setDeposit(Double d)this.deposit=d;
	public void setCostPerDay(Double c)this.costPerDay=c;

	public String getName()return name;
	public Double getDeposit()return deposit;
	public Double getCostPerDay() return costPerDay;
    @Override
    public String toString()
    {
        return String.format("%-20s%-20s%-20s",name,deposit,costPerDay);
    }
}