package Facade;

import Facade.Subsistema.Cpu;
import Facade.Subsistema.HardDrive;
import Facade.Subsistema.Memoria;

public class ComputadorFacade {
    private Cpu cpu = null;
    private Memoria memoria = null;
    private HardDrive hardDrive = null;

    public ComputadorFacade() {
        this.cpu = new Cpu();
        this.memoria = new Memoria();
        this.hardDrive = new HardDrive();
    }

    public void ligar() {
        cpu.start();
        cpu.load();
        String hdBootInfo = hardDrive.read(0011, 64);
        memoria.load(0101, hdBootInfo);
        cpu.execute();
        hardDrive.write(0100, "Dados de programas de inicialização");
        memoria.free(0101, hdBootInfo);
        cpu.free();
    }
}
