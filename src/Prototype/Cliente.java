package Prototype;

public class Cliente {
    public static void main(String[] args){
        //PROTÓTIPO PARA FUNCIONÁRIOS DO ADMINISTRATIVO
        AdministrativoPrototype perfilAdm = new AdministrativoPrototype();
        perfilAdm.setDepartamento("Administrativo");
        perfilAdm.setPermissoes(new String[]{"cadastrar_usuarios", "gerar_rotas"});

        //FUNCIONARIO ADM CRIADO A PARTIR DO CLONE DO PERFIL
        PerfilPrototype funcionario1 = perfilAdm.Clonar();
        funcionario1.nome = "jose";
        funcionario1.cpf = "111.222.333-99";
        funcionario1.getInfo();

        //FUNCIONARIO ADM CRIADO A PARTIR DO CLONE DO PERFIL
        PerfilPrototype funcionario3 = perfilAdm.Clonar();
        funcionario3.nome = "Maria";
        funcionario3.getInfo();

        //PROTÓTIPO PARA FUNCIONÁRIOS DA LOGÍSTICA
        LogisticaPrototype perfilLog = new LogisticaPrototype();
        perfilLog.setDepartamento("Logística");
        perfilLog.setPermissoes(new String[]{"gerar_tickets", "gerar_relatorio"});

        //FUNCIONARIO LOGISTICA CRIADO A PARTIR DO CLONE DO PERFIL
        PerfilPrototype funcionario2 = perfilLog.Clonar();
        funcionario2.nome = "João";
        funcionario2.getInfo();
    }
}
