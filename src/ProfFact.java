public class ProfFact implements AbsGarmentFactory{
    @Override
    public Tops getT(){
        return new ProfTops();
    }

    @Override
    public Pants getP(){
        return new ProfPants();
    }

    @Override
    public Shoes getS(){
        return new ProfShoes();
    }
}
