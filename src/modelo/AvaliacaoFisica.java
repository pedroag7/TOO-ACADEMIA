package modelo;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class AvaliacaoFisica {
    private Pessoa aluno;
    private LocalDate data;
    private double peso;
    private double altura;
    private int idade;
    private double imc;


    public AvaliacaoFisica(Pessoa aluno) {
        this.aluno = aluno;
        this.data = LocalDate.now();
        if (aluno.getDataNascimento() != null)
            this.idade = CalcularIdade(aluno.getDataNascimento());

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

    public double CalcularImc(double peso, double altura){
            double imcc = peso/(altura*altura);
            return imcc;
    }

    public int CalcularIdade(LocalDate data){
        int idade = 0;
        Year ano = Year.now();
        idade = ano.getValue()- data.getYear();
        return idade;
    }


    public void exibirDados() {
        System.out.println();
        String imcformat = String.format("%.2f", imc);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = data.format(dtf);
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + idade);
        System.out.println("Data da avaliacao: " + dataFormatada);
        System.out.println("Imc: " + imcformat);
    }

}

