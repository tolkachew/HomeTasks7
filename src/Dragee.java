public class Dragee extends Candy {
    public Dragee(Double weight, int sugarContent) {
        super(weight, sugarContent);
    }

    String nameOfSweet = "Драже (Skittles)";

    @Override
    public String toString() {
        return nameOfSweet + " (Вес - " + getWeight() + " грамм" + ", Содержание сахара - " + getSugarContent() + " грамм" + ")";
    }
}