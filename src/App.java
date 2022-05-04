public class App {
    public static void main(String[] args) throws Exception {
        //if else e ternario
        boolean isOnline = true;
        if (isOnline) {
            System.out.println("E' online");
        } else {
            System.out.println("Non e' online");
        }
        String x = 3 < 10 ? "ciao" : "buongiorno";
        System.out.println(x);

        //switch
        String nome = "Luca";
        switch (nome) {
            case "Luca":
                System.out.println("Ciao Luca");
                break;
            case "Marco":
                System.out.println("Ciao Marco");
                break;
            default:
                System.out.println("Ciao chiunque tu sia");
                break;
        }
    }
}
