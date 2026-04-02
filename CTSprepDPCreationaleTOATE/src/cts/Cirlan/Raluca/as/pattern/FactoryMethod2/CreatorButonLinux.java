package cts.Cirlan.Raluca.as.pattern.FactoryMethod2;

public class CreatorButonLinux extends CreatorButon{

    @Override
    public Buton createButon() {
        return new LinuxButton();
    }
}
