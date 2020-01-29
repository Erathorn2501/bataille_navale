public class Main {

    public static void main(String[] args) {


        Coordinate coorTest = new Coordinate(2, 2);
        Ship shipTest = new Ship(coorTest, ShipModel.PorteAvion, Direction.NORD);

        System.out.println("Taille bateau " + shipTest.getSize());

        int i = 1;

        for (Coordinate testCoor : shipTest.getListCoor()) {
            System.out.println("x" + i + " = " + testCoor.getAbscisse());
            System.out.println("y" + i + " = " + testCoor.getOrdonnée());
            i++;
        }
    }
}
