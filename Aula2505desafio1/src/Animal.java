public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String n, int i) {
        this.nome = n;
        this.idade = i;
    }

    public void dormir() {
        System.out.println("O animal está dormindo");
    }

}
