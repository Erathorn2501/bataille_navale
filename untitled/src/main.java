import javafx.css.Size;

public class main {

public static void main (String[] args){
    System.out.println("Hello World" + args);

    //int cote1 = 5;
    //int cote2 = 6;

    FigureGeo rectangle = new FigureGeo(5,6);
    //rectangle.x=5;
    //rectangle.y=6;
    rectangle.tailleX();
    rectangle.tailleY();

    Carre carre1 = new Carre();
    carre1.definir(6,6);
    carre1.setCote(carre1.x);
    System.out.println("Le côté du carré est : " + carre1.getCote());
    System.out.println("Son périmètre est de : " + carre1.getPerimetre());

    Carre carre2 = new Carre();
    carre2.definir(7,8);
    //carre2.Carre();
    //carre2.setCote(carre2.x);
    System.out.println("Le côté du carré est : " + carre2.getCote());
    System.out.println("Son périmètre est de : " + carre2.getPerimetre());

    Animal blurf = new Animal();
    Chien toutou = new Chien();

    blurf.nom="Albert";
    toutou.nom="Charles";
    blurf.deplacer();
    toutou.deplacer();

    Direction testDirection = new Direction();
    testDirection.testChoix = Directions.Ouest;
    testDirection.Deplacement(testDirection.testChoix);
    testDirection.testChoix = Directions.Nord;
    testDirection.Deplacement(testDirection.testChoix);

    ColorsArray couleur = new ColorsArray();
    couleur.afficher();
    couleur.replace();
    couleur.afficher();

    EssaieArray myArray = new EssaieArray();
    myArray.AfficheListe();
    myArray.Remplacer();
    myArray.AfficheListe();
    myArray.AfficherTaille();
    myArray.Retirer("Joey");
    myArray.AfficheListe();
    myArray.AfficherTaille();

    TrySet newSet = new TrySet();
    newSet.AfficherSet();
    newSet.AjoutSet("Meringue");
    newSet.AfficherSet();
    newSet.RetirerSet("butter");
    newSet.AfficherSet();

}

}
