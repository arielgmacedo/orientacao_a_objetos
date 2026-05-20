public class App {
    public static void main(String[] args) throws Exception {

        Carro c1 = new Carro("Onix", "Chevrolet", 2023, "Branco");
        System.out.println(c1.getModelo());
        c1.setModelo("Spin");
        System.out.println(c1.getModelo());

        System.out.println(c1.getMarca());
        System.out.println(c1.getAno());
        System.out.println(c1.getCor());

        System.out.println("===============");

        Carro c2 = new Carro("HB20", "Honda", 2020, "Prata");
        System.out.println(c2.getModelo());
        c2.setModelo("Civic");
        System.out.println(c2.getModelo());

        System.out.println(c2.getMarca());
        System.out.println(c2.getAno());
        System.out.println(c2.getCor());
    }
}
