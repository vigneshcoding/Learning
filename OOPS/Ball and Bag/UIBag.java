import java.util.*;

public class UIBag {
    static Scanner sc=new Scanner(System.in);
    static Bag bag=new Bag();
    static Tennis tennis=new Tennis();
    static BasketBall basketBall=new BasketBall();

    public static void main(String[] args) {
        boolean home=true;
        do {
            System.out.println("\t\t\t---Ball & Bag---");
            System.out.println("1.AddBall\n2.RemoveBall\n3.Check Bag is Empty or Not\n4.Show Game that can be Played\n5.Exit");
            int input=sc.nextInt();

            switch (input) {
                case 1:{
                    if (bag.isBagEmpty()) {
                        int game=display();
                        if (game==1) {
                            bag.addBall(basketBall);
                        }else if (game==2) {
                            bag.addBall(tennis);
                        }
                    }else{
                        System.out.println("Bag is Already having Ball");
                    }

                    break;}

                case 2:{
                    bag.removeBall();

                    break;}

                case 3:{
                    if (bag.isBagEmpty()) {
                        System.out.println("\t\t\tBag is Empty");
                    }else{
                        System.out.println("\t\t\tBag is Not Empty");
                    }
                    break;}
                case 4:{
                    System.out.println(bag.showGame());
                    break;}
                case 5:{
                    home=false;
                    break;}
            }
        } while (home);
        System.out.println("\t\t\t***Thank You***");
    }

    public static int display(){
        System.out.println("\t\t\tSelect the Input");
        System.out.println("1.Basket Ball\n2.Tennis Ball");
        return sc.nextInt();
    }
}
