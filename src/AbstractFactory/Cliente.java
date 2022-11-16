package AbstractFactory;

import AbstractFactory.Factorys.AbstractFactory;
import AbstractFactory.Factorys.AdministrativoFactory;
import AbstractFactory.Factorys.FinanceiroFactory;
import AbstractFactory.Family.IFuncionario;
import AbstractFactory.Family.IGerente;

public class Cliente {
    public static void main(String[] args){

        //INSTANCIA A FABRICA PARA FUNCIONÁRIOS ADMINISTRATIVOS
        AbstractFactory fabrica = new AdministrativoFactory();

        //CRIA UM GERENTE ADMINISTRATIVO
        IGerente gerenteAdm = fabrica.criarGerente();
        gerenteAdm.setNome("João");
        gerenteAdm.setCPF("999.888.555-54");
        gerenteAdm.setAdmissao("18/06/2022");
        gerenteAdm.getInfo();

        //CRIA UM FUNCIONÁRIO ADMINISTRATIVO
        IFuncionario funcionarioAdm = fabrica.criarFuncionario();
        funcionarioAdm.getInfo();

        //INSTANCIA A FABRICA PARA FUNCIONÁRIOS FINANCEIRO
        fabrica = new FinanceiroFactory();

        //CRIA UM GERENTE FINANCEIRO
        IGerente gerenteFin = fabrica.criarGerente();

        //CRIA UM FUNCIONÁRIO FINANCEIRO
        IFuncionario funcionarioFin = fabrica.criarFuncionario();
        funcionarioFin.setNome("Pedro");
        funcionarioFin.setCPF("111.222.333-44");
        funcionarioFin.setAdmissao("18/06/2022");
        funcionarioFin.setCargo("Contador");

        gerenteFin.getInfo();
        funcionarioFin.getInfo();
    }
}
