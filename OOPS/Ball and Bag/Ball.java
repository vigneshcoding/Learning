class Bag {
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
            System.out.println("\t\t\tAlready Ball is Removed from Bag ");
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
        return "No Game is Being Played Bag is Empty";
    }
}

public class Ball {
    private double radius;

    public Ball(){}

    public Ball(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }
}

class BasketBall extends Ball{
    String game="Basket Ball";
    public BasketBall(){
        super(15);
    }
}

class Tennis extends Ball{
    String game="Tennis Ball";

    public Tennis(){
        super(5);
    }
}
