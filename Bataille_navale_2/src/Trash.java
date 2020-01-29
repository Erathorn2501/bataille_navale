public class Trash {
    //Méthode de récupération des coordonnées de fin du bateau
    public Coordinate GetEndCoor(Coordinate Coor, Direction Dir, int shipSize){

        //Déclaration d'une coordonnée vide pour recevoir le résultat "coordonnées finales"
        Coordinate FinCoor = new Coordinate();

        //Calcul de la coordonnée d'arrivée en fonction de la direction
        switch (Dir){
            case NORD:{
                FinCoor.x = Coor.x;
                FinCoor.y = Coor.y + shipSize;
            }
            case EST:{
                FinCoor.x = Coor.x + shipSize;
                FinCoor.y = Coor.y;
            }
            case SUD:{
                FinCoor.x = Coor.x;
                FinCoor.y = Coor.y - shipSize;
            }
            case OUEST:{
                FinCoor.x = Coor.x - shipSize;
                FinCoor.y = Coor.y;
            }
        }

        //Renvoie les coordonnées calculées
        return FinCoor;
    }
}
