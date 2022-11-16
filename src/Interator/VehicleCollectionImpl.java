package Interator;

import java.util.ArrayList;
import java.util.List;

public class VehicleCollectionImpl implements IVehicleCollection {

    private final List<Vehicles> vehiclesList;

    public VehicleCollectionImpl() {
        vehiclesList = new ArrayList<>();
    }

    @Override
    public void addVehicle(Vehicles v) {
        this.vehiclesList.add(v);
    }

    @Override
    public void removeVehicle(Vehicles v) {
        this.vehiclesList.remove(v);
    }

    @Override
    public IVehicleIterator iterator(VehiclesTypeEnum type) {
        return new VehicleIteratorImpl(type, this.vehiclesList);
    }

    private class VehicleIteratorImpl implements IVehicleIterator {

        private final VehiclesTypeEnum type;
        private final List<Vehicles> vehicles;
        private int position;

        public VehicleIteratorImpl(VehiclesTypeEnum ty, List<Vehicles> vehiclesList) {
            this.type = ty;
            this.vehicles = vehiclesList;
        }

        @Override
        public boolean hasNext() {
            while (position < vehicles.size()) {
                Vehicles vehicle = vehicles.get(position);  // Pegar o veiculo da autual posicao
                if (vehicle.getTYPE().equals(type) || type.equals(VehiclesTypeEnum.ALL)) {
                    return true;
                } else
                    position++;  // incrementa a posicao se o tipo do veiculo atual nao for ALL ou o tipo passado no construtor
            }
            return false;  // quando a posicao for maior que o tamanho da lista de veiculo
        }

        @Override
        public Vehicles next() {
            Vehicles vehicle = vehicles.get(position);  // obtem o veiculo da posicao atual
            position++;  // incrementa a posicao
            return vehicle;
        }

    }
}