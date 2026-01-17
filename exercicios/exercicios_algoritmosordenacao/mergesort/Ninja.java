package exercicios.exercicios_algoritmosordenacao.mergesort;

public class Ninja {
    String name;
    String village;
    int powerChakra;
    String rank;

    public Ninja(String name, String village, int powerChakra, String rank) {
        this.name = name;
        this.village = village;
        this.powerChakra = powerChakra;
        this.rank = rank;
    }
    @Override
    public String toString() {
        return String.format("Ninja: %-10s | Chakra: %-5d | Rank: %s", name, powerChakra, rank);
    }
}
