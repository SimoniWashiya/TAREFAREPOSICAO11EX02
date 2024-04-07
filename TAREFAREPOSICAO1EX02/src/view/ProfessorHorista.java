
package view;


public class ProfessorHorista extends Professor {

    private int totalHoras;
    private double valorHoraAula;

 
    public ProfessorHorista(String nome, String matricula, int idade, int totalHoras, double valorHoraAula) {
        super(nome, matricula, idade);
        this.totalHoras = totalHoras;
        this.valorHoraAula = valorHoraAula;
    }

    public double calcularSalario() {
      
        return totalHoras * valorHoraAula;
    }


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
