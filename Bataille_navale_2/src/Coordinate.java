public class Coordinate {

    //Déclaration des variables "coordonnées"
    private int abscisse;
    private int ordonnée;

    public int getAbscisse() {
        return abscisse;
    }

    public int getOrdonnée() {
        return ordonnée;
    }

    //Constructeur entier
    public Coordinate(int NewX, int NewY){
        this.abscisse = NewX;
        this.ordonnée = NewY;
    }

    //Calcul des coordonnées suivantes du bateau (depuis la coordonnée de départ)
    public Coordinate ShipNextCoor(Direction dir, int i){

        int newAbscisse, newOrdonnée;

        switch (dir){
            case NORD:
                newAbscisse = this.abscisse;
                newOrdonnée = this.ordonnée + i;
                break;
            case SUD:
                newAbscisse = this.abscisse;
                newOrdonnée = this.ordonnée - i;
                break;
            case OUEST:
                newAbscisse = this.abscisse - i;
                newOrdonnée = this.ordonnée;
                break;
            case EST:
                newAbscisse = this.abscisse + i;
                newOrdonnée = this.ordonnée;
                break;
            default :
                newAbscisse = 0;
                newOrdonnée = 0;
                System.out.println("Soucis détecté");
                throw new IllegalArgumentException();
        }

        return new Coordinate(newAbscisse, newOrdonnée);
    }

    //Vérifie si le bateau dépasse les bornes de la carte
    public boolean verifCoor(Coordinate coorVerif, int borneMap){

        if(coorVerif.abscisse > borneMap || coorVerif.ordonnée > borneMap){
            System.out.println("Dépassement limite supérieure");
            return false;
        }
        else if (coorVerif.abscisse <= 0 || coorVerif.ordonnée <= 0){
            System.out.println("Dépassement limite inférieure");
            return false;
        }
        else return true;
    }

    //Vérifie si un bateau est présent sur une case ou non
    public boolean isOnPlot(Coordinate shipCoor, Coordinate plotCoor){
        if(shipCoor.abscisse == plotCoor.abscisse && shipCoor.ordonnée == plotCoor.ordonnée){
            return true;
        }
        else return false;
    }
}
