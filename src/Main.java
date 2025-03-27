public class Main {

    public static void main(String[] args) {

        Trokut trokut = new Trokut("pravokutni", 5, 7, 8.602325267042627 );

        System.out.println("Hipotenuza pravokutnog trokuta je: " + trokut.getStranicaC());

        trokut.setNaziv("raznostranični");

        System.out.println("Naziv nakon promjene naziva je: " + trokut.getNaziv());

        Krug krug = new Krug("šareni", 6);

        System.out.println("Naziv kruga je: " + krug.getNaziv());
        System.out.println("Radius kruga je: " + krug.getRadius());

        if(trokut  instanceof Trokut && krug instanceof Krug){
            System.out.println("trokut je instanca Trokut-a, a krug Krug-a!");
        } else {
            System.out.println("Nije!");
        }

        Pravokutnik pravokutnik = new Pravokutnik("četvrtasti", 10.7, 190.952);

        pravokutnik.setStranicaA(78.42);
        System.out.println("Stranica A pravokutnika je: " + pravokutnik.getStranicaA());
        System.out.println("Naziv pravokutnika je: " + pravokutnik.getNaziv());
        System.out.println("Stranica B pravokutnika je: " + pravokutnik.getStranicaB());

    }

}
