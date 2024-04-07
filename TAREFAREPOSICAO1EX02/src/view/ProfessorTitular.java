
package view;


public class ProfessorTitular extends Professor {
 
    private int anosInstituicao;


    public ProfessorTitular(String nome, String matricula, int idade, int anosInstituicao) {
        super(nome, matricula, idade);
        this.anosInstituicao = anosInstituicao;
    }

 
    public double calcularSalario() {
        // Incrementa 5% para cada 5 anos de instituição
        double salarioBase = 2000.0; // Salário base
        double salarioFinal = salarioBase * (1 + (0.05 * (anosInstituicao / 5)));
        return salarioFinal;
    }


    public int getAnosInstituicao() {
        return anosInstituicao;
    }

    public void setAnosInstituicao(int anosInstituicao) {
        this.anosInstituicao = anosInstituicao;
    }
}
