public class CasualFact implements AbsGarmentFactory {
    @Override
    public Tops getT(){
        return new CasualTops();

    }

    @Override
    public Pants getP(){
        return new CasualPants();
    }

    @Override
    public Shoes getS(){
        return new CasualShoes();
    }
}
