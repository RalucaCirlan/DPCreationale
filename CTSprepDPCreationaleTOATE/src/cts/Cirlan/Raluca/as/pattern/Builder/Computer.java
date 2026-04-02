package cts.Cirlan.Raluca.as.pattern.Builder;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    // Atribute obligatorii
    private String CPU;
    private int RAM;

    // Atribute optionale
    private boolean GPU;
    private boolean SSD;
    private boolean carcasaLED;
    private List<String> mesaje;

    // Constructor privat
    private Computer(String CPU, int RAM, boolean GPU, boolean SSD, boolean carcasaLED, List<String> mesaje) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.GPU = GPU;
        this.SSD = SSD;
        this.carcasaLED = carcasaLED;
        this.mesaje = mesaje;
    }

    // Builder static
    public static ComputerBuilder getBuilder(String CPU, int RAM) {
        return new ComputerBuilder(CPU, RAM);
    }

    public void descriere() {
        System.out.println("Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM=" + RAM +
                ", GPU=" + GPU +
                ", SSD=" + SSD +
                ", carcasaLED=" + carcasaLED +
                ", mesaje=" + mesaje +
                '}');
    }

    // Clasa Builder internă
    public static class ComputerBuilder implements IBuilder {

        // Atribute obligatorii
        private String CPU;
        private int RAM;

        // Atribute optionale
        private boolean GPU;
        private boolean SSD;
        private boolean carcasaLED;
        private List<String> mesaje;

        // Constructor Builder cu obligatorii
        public ComputerBuilder(String CPU, int RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }


        // Setteri pentru opționale
        public ComputerBuilder setGPU(boolean GPU) {
            this.GPU = GPU;
            return this;
        }

        public ComputerBuilder setSSD(boolean SSD) {
            this.SSD = SSD;
            return this;
        }

        public ComputerBuilder setCarcasaLED(boolean carcasaLED) {
            this.carcasaLED = carcasaLED;
            return this;
        }

        public ComputerBuilder addMesaj(String mesaj) {
            if (this.mesaje == null) {
                this.mesaje = new ArrayList<>();
            }
            this.mesaje.add(mesaj);
            return this;
        }

        @Override
        public Computer build() {
            // Validări simple
            if (RAM < 4) {
                throw new RuntimeException("RAM prea mic");
            }
            if (mesaje != null) {
                int totalCaractere = 0;
                for (String mesaj : mesaje) {
                    totalCaractere += mesaj.length();
                }
                if (totalCaractere > RAM) {
                    throw new RuntimeException("Mesajele depasesc capacitatea RAM");
                }
            }

            Computer rezultat = new Computer(CPU, RAM, GPU, SSD, carcasaLED, mesaje);

            // Reset pentru refolosire
            this.GPU = false;
            this.SSD = false;
            this.carcasaLED = false;
            this.mesaje = null;

            return rezultat;
        }
    }
}