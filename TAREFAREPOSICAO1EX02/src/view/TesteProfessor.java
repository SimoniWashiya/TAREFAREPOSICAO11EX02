package view;

// Classe de teste para as implementações de Professor, ProfessorTitular e ProfessorHorista
public class TesteProfessor {
    public static void main(String[] args) {
        // Teste com ProfessorTitular
        ProfessorTitular professorTitular = new ProfessorTitular("João", "123", 35, 10);
        double salarioProfessorTitular = professorTitular.calcularSalario();
        System.out.println("Salário do Professor Titular: R$" + salarioProfessorTitular);

        // Teste com ProfessorHorista
        ProfessorHorista professorHorista = new ProfessorHorista("Maria", "456", 30, 80, 50.0);
        double salarioProfessorHorista = professorHorista.calcularSalario();
        System.out.println("Salário do Professor Horista: R$" + salarioProfessorHorista);
    }
}
