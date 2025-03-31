public abstract class GeometrijskiLik {

    private String naziv;

    public abstract double povrsina();

    public abstract double opseg();

    GeometrijskiLik(String naziv){
        this.naziv = naziv;
    }

    public void setNaziv(String naziv){
        this.naziv = naziv;
    }

    public String getNaziv(){
        return naziv;
    }

    @Override
    public String toString(){
        return  "Naziv: " + naziv + " opseg: " + opseg() + " površina: " + povrsina();
    }

}
