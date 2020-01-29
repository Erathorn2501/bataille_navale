public enum ShipModel {
    PorteAvion(5) ,Croiseur(4), ContreTorpilleur(3), Torpilleur(2);

    private int size;

    ShipModel(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
