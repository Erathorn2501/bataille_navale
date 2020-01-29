public class Direction {

    Directions testChoix;

    public void Deplacement(Directions testChoix){

        switch (testChoix){
            case Nord :
                System.out.println("Vous allez dans la bonne direction.");
                break;
            default:
                System.out.println("Faux ! Vous allez au " + testChoix);
                break;
        }
    }


}
