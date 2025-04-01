import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Trokut trokut = new Trokut("pravokutni", 5, 7, 8.602325267042627 );

//        System.out.println("Hipotenuza pravokutnog trokuta je: " + trokut.getStranicaC());

        trokut.setNaziv("raznostranični trokut");

//        System.out.println("Naziv nakon promjene naziva je: " + trokut.getNaziv());

        Krug krug = new Krug("šareni krug", 6);

//        System.out.println("Naziv kruga je: " + krug.getNaziv());
//        System.out.println("Radius kruga je: " + krug.getRadius());

//        if(trokut  instanceof Trokut && krug instanceof Krug){
//            System.out.println("trokut je instanca Trokut-a, a krug Krug-a!");
//        } else {
//            System.out.println("Nije!");
//        }

        Pravokutnik pravokutnik = new Pravokutnik("četvrtasti pravokutnik", 10.7, 190.952);

        pravokutnik.setStranicaA(78.42);
//        System.out.println("Stranica A pravokutnika je: " + pravokutnik.getStranicaA());
//        System.out.println("Naziv pravokutnika je: " + pravokutnik.getNaziv());
//        System.out.println("Stranica B pravokutnika je: " + pravokutnik.getStranicaB());
//
//        System.out.println("Opseg kruga je: " + krug.opseg() + " a površina kruga je: " + krug.povrsina());
//
//        System.out.println("Opseg pravokutnika je: " + pravokutnik.opseg() + " a površina pravokutnika je: " + pravokutnik.povrsina());
//
//        System.out.println("Opseg trokuta je: " + trokut.opseg() + " a površina trokuta je: " + trokut.povrsina());
//
//        System.out.println(krug.toString());
//
//        System.out.println(trokut.toString());
//
//        System.out.println(pravokutnik.toString());

        Krug krug2 = new Krug("krug2", 300);

        Pravokutnik pravokutnik2 = new Pravokutnik("pravokutnik2", 100, 5);

        Ucilica ucilica = new Ucilica();

        ucilica.getLikovi().add(krug);
        ucilica.getLikovi().add(krug2);
        ucilica.getLikovi().add(pravokutnik);
        ucilica.getLikovi().add(pravokutnik2);


        Collections.sort(ucilica.getLikovi());

        for (GeometrijskiLik lik : ucilica.getLikovi()) {
            System.out.println(lik.toString());
        }

    }

}
