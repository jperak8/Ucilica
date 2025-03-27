public class Pravokutnik {

    private String naziv;
    private double stranicaA;
    private double stranicaB;

    public Pravokutnik(String naziv, double stranicaA, double stranicaB){
        this.naziv = naziv;
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }

    public void setNaziv(String naziv){
        this.naziv = naziv;
    }

    public String getNaziv(){
        return naziv;
    }

    public void setStranicaA(double stranicaA){
        this.stranicaA = stranicaA;
    }

    public double getStranicaA(){
        return stranicaA;
    }

    public void setStranicaB(double stranicaB){
        this.stranicaB = stranicaB;
    }

    public double getStranicaB(){
        return stranicaB;
    }

}
