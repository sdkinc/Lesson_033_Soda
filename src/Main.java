public class Main {
    public static void main(String[] args) {
        Soda fanta = new Soda("orange");
        System.out.println(fanta.getAddon());
        fanta.setAddon("lime");
        System.out.println(fanta.getAddon());
    }
}