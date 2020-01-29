public class FigureGeo {

    int x;
    int y;

    public FigureGeo(int xx, int yy){
        this.x = xx;
        this.y = yy;
    }

    public FigureGeo() {

    }

    public void definir(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }

    public void tailleX(){
        System.out.println("Taille côté x : " + this.x);
    }

    public void tailleY(){
        System.out.println("Taille côté y : " + this.y);
    }
}

