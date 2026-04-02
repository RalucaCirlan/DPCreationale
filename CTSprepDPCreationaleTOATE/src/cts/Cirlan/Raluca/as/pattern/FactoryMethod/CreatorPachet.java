package cts.Cirlan.Raluca.as.pattern.FactoryMethod;

public abstract class CreatorPachet {
    public abstract AbstractPachet createPachet(); //ASTA E FACTORY METHODU

    //METODA OPTIONALA COMUNA PT PRODUSE
    public void proceseazaPachet(){
        AbstractPachet pachet = createPachet(); //obtinem produsul
        pachet.livrare(); //metoda din interfata
    }
}
