import java.util.*;
public class TestMain {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        boolean exit=false;
        System.out.println("Enter two number");
        int x=sc.nextInt();
         int y=sc.nextInt();
         do{
          System.out.println("Enter Your Choice");
           System.out.println("1---Addition");
            System.out.println("2---Multiplication");
            System.out.println("3---subtraction");
            System.out.println("4---division");
            System.out.println("5---exit");
            
          switch(sc.nextInt()){
              case 1:
               System.out.println("Result of two number ="+ (x+y));
               break;
               case 2:
                System.out.println("Result of two number ="+ (x*y));
                break;
                case 3:
                 System.out.println("Result of two number ="+ (x-y));
                 break;
                 case 4:
                 if(y!=0)
                 System.out.println("Result of two number ="+ (x/y));
                 else
                  System.out.println("Y should not be zero");
                 break;
                 case 5:
                 exit=true;
             
          }
          }while(exit!=true);
           System.out.println("Program ends");
        
    }
}
