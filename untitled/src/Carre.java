public class Carre extends FigureGeo {

private int cote;

    public Carre() {
        //super();
        //super(xx, yy);
        this.cote = this.x;
    }

    //public void Carre(){
    //this.cote = this.x;
    //}

    public int getCote(){
    return cote;
}

    public int getPerimetre(){
        return 4*cote;
    }

    public void setCote(int taille){
        this.cote=taille;

    }

}