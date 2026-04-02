package cts.Cirlan.Raluca.as.pattern.FactoryMethod2;

public class CreatorButonWindows extends CreatorButon{
    @Override
    public Buton createButon() {
        return new WindowsButton();
    }
}
