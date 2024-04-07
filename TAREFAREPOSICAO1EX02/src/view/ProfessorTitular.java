// Classe ProfessorTitular
package view;

// Subclasse que representa um professor titular
public class ProfessorTitular extends Professor {
    // Atributo adicional para anos de institui��o
    private int anosInstituicao;

    // Construtor
    public ProfessorTitular(String nome, String matricula, int idade, int anosInstituicao) {
        super(nome, matricula, idade);
        this.anosInstituicao = anosInstituicao;
    }

    // M�todo para calcular o sal�rio
    public double calcularSalario() {
        // Incrementa 5% para cada 5 anos de institui��o
        double salarioBase = 2000.0; // Sal�rio base
        double salarioFinal = salarioBase * (1 + (0.05 * (anosInstituicao / 5)));
        return salarioFinal;
    }

    // Getter e Setter para anos de institui��o
    public int getAnosInstituicao() {
        return anosInstituicao;
    }

    public void setAnosInstituicao(int anosInstituicao) {
        this.anosInstituicao = anosInstituicao;
    }
}
