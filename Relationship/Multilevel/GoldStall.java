public class GoldStall extends SilverStall {
    //Fill the code here
    private Integer tvSet;
    public GoldStall() {
    }

    public GoldStall(String name, String detail, String owner, Integer cost, Integer tvSet) {
        super(name, detail, owner, cost);
        this.tvSet = tvSet;
    }

    public Integer getTvSet() {
        return tvSet;
    }

    public void setTvSet(Integer tvSet) {
        this.tvSet = tvSet;
    }

    @Override
    public void display() {
        System.out.println("Stall Name:" + name);
        System.out.println("Details:" + detail);
        System.out.println("Owner Name:" + owner);
        System.out.println("TV Sets:" + tvSet);
        System.out.println("Total Cost:" + (cost + tvSet * 100));
    }
}
