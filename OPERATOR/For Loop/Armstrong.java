import java.util.Scanner;
public class Armstrong {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        int num=sc.nextInt();

        int temp=num,count=0,sum=0,ans=1;
        while (num>0) {
            num/=10;
            count++;
        }
        for(int i=temp;i>0;i/=10){
            int last=i%10;
            for(int j=1;j<=count;j++){
                ans*=last;
            }
            sum+=ans;
            ans=1;
        }
        if (sum==temp) {
            System.out.println(temp+" is ArgStrong Number");
        }else{
            System.out.println(temp+" is Not ArmStrong Number");
        }

    }
}
