public class Coordinate {

    //Déclaration des variables "coordonnées"
    int x;
    int y;

    //Constructeur à vide
    public Coordinate(){

    }

    //Constructeur entier
    public Coordinate(int NewX, int NewY){
        this.x = NewX;
        this.y = NewY;
    }

    //Calcul des coordonnées suivantes du bateau (depuis la coordonnée de départ)
    public Coordinate ShipNextCoor(Direction dir, int i){

        Coordinate newCoor = new Coordinate();

        switch (dir){
            case NORD:
                newCoor.x = this.x;
                newCoor.y = this.y + i;
                return newCoor;
            case SUD:
                newCoor.x = this.x;
                newCoor.y = this.y - i;
                return newCoor;
            case OUEST:
                newCoor.x = this.x - i;
                newCoor.y = this.y;
                return newCoor;
            case EST:
                newCoor.x = this.x + i;
                newCoor.y = this.y;
                return newCoor;
            default :
                newCoor.x = 0;
                newCoor.y = 0;
                System.out.println("Soucis détecté");
                throw new IllegalArgumentException();
        }
    }

}
