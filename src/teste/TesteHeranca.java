/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import modelo.Aluno;
import modelo.AvaliacaoFisica;
import modelo.Plano;
import modelo.Professor;


public class TesteHeranca {
    public static void main(String[] args) {
        Professor p = new Professor();
        p.setNome("Juka");
        p.setCpf("123.123.123-67");
        p.setEspecializacao("Musculação");
        
        System.out.println(p.exibirDados());
        
        Aluno a = new Aluno();
        a.setNome("Vivente");
        a.setMatricula("123");
        DateTimeFormatter formato = 
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        a.setDataNascimento(LocalDate.parse("10/01/2008", 
                formato));
        
        
        AvaliacaoFisica av1 = new AvaliacaoFisica(a);
        a.adicionarAvaliacao(av1);
        av1.setProfessor(p);
        
        System.out.println(a.exibirDados());
        
        System.out.println("---- ");
        av1.exibirDados();

        Plano p1 = new Plano();
        p1.setNome("aa");
        p1.setValor(120.00);
        p1.setDescricao("aaa");

        Aluno joao = new Aluno();
        joao.setNome("Joao");
        joao.setMatricula("1243");
        joao.setCpf("123.123.123-67");
        joao.setDataMatricula(LocalDate.of(2024,9,10));
        joao.setPlano(p1);
        joao.verificaDesconto(joao.getPlano().getValor());

        a.setPlano(p1);
        a.setDataMatricula(LocalDate.of(2025,5,10));
        a.verificaDesconto(a.getPlano().getValor());

    }
}
