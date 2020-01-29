import java.util.ArrayList;
import java.util.List;

public class Ship {

    //Déclaration des attributs du bateau
    private Coordinate coor;
    private ShipModel model;
    private int size;
    private Direction dir;
    private int HP;
    private List<Coordinate> listCoor = new ArrayList<Coordinate>();

    //Constructeur bateau entier
    public Ship (Coordinate NewCoor, ShipModel NewModel, Direction NewDir){
        this.coor = NewCoor;
        this.model = NewModel;
        this.dir = NewDir;
        this.size=NewModel.getSize();

        this.HP = this.size;

        //Inscription dans une liste des coordonnées de chaque partie du bateau
        for(int i = 0; i<size; i++){
            listCoor.add(this.coor.ShipNextCoor(dir,i));
        }

    }

    //Après touche, vérifie si le bateau est coulé ou non
    public int shipTouche(){
        //Baisse les PDV
        this.HP -= 1;
        //Vérifie si le bateau est "coulé" ou non, et renvoie la valeur associée
        if (this.HP==0) return 0;
        else return 1;
    }

    public int getSize() {
        return size;
    }

    public List<Coordinate> getListCoor() {
        return listCoor;
    }
}
