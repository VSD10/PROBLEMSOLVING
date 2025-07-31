public class PlatinumStall extends GoldStall {
    private Integer projector;

    public PlatinumStall() {
    }

    public PlatinumStall(String name, String detail, String owner, Integer cost, Integer tvSet, Integer projector) {
        super(name, detail, owner, cost, tvSet);
        this.projector = projector;
    }

    public Integer getProjector() {
        return projector;
    }

    public void setProjector(Integer projector) {
        this.projector = projector;
    }

    @Override
    public void display() {
        System.out.println("Stall Name:" + name);
        System.out.println("Details:" + detail);
        System.out.println("Owner Name:" + owner);
        System.out.println("TV Sets:" + getTvSet());
        System.out.println("Projectors:" + projector);
        System.out.println("Total Cost:" + (cost + getTvSet() * 100 + projector * 500));
    }
}