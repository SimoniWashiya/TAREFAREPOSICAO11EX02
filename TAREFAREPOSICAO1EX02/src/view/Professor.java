package view;

//Classe principal que representa um professor
public class Professor {
 // Atributos
 private String nome;
 private String matricula;
 private int idade;

 // Construtor
 public Professor(String nome, String matricula, int idade) {
     this.nome = nome;
     this.matricula = matricula;
     this.idade = idade;
 }

 // Getters e Setters
 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public String getMatricula() {
     return matricula;
 }

 public void setMatricula(String matricula) {
     this.matricula = matricula;
 }

 public int getIdade() {
     return idade;
 }

 public void setIdade(int idade) {
     this.idade = idade;
 }
}