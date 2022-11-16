package AbstractFactory.Factorys;

import AbstractFactory.Factorys.AbstractFactory;
import AbstractFactory.Family.AdministrativoFamily.FuncionarioAdministrativo;
import AbstractFactory.Family.AdministrativoFamily.GerenteAdministrativo;
import AbstractFactory.Family.IFuncionario;
import AbstractFactory.Family.IGerente;

public class AdministrativoFactory implements AbstractFactory {

    @Override
    public IGerente criarGerente() {
        return new GerenteAdministrativo();
    }

    @Override
    public IFuncionario criarFuncionario() {
        return new FuncionarioAdministrativo();
    }
}
