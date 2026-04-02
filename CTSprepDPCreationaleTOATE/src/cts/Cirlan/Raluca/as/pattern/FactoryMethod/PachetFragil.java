package cts.Cirlan.Raluca.as.pattern.FactoryMethod;

public class PachetFragil implements AbstractPachet{

    @Override
    public void livrare() {
        System.out.println("necesită manipulare atentă și notificare specială la livrare");
    }
}
