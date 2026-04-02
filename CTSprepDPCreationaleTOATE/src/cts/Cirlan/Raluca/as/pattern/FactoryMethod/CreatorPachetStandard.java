package cts.Cirlan.Raluca.as.pattern.FactoryMethod;

public class CreatorPachetStandard extends CreatorPachet{

    @Override
    public AbstractPachet createPachet() {
        return new PachetStandard();
    }
}
