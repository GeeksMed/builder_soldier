package padraocriacao.builder;

import java.util.Date;

public class SoldierBuilder {

    private Soldier soldier;

    public SoldierBuilder() {
        soldier = new Soldier();
    }

    public Soldier build() {
        if (soldier.getMatricula() == 0) {
            throw new IllegalArgumentException("Matrícula inválida");
        }
        if (soldier.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (soldier.getCpf().equals("")) {
            throw new IllegalArgumentException("CPF inválido");
        }
        return soldier;
    }

    public SoldierBuilder setMatricula(int matricula) {
        soldier.setMatricula(matricula);
        return this;
    }

    public SoldierBuilder setNome(String nome) {
        soldier.setNome(nome);
        return this;
    }

    public SoldierBuilder setDataNascimento(Date dataNascimento) {
        soldier.setDataNascimento(dataNascimento);
        return this;
    }

    public SoldierBuilder setNomeMae(String nomeMae) {
        soldier.setNomeMae(nomeMae);
        return this;
    }

    public SoldierBuilder setNomePai(String nomePai) {
        soldier.setNomePai(nomePai);
        return this;
    }

    public SoldierBuilder setCpf(String cpf) {
        soldier.setCpf(cpf);
        return this;
    }

    public SoldierBuilder setRg(String rg) {
        soldier.setRg(rg);
        return this;
    }

    public SoldierBuilder setEscolaAnterior(String escolaAnterior) {
        soldier.setEscolaAnterior(escolaAnterior);
        return this;
    }

    public SoldierBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        soldier.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public SoldierBuilder setEnderecoNumero(int enderecoNumero) {
        soldier.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public SoldierBuilder setEnderecoComplemento(String enderecoComplemento) {
        soldier.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public SoldierBuilder setEnderecoBairro(String enderecoBairro) {
        soldier.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public SoldierBuilder setEnderecoCidade(String enderecoCidade) {
        soldier.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public SoldierBuilder setEnderecoUF(String enderecoUF) {
        soldier.setEnderecoUF(enderecoUF);
        return this;
    }

    public SoldierBuilder setCep(String cep) {
        soldier.setCep(cep);
        return this;
    }

    public SoldierBuilder setEmail(String email) {
        soldier.setEmail(email);
        return this;
    }

    public SoldierBuilder setCelular(String celular) {
        soldier.setCelular(celular);
        return this;
    }

}
