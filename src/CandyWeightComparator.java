import java.util.Comparator;

public class CandyWeightComparator implements Comparator<Candy> {
    @Override
    public int compare(Candy o1, Candy o2) {
        return o1.getWeight().compareTo(o2.getWeight());
    }
}