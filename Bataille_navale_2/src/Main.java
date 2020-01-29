public class Main {

    public static void main(String[] args) {


        Coordinate coorTest = new Coordinate(2, 2);
        Coordinate coorFin = new Coordinate();
        Ship shipTest = new Ship(coorTest, ShipModel.PorteAvion, Direction.NORD);

        System.out.println("Taille bateau " + shipTest.size);

        for (Coordinate testCoor : shipTest.listCoor) {
            System.out.println("x = " + testCoor.x);
            System.out.println("y = " + testCoor.y);
        }
    }
}
