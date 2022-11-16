package AbstractFactory.Factorys;

import AbstractFactory.Family.IFuncionario;
import AbstractFactory.Family.IGerente;

public interface AbstractFactory {
    IGerente criarGerente();
    IFuncionario criarFuncionario();
}
