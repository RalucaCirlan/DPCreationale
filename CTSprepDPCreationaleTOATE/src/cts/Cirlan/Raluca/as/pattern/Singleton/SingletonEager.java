package cts.Cirlan.Raluca.as.pattern.Singleton;

public class SingletonEager {

    // Instanța este creată imediat la încărcarea clasei
    private static final SingletonEager instance = new SingletonEager();

    // Constructor privat
    private SingletonEager() {}

    // Metodă publică pentru acces
    public static SingletonEager getInstance() {
        return instance;
    }

    // Exemplu de metodă
    public void afiseazaMesaj() {
        System.out.println("Acesta este Singleton Eager!");
    }
}