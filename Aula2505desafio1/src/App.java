public class App {
    public static void main(String[] args) throws Exception {

        Animal a1 = new Animal("Thor", 2);

        a1.dormir();

        Cachorro c1 = new Cachorro("Bob", 2);

        c1.dormir();
        c1.latir();

        Gato g1 = new Gato("Tom", 2);

        g1.dormir();
        g1.miar();
    }

}
