import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Trokut trokut = new Trokut("pravokutni", 5, 7, 8.602325267042627 );
        trokut.setNaziv("raznostranični trokut");
        Krug krug = new Krug("šareni krug", 6);
        Pravokutnik pravokutnik = new Pravokutnik("četvrtasti pravokutnik", 10.7, 190.952);
        pravokutnik.setStranicaA(78.42);
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

        System.out.println(krug.crtaj());
        System.out.println(pravokutnik.crtaj());
        System.out.println(trokut.crtaj());

        System.out.println(krug.crtajBroj(2));
        System.out.println(pravokutnik.crtajBroj(4));
        System.out.println(trokut.crtajBroj(3));

    }

}
