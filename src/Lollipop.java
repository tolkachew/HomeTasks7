public class Lollipop extends Candy {
    public Lollipop(Double weight, int sugarContent) {
        super(weight, sugarContent);
    }

    String nameOfSweet = "Леденец (FengxueHuang)";

    @Override
    public String toString() {
        return nameOfSweet + " (Вес - " + getWeight() + " грамм" + ", Содержание сахара - " + getSugarContent() + " грамм" + ")";
    }
}