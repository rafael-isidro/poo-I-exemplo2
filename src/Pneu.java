public class Pneu {
    double pressao;

    public Pneu(double pressao) {
        this.pressao = pressao;
    }

    @Override
    public String toString() {
        return "Pneu{" +
                "pressao=" + pressao +
                '}';
    }
}
