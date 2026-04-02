package cts.Cirlan.Raluca.as.main;

import cts.Cirlan.Raluca.as.pattern.Builder.Computer;
import cts.Cirlan.Raluca.as.pattern.FactoryMethod.AbstractPachet;
import cts.Cirlan.Raluca.as.pattern.FactoryMethod.CreatorPachet;
import cts.Cirlan.Raluca.as.pattern.FactoryMethod.CreatorPachetFragil;
import cts.Cirlan.Raluca.as.pattern.FactoryMethod2.CreatorButon;
import cts.Cirlan.Raluca.as.pattern.FactoryMethod2.CreatorButonLinux;
import cts.Cirlan.Raluca.as.pattern.FactoryMethod2.Buton;
import cts.Cirlan.Raluca.as.pattern.Prototype.Masina;
import cts.Cirlan.Raluca.as.pattern.Singleton.SingletonEager;

public class Main {
    public static void main(String[] args) {
        //================================FACTORY METHOD MAIN TEST===============================
        CreatorPachet creatorPachet= new CreatorPachetFragil();
        AbstractPachet abstractPachet=creatorPachet.createPachet();
        abstractPachet.livrare();

        //==========================FACTORY METHOD2 TEST======================
        CreatorButon creatorButon=new CreatorButonLinux();
        Buton buton=creatorButon.createButon();
        buton.deseneaza();

        //======================TEST BUILDER=====================
        Computer pc1 = Computer.getBuilder("Intel i9", 32)
                .setGPU(true)
                .setSSD(true)
                .setCarcasaLED(true)
                .addMesaj("PC de gaming")
                .build();

        Computer pc2 = Computer.getBuilder("AMD Ryzen 5", 8).build();

        pc1.descriere();
        pc2.descriere();

        //TEST ==================PROTOTYPE================================
        Masina original = new Masina("BMW X5", "Diesel");
        original.adaugaAccesoriu("Navigatie GPS");
        original.adaugaAccesoriu("Scaune incalzite");

        // Copiem masina
        Masina copie = (Masina) original.copiaza();
        copie.adaugaAccesoriu("Jante sport");

        System.out.println("Original:");
        original.descriere();

        System.out.println("Copie:");
        copie.descriere();

        //======================TEST SINGLETON===================
        // Obținem două referințe către aceeași instanță
        SingletonEager instanta1 = SingletonEager.getInstance();
        SingletonEager instanta2 = SingletonEager.getInstance();

        // Testăm dacă sunt exact aceeași instanță
        System.out.println("Sunt aceleași instanțe? " + (instanta1 == instanta2)); // true

        // Apelăm o metodă pentru a vedea funcționalitatea
        instanta1.afiseazaMesaj();
        instanta2.afiseazaMesaj();
    }
}