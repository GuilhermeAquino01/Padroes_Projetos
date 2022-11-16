package Builder;

import Builder.Contrutores.VeiculoBuilder;
import Builder.Produtos.Veiculo;

public class Main {
    public static void main(String[] args) {
        //Criar um objeto "carro"
        VeiculoBuilder veiculoBuilder = new VeiculoBuilder();
        veiculoBuilder.setTipoVeiculo("Carro");
        veiculoBuilder.setKmRodados(60000);
        veiculoBuilder.setDataAquisicao("12/09/2022");
        veiculoBuilder.setPlaca("HDV2555");
        veiculoBuilder.setMarca("Fiat");
        veiculoBuilder.setModelo("Uno Mile");
        veiculoBuilder.setTipoCombustivel("Flex");

        Veiculo carro = veiculoBuilder.getVeiculo();
        System.out.println(carro.getInfo());


        //Criar um objeto "carreta"
        VeiculoBuilder carretaBuilder = new VeiculoBuilder();
        carretaBuilder.setTipoVeiculo("Carreta");
        carretaBuilder.setKmRodados(120000);
        carretaBuilder.setDataAquisicao("10/07/2022");
        carretaBuilder.setPlaca("GHG8899");
        carretaBuilder.setMarca("Mercedes");
        carretaBuilder.setModelo("Muriçoca");
        carretaBuilder.setTipoCombustivel("Diesel");
        carretaBuilder.setCompCarroceria(15.5);
        carretaBuilder.setQntEixos(4);
        carretaBuilder.setPossuiBau(true);
        Veiculo carreta = carretaBuilder.getVeiculo();

        System.out.println("-----------------------------------");
        System.out.println(carreta.getInfo());
    }
}
