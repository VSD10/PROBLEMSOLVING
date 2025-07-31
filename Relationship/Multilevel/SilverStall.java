

public class SilverStall {
    protected String name;
    protected String detail;
    protected String owner;
    protected Integer cost;

    public SilverStall() {
    }

    public SilverStall(String name, String detail, String owner, Integer cost) {
        this.name = name;
        this.detail = detail;
        this.owner = owner;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public String getOwner() {
        return owner;
    }

    public Integer getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public void display() {
        System.out.println("Stall Name:" + name);
        System.out.println("Details:" + detail);
        System.out.println("Owner Name:" + owner);
        System.out.println("Total Cost:" + cost);
    }
}