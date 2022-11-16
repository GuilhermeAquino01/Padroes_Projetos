package Interator;

public interface IVehicleCollection {

    void addVehicle(Vehicles v);

    void removeVehicle(Vehicles v);

    IVehicleIterator iterator(VehiclesTypeEnum type);

}