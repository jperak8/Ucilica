public class Trokut extends GeometrijskiLik {

    private double poluperimeter;
    private double racun;
    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    public Trokut(String naziv, double stranicaA, double stranicaB, double stranicaC){
        super(naziv);
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        this.stranicaC = stranicaC;
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

    public void setStranicaC(double stranicaC){ this.stranicaC = stranicaC; }

    public double getStranicaC(){
        return stranicaC;
    }

    @Override
    public double povrsina() {
        poluperimeter = (stranicaA + stranicaB + stranicaC) / 2;
        racun = poluperimeter * (poluperimeter - stranicaA) * (poluperimeter - stranicaB) * (poluperimeter - stranicaC);
        return Math.sqrt(racun);
    }

    @Override
    public double opseg() {
        return stranicaA + stranicaB + stranicaC;
    }
}
