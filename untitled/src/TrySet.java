import java.util.*;

public class TrySet {

        Set<String> ingredients = new HashSet<>();

        public TrySet() {
            ingredients.add("sugar");
            ingredients.add("chocolate");
            ingredients.add("butter");
            ingredients.add("vanilla");
        }

        //TODO Ajoutez un autre ingrédient à l'ensemble
    public void AjoutSet(String ajout){
            ingredients.add(ajout);
    }

        //TODO Supprimez la vanille
    public void RetirerSet(String retrait){
            ingredients.remove(retrait);
    }

        //Affiche le résultat de l'ensemble
    public void AfficherSet() {
        System.out.println("Here is our ingredients list");
        for (String ingredient : ingredients) {
            System.out.println(ingredient);
        }
    }


}