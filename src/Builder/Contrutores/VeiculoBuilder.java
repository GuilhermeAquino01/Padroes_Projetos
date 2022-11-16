package Builder.Contrutores;

import Builder.IVeiculo;
import Builder.Produtos.Veiculo;

public class VeiculoBuilder implements IVeiculo {
    private String tipoVeiculo;
    private int kmRodados;
    private String dataAquisicao;
    private String placa;
    private String marca;
    private String modelo;
    private String tipoCombustivel;
    private int qntEixos;
    private Double compCarroceria;
    private String capacidadeCarga;
    private Boolean possuiBau = false;

    public VeiculoBuilder() {}

    @Override
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    @Override
    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
    }

    @Override
    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setQntEixos(int qntEixos) {
        this.qntEixos = qntEixos;
    }

    public void setCompCarroceria(Double compCarroceria) {
        this.compCarroceria = compCarroceria;
    }

    public void setCapacidadeCarga(String capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public void setPossuiBau(Boolean possuiBau) {
        this.possuiBau = possuiBau;
    }

    public Veiculo getVeiculo(){
        return new Veiculo(tipoVeiculo, kmRodados, dataAquisicao, placa, marca, modelo, tipoCombustivel, qntEixos, compCarroceria, capacidadeCarga,  possuiBau);
    }

}
