public class App {
    //variables of each garment
    private Tops t;
    private Pants p;
    private Shoes s;

    // This is a constructor
    public App(AbsGarmentFactory Fact){
        t = Fact.getT();
        s = Fact.getS();
        p = Fact.getP();
    }

    public void showGarment(){
        t.TypesOfTops();
        p.TypesOfPants();
        s.TypesOfShoes();
    }

}
