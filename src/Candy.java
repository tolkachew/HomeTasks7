public class Candy {
    private Double weight;
    private int sugarContent;
    private String nameOfSweet;

    public Candy(Double weight, Integer sugarContent) {
        this.weight = weight;
        this.sugarContent = sugarContent;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(Integer sugarContent) {
        this.sugarContent = sugarContent;
    }
}