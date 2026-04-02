package cts.Cirlan.Raluca.as.pattern.FactoryMethod;

public class PachetUrgent implements AbstractPachet{

    @Override
    public void livrare() {
        System.out.println("trebuie livrat în aceeași zi.");
    }
}
