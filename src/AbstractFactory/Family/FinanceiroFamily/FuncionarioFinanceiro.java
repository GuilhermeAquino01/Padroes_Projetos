package AbstractFactory.Family.FinanceiroFamily;

import AbstractFactory.Family.IFuncionario;

public class FuncionarioFinanceiro implements IFuncionario {
    private String nome;
    private String admissao;
    private String cargo;
    private String cpf;
    private String departamento = "Financeiro";
    private String[] permissoes = {};

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setAdmissao(String data) {
        this.admissao = data;
    }

    @Override
    public void setPermissoes(String[] permissoes) {
        this.permissoes = permissoes;
    }

    @Override
    public void getInfo(){
        System.out.println("\n Departamento: " + this.departamento);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Admissão: " + this.admissao);
        System.out.println("Permissoes: ");
        for(int i=0; i < this.permissoes.length; i++){
            System.out.println(this.permissoes[i]);
        };
        System.out.println("------------------------------");
    }
}
