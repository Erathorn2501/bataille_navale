public class ColorsArray {

        //TODO- Déclarez une variable nommée colors qui correspond à un tableau de String de longueur 5
        String colors[] = new String[5];

public ColorsArray(){
        //TODO- Remplissez le tableau avec les couleurs demandées red, yellow, orange, green, blue
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    colors[i] = "Red";
                    break;
                case 1:
                    colors[i] = "Yellow";
                    break;
                case 2:
                    colors[i] = "Orange";
                    break;
                case 3:
                    colors[i] = "Green";
                    break;
                case 4:
                    colors[i] = "Blue";
                    break;
            }
        }
    }
    public void replace() {
        //TODO- Remplacez 'green' par 'emerald' dans le tableau
        for (int i = 0; i < 5; i++) {
            if (colors[i] == "Green"){colors[i]="Emerald";}
        }
    }

public void afficher() {
    //Affiche le contenu du tableau
    for (String color : colors) {
        System.out.println(color);
    }
}
}