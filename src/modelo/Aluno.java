/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;


public class Aluno extends Pessoa {
    private String matricula;
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
    private LocalDate dataMatricula;
    private Plano plano;


    public void adicionarAvaliacao(AvaliacaoFisica avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public String mostrarAvaliacoes() {
        String aux = "Histórico de Avaliações: \n";
        for (AvaliacaoFisica cadaAvaliacao : avaliacoes) {
            aux += "->> " + cadaAvaliacao + "\n";
        }
        return aux;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String exibirDados() {
        String aux = super.exibirDados();
        aux += "\nMatricula: " + matricula;
        aux += "\nAvaliações Físicas Realizadas: "
                + avaliacoes.size() + "\n";
        aux += "\nValor Mensalidade: " + plano.getValor();
        return aux;
    }

    private void verificaDesconto(double vl){
        LocalDate dataAtual = LocalDate.now();
        long meses = ChronoUnit.MONTHS.between(dataAtual, dataMatricula);
        if (meses >= 3){
            double desconto = vl * 0.10;
            vl -= desconto;
        }

    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}
