package Prototype;

public class AdministrativoPrototype extends PerfilPrototype {

    protected AdministrativoPrototype(AdministrativoPrototype perfil){
        this.departamento = perfil.getDepartamento();
        this.permissoes = perfil.getPermissoes();
    }

    public AdministrativoPrototype(){}

    @Override
    public PerfilPrototype Clonar() {
        return new AdministrativoPrototype(this);
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
