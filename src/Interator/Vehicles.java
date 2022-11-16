package Interator;

public class Vehicles {

    private final String model;
    private final VehiclesTypeEnum TYPE;

    public Vehicles(String model, VehiclesTypeEnum type) {
        this.model = model;
        this.TYPE = type;
    }


    public String getModel() {
        return model;
    }

    public VehiclesTypeEnum getTYPE() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Modelo=" + this.model + ", Tipo=" + this.TYPE;
    }

}
