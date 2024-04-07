// Classe ProfessorTitular
package view;

// Subclasse que representa um professor titular
public class ProfessorTitular extends Professor {
    // Atributo adicional para anos de instituição
    private int anosInstituicao;

    // Construtor
    public ProfessorTitular(String nome, String matricula, int idade, int anosInstituicao) {
        super(nome, matricula, idade);
        this.anosInstituicao = anosInstituicao;
    }

    // Método para calcular o salário
    public double calcularSalario() {
        // Incrementa 5% para cada 5 anos de instituição
        double salarioBase = 2000.0; // Salário base
        double salarioFinal = salarioBase * (1 + (0.05 * (anosInstituicao / 5)));
        return salarioFinal;
    }

    // Getter e Setter para anos de instituição
    public int getAnosInstituicao() {
        return anosInstituicao;
    }

    public void setAnosInstituicao(int anosInstituicao) {
        this.anosInstituicao = anosInstituicao;
    }
}
