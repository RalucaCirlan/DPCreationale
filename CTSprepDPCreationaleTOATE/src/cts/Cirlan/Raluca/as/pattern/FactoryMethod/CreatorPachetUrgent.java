package cts.Cirlan.Raluca.as.pattern.FactoryMethod;

public class CreatorPachetUrgent extends CreatorPachet{

    @Override
    public AbstractPachet createPachet() {
        return new PachetUrgent();
    }
}
