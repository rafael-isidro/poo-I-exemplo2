public class Main {
    public static void main(String[] args) {

        Pneu pneu1 = new Pneu(30.0);
        Pneu pneu2 = new Pneu(30.0);
        Pneu pneu3 = new Pneu(30.0);
        Pneu pneu4 = new Pneu(30.0);

        Carro carro1 = new Carro(70);

        carro1.pneus.add(pneu1);
        carro1.pneus.add(pneu2);
        carro1.pneus.add(pneu3);
        carro1.pneus.add(pneu4);

        System.out.println(carro1);
    }
}