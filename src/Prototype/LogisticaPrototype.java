package Prototype;

public class LogisticaPrototype extends PerfilPrototype {

    protected LogisticaPrototype(LogisticaPrototype perfil){
        this.departamento = perfil.getDepartamento();
        this.permissoes = perfil.getPermissoes();
    }

    public LogisticaPrototype(){}
    @Override
    public PerfilPrototype Clonar() {
        return new LogisticaPrototype(this);
    }

    @Override
    public void getInfo() {
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Permissoes: ");
        for(int i=0; i < this.permissoes.length; i++) {
            System.out.println(this.permissoes[i]);
        }
        System.out.println("-----------------------------------------");
    }
}
