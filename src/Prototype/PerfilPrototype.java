package Prototype;

abstract class PerfilPrototype {
    public String cpf;
    public String nome;
    protected String departamento;
    protected String[] permissoes;


    //MÉTODO CLONE PARA RETORNAR UM CLONE DO OBJETO
    public abstract PerfilPrototype Clonar();
    public abstract void getInfo();

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String[] getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(String[] permissoes) {
        this.permissoes = permissoes;
    }
}
