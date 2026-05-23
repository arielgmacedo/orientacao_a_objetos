public class MaquinaDeCafe {
    private int capsulasDisponiveis;

    public MaquinaDeCafe() {
        this.capsulasDisponiveis = 0;
    }

    public void recarregar(int quantidade) {
        this.capsulasDisponiveis = this.capsulasDisponiveis + quantidade;
    }

    public void fazerCafe() {
        if (this.capsulasDisponiveis > 0) {
            System.out.println("Café pronto!");
            this.capsulasDisponiveis = this.capsulasDisponiveis - 1;
        } else {
            System.out.println("Erro: Máquina vazia. Recarregue.");
        }

    }

}
