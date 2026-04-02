package cts.Cirlan.Raluca.as.pattern.FactoryMethod;

public class CreatorPachetFragil extends CreatorPachet{

    @Override
    public AbstractPachet createPachet() {
        return new PachetFragil();
    }
}
