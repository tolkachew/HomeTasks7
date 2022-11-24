public class Chocolate extends Candy {
    public Chocolate(Double weight, int sugarContent) {
        super(weight, sugarContent);
    }

    String nameOfSweet = "Шоколад (Almond Joy)";

    @Override
    public String toString() {
        return nameOfSweet + " (Вес - " + getWeight() + " грамм" + ", Содержание сахара - " + getSugarContent() + " грамм" + ")";
    }
}
