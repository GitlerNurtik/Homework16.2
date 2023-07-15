public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Java company");
        programmer.setName("Lazy Man");
        programmer.setDesignation("Making apps, web sites, virus, anti virus etc..");
        programmer.setCompanyName("Java company");

        Dancer dancer = new Dancer("B Komachi");
        dancer.setName("Ai");
        dancer.setDesignation("Dancing and maybe sing");
        dancer.setGroupName("B Komachi");

        Singer singer = new Singer("Idols");
        singer.setName("Akane");
        singer.setDesignation("sing");
        singer.setBandName("Idols");

        System.out.println(programmer);
        System.out.println(dancer);
        System.out.println(singer);
    }
}