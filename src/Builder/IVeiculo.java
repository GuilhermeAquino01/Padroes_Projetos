package Builder;

//Interface Builder onde possui os métodos comuns para criar todos os tipos de veículos
public interface IVeiculo {
    void setTipoVeiculo(String tipoVeiculo);
    void setKmRodados(int kmRodados);
    void setDataAquisicao(String dataAquisicao);
    void setPlaca(String placa);
    void setMarca(String marca);
    void setModelo(String modelo);
    void setTipoCombustivel(String tipoCombustivel);
}
