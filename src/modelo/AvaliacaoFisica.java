package modelo;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class AvaliacaoFisica implements Exibivel {
    private Pessoa aluno;
    private LocalDate data;
    private double peso;
    private double altura;
    private int idade;
    private double imc;
    private Professor professor;
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public AvaliacaoFisica(Pessoa aluno) {
        this.aluno = aluno;
        this.data = LocalDate.now();
    }

    public Pessoa getAluno() {
        return aluno;
    }


    public LocalDate getData() {
        return data;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public double calcularIMC(){
        return peso / (altura*altura);
    }


    public void calcularIdade(){
        idade  = Period.between(aluno.getDataNascimento(), data).getYears();
    }


    public String exibirDados(){


        String aux = "Dados da Avaliação Física: \n";
        aux += "Aluno: " + aluno + "\n";
        calcularIdade();
        if (idade != 0) {
            aux += "Idade: " + idade + "\n";
        }
        if (data != null) {
            aux += "Data da Avaliação: " + formato.format(data);
        }
        imc = calcularIMC();
        if(imc > 0){
            aux += "\nIMC: " + imc;
        }
        if(professor!=null)
            aux += "\nProfessor: "+professor;
        return aux;
    }



    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return formato.format(data) +" - IMC: "+ imc;
    }
}

