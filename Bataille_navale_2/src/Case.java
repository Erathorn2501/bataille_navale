public class Case {

    //Déclaration des attributs de la Case
    Coordinate caseCoor;
    int etat;

    //Calcul et retour de l'état de la case
    public String setCase(){
        switch (this.etat){
            case 0 : return "~";
            case 1 : return "O";
            case 2 : return  "X";
            default: return ("@");
        }
    }
}
