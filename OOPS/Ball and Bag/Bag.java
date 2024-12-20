public class Bag {
    Ball b;

    public void addBall(Ball b){
        if (this.b==null) {
            this.b=b;
            System.out.println("\t\t\tBall Added");
        }else{
            System.out.println("\t\t\tAlready Bag is Having Ball");
        }
    }

    public void removeBall(){
        if (this.b!=null) {
            b=null;
            System.out.println("\t\t\tBall Removed");
        }else{
            System.out.println("\t\t\tAlready Ball is Removed From Bag");
        }
    }

    public boolean isBagEmpty(){
        return b==null;
    }

    public String showGame(){
        if(b instanceof BasketBall){
            BasketBall bb=(BasketBall)b;
            return bb.game;
        }else if (b instanceof Tennis) {
            Tennis t=(Tennis)b;
            return t.game;
        }
        return "\t\t\t No Game is Being Played Bag is Empty";
    }
}
