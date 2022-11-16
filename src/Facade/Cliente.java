package Facade;

import Facade.Subsistema.Cpu;
import Facade.Subsistema.HardDrive;
import Facade.Subsistema.Memoria;

public class Cliente {
    public static void main(String[] args) {

        //INICIALIZAR COMPUTADOR SEM O FACADE//
        System.out.println("INICIALIZAR COMPUTADOR SEM O FACADE");
        Cpu cpu = new Cpu();
        Memoria memoria = new Memoria();
        HardDrive hardDrive = new HardDrive();

        cpu.start();
        cpu.load();
        String hdBootInfo = hardDrive.read(0011, 64);
        memoria.load(0101, hdBootInfo);
        cpu.execute();
        hardDrive.write(0100, "Dados de programas de inicialização");
        memoria.free(0101, hdBootInfo);
        cpu.free();

        //INICIALIZAR COMPUTADOR COM FACADE//
        System.out.println("----------------------------------------------------");
        System.out.println("INICIALIZAR COMPUTADOR COM FACADE");
        ComputadorFacade computador = new ComputadorFacade();
        computador.ligar();
    }
}
