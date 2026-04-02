package cts.Cirlan.Raluca.as.pattern.FactoryMethod2;

public class CreatorButonMac extends CreatorButon{

    @Override
    public Buton createButon() {
        return new MacButton();
    }
}
