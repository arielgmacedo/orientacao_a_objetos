public class App {
    public static void main(String[] args) throws Exception {

        Funcionario Ana = new Funcionario();
        Funcionario Carlos = new Funcionario();

        Ana.nome = "Ana";
        Ana.salario = 3.500;
        System.out.println(Ana.salario);
        Ana.receberAumento(200);
        System.out.println(Ana.salario);

        System.out.println("================");

        Carlos.nome = "Carlos";
        Carlos.salario = 6.500;
        System.out.println(Carlos.salario);
        Carlos.receberAumento(250);
        System.out.println(Carlos.salario);
    }
}
