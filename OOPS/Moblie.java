public class Moblie {
    String name,ram,storage;
    double price;

    Moblie(){}

    Moblie(String n,String r,String s,double p){
        name=n;
        ram=r;
        storage=s;
        price=p;
    }

    Sim slot;

    public void insertSim(Sim s){
        if(slot==null){
            slot=s;
            System.out.println("\t\t\tSim Added");
        }
        else
            System.out.println("\t\t\tSim Already Present");
    }

    public void removeSim(){
        if(slot!=null){
            slot=null;
            System.out.println("\t\t\tSim has been Removed");
        }else{
            System.out.println("\t\t\tAlready Sim is Removed");
        }
    }
    public boolean isSimPrensent(){
        return slot!=null;
    }

    public void detailsOfMobile(){
        System.out.println("Mobile Name : "+name);
        System.out.println("Mobile Starage : "+storage);
        System.out.println("Mobile ram : "+ram);
        System.out.println("Mobile Price : "+price);
        System.out.println("Sim Exists : "+((isSimPrensent()?"Yes":"No")));
        System.out.println("********************************************");
    }
}
