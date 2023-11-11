public class PartyFact implements AbsGarmentFactory{
    @Override
    public Tops getT(){
        return new PartyTops();
    }

    public Pants getP(){
        return new PartyPants();
    }

    public Shoes getS(){
        return new PartyShoes();
    }





}
