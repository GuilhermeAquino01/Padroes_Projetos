package AbstractFactory.Factorys;

import AbstractFactory.Factorys.AbstractFactory;
import AbstractFactory.Family.FinanceiroFamily.FuncionarioFinanceiro;
import AbstractFactory.Family.FinanceiroFamily.GerenteFinanceiro;
import AbstractFactory.Family.IFuncionario;
import AbstractFactory.Family.IGerente;

public class FinanceiroFactory implements AbstractFactory {

    @Override
    public IGerente criarGerente() {
        return new GerenteFinanceiro();
    }

    @Override
    public IFuncionario criarFuncionario() {
        return new FuncionarioFinanceiro();
    }
}
