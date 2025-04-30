package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Pessoa {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private List<AvaliacaoFisica> avaliacoes;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.avaliacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<AvaliacaoFisica> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<AvaliacaoFisica> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public void adicionaAvaliacao(AvaliacaoFisica avaliacao) {
        this.avaliacoes.add(avaliacao);
    }

    public String exibirDados(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String aux = "Dados da Pessoa cadastrada: \n";
        aux += "Nome: "+nome+"\n";
        if(cpf!=null)
            aux += "CPF: "+cpf+"\n";
        if(dataNascimento != null)
            aux += "Data de Nascimento: "+formato.format(dataNascimento) + "\n";

        if (avaliacoes != null)
            aux += "Quantidade de Avaliacoes: " + avaliacoes.size();
        return aux;

    }
}
