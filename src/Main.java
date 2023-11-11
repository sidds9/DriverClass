public class Main {

    // Abstract factory design pattern demo
    public static void main(String[] args) {
        App app = configureApp();
        app.showGarment();
    }
    //application configuration
    private static App configureApp() {

        App app = null;
        AbsGarmentFactory factory;

        String type = "Casual";

        if (type.contains("Professional")) {
            factory = new ProfFact();
            app = new App(factory);
        }
        else if (type.contains("Casual")) {
            factory = new CasualFact();
            app = new App(factory);
        }
        else if (type.contains("Party")) {
            factory = new PartyFact();
            app = new App(factory);
        }
        else {
            System.out.println("No Factory in the system");
        }
        return app;
    }


}