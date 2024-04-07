// Classe ProfessorHorista
package view;

// Subclasse que representa um professor horista
public class ProfessorHorista extends Professor {
    // Atributos adicionais para total de horas e valor da hora aula
    private int totalHoras;
    private double valorHoraAula;

    // Construtor
    public ProfessorHorista(String nome, String matricula, int idade, int totalHoras, double valorHoraAula) {
        super(nome, matricula, idade);
        this.totalHoras = totalHoras;
        this.valorHoraAula = valorHoraAula;
    }

    // Método para calcular o salário
    public double calcularSalario() {
        // Salário é a multiplicação do total de horas pelo valor da hora aula
        return totalHoras * valorHoraAula;
    }

    // Getters e Setters para total de horas e valor da hora aula
    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
}
