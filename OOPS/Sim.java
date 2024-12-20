public class Sim {
    String operator_name;
    String band_width;
    double Price;

    Sim(){}

        Sim(String operator_name,String band_width,double Price){
            this.operator_name=operator_name;
            this.band_width=band_width;
            this.Price=Price;
        }

        public void detailsOfSim(){
            System.out.println("Operator Name : "+operator_name);
            System.out.println("Band Width Name : "+band_width);
            System.out.println("Price : "+Price);
            System.out.println("*************************************");
        }
    }

