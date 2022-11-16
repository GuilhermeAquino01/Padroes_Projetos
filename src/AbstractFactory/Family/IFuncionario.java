package AbstractFactory.Family;

public interface IFuncionario {
    void setNome(String nome);
    void setCargo(String cargo);
    void setCPF(String cpf);
    void setAdmissao(String data);
    void setPermissoes(String[] permissoes);
    void getInfo();
}
