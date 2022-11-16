package Interator;

public class Cliente {

    public static void main(String[] args) {
        IVehicleCollection vehicles = populateVehicles();  // Populando a lista de veiculos
        IVehicleIterator baseIterator = vehicles.iterator(VehiclesTypeEnum.ALL);  // Iterando sobre todos os tipos de veiculos da lista

        while (baseIterator.hasNext()) {
            Vehicles v = baseIterator.next();
            System.out.println(v.toString());
        }

        System.out.println("******");

        // Iterator com o tipo Carro
        IVehicleIterator carroIterator = vehicles.iterator(VehiclesTypeEnum.CARRO);

        while (carroIterator.hasNext()) {
            Vehicles vehicle = carroIterator.next();
            System.out.println(vehicle.toString());
        }
    }

    private static IVehicleCollection populateVehicles() {
        IVehicleCollection vehicles = new VehicleCollectionImpl();

        vehicles.addVehicle(new Vehicles("Uno Mile", VehiclesTypeEnum.CARRO));
        vehicles.addVehicle(new Vehicles("Chevrolet S10", VehiclesTypeEnum.CAMINHONETE));
        vehicles.addVehicle(new Vehicles("Scania R450", VehiclesTypeEnum.CAMINHAO));
        vehicles.addVehicle(new Vehicles("Fiat Toro", VehiclesTypeEnum.CAMINHONETE));
        vehicles.addVehicle(new Vehicles("Gol", VehiclesTypeEnum.CARRO));
        vehicles.addVehicle(new Vehicles("Volvo FH 540", VehiclesTypeEnum.CAMINHAO));

        return vehicles;
    }

}
