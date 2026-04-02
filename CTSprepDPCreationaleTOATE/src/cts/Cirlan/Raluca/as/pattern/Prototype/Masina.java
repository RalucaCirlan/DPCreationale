package cts.Cirlan.Raluca.as.pattern.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Masina implements IPrototype {
    private String model;
    private String motor;
    private List<String> accesorii; // listă de accesorii, ca să vedem deep copy

    public Masina(String model, String motor) {
        this.model = model;
        this.motor = motor;
        this.accesorii = new ArrayList<>();
    }

    public void adaugaAccesoriu(String accesoriu) {
        accesorii.add(accesoriu);
    }

    public void descriere() {
        System.out.println("Masina{" +
                "model='" + model + '\'' +
                ", motor='" + motor + '\'' +
                ", accesorii=" + accesorii +
                '}');
    }

    @Override
    public IPrototype copiaza() {
        // Deep copy
        Masina copie = new Masina(this.model, this.motor);
        for (String a : this.accesorii) {
            copie.adaugaAccesoriu(a);
        }
        return copie;
    }
}