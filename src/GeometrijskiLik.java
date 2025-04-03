public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik>, Crtanje {

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

    @Override
    public int compareTo(GeometrijskiLik drugi) {
        return Double.valueOf(this.povrsina()).compareTo(Double.valueOf(drugi.povrsina()));
        //return Double.valueOf(this.opseg()).compareTo(Double.valueOf(drugi.opseg()));
    }


}
