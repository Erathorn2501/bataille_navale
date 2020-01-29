import java.util.ArrayList;
import java.util.List;

public class EssaieArray {

        //TODO Remplacez ?? par le code correct pour créer une liste de type String
        List<String> guests = new ArrayList<String>();

        //TODO Ajoutez Joey, Martin et Marie à la liste
        public EssaieArray(){
            guests.add("Joey");
            guests.add("Martin");
            guests.add("Marie");
        }

        //TODO Complétez l'instruction en remplaçant ?? pour afficher la taille de la liste
    public void AfficherTaille() {
        System.out.println("Taille tableau : " + guests.size());
    }

        //TODO Remplacez Martin par John dans la liste
    public void Remplacer(){
            for(String guest : guests){
                if (guest.equals("Martin"))
                {guests.set(guests.indexOf(guest), "John");}
            }

    }

        //TODO Retirez Joey de la liste
    public void Retirer(String cible){
                guests.remove(cible);
    }

        //Affiche le contenu de la liste
    public void AfficheListe() {
        System.out.println("The guests are:");
        for (String guest : guests) {
            System.out.println(guest);
        }
    }

}
