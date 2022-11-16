package AbstractFactory.Family.AdministrativoFamily;

import AbstractFactory.Family.IGerente;

public class GerenteAdministrativo implements IGerente {

    private String nome;
    private String cargo = "Gerente";
    private String admissao;
    private String cpf;
    private String departamento = "Administrativo";
    private String permissoes = "Acesso geral às funcionalidades administrativas!";

    @Override
    public void setNome(String nome) {
        this.nome = nome;
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
    public void getInfo(){
        System.out.println("\n Departamento: " + this.departamento);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Admissão: " + this.admissao);
        System.out.println("Permissões: " + this.permissoes);
        System.out.println("------------------------------");
    }
}
