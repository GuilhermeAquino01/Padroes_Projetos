package Builder.Produtos;

//Classe produto que é instanciada para criar o objeto final
public class Veiculo {

    private String tipoVeiculo;
    private int kmRodados;
    private String dataAquisicao;
    private String placa;
    private String marca;
    private String modelo;
    private String tipoCombustivel;
    private int qntEixos = 0;
    private Double compCarroceria;
    private String capacidadeCarga;
    private Boolean possuiBau = false;

    public Veiculo(String tipoVeiculo, int kmRodados, String dataAquisicao, String placa, String marca, String modelo, String tipoCombustivel, int qntEixos, Double compCarroceria, String capacidadeCarga, Boolean possuiBau) {
        this.tipoVeiculo = tipoVeiculo;
        this.kmRodados = kmRodados;
        this.dataAquisicao = dataAquisicao;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.qntEixos = qntEixos;
        this.compCarroceria = compCarroceria;
        this.capacidadeCarga = capacidadeCarga;
        this.possuiBau = possuiBau;
    }

    //Método que retorna as informações do veiculo gerado
    public String getInfo() {
        String info = "Tipo: " + this.tipoVeiculo;
        info += "\n Placa: " + this.placa;
        info += "\n Marca: " + this.marca;
        info += "\n Modelo: " + this.modelo;
        info += "\n Quilometragem: " + this.kmRodados;
        info += "\n Tipo de combustível: " + this.tipoCombustivel;
        info += "\n Data de aquisição: " + this.dataAquisicao;
        if(this.qntEixos != 0) {
            info += "\n Quantidade de eixos: " + this.qntEixos;
        }
        if(this.compCarroceria != null) {
            info += "\n Comprimento da carroceria: " + this.compCarroceria + " metros";
        }
        if(this.capacidadeCarga != null) {
            info += "\n Capacidade de carga: " + this.capacidadeCarga + "kg";
        }
        if(this.possuiBau) {
            info += "\n Possui Baú: " + "Sim";
        }

        return info;
    }

}
