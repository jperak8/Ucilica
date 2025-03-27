public class Krug {

    private String naziv;
    private double radius;

    public Krug(String naziv, double radius){
        this.naziv = naziv;
        this.radius = radius;
    }

    public void setNaziv(String naziv){
        this.naziv = naziv;
    }

    public String getNaziv(){
        return naziv;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

}
