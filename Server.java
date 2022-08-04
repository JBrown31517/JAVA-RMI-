import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.lang.Math;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

 interface Hello extends Remote {
    String sayHello() throws RemoteException;
}     
public class Server implements Hello {  
    public Server() {}
    public String sayHello() {
        return "Hello, world!";
    }
    
    public static void main(String args[]) {
        System.out.println("Enter 3 integers: ");
            Scanner input = new Scanner(System.in);
            int a = input.nextInt(); int b = input.nextInt(); int c = input.nextInt();
            int max =  Math.max(Math.max(a,b),c);

            System.out.println(a + " " + b + " "+ c);
            System.out.println("Maximum: " + max + "\n");
        try {
            Server obj = new Server();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

            
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1099);
            registry.bind("Hello", stub);
            System.err.println("Server is running");
            
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());

            e.printStackTrace();}
        }

        static double estimatedCalories(String activity, int time){
            
                
    
                double calories = 0;
                if(activity.equals("sit")){
                    calories = 1.4;
                }
                else if(activity.equals("walk")){
                    calories = 5.4;
                }
                else if(activity.equals("jog")){
                    calories = 13.0;
                }

                else if(activity.equals("bike")){
                    calories = 6.8;
                }
                else if(activity.equals("swim")){
                    calories = 8.7;


                }
                    return time * calories;
            }
    
            static Scanner scan = new Scanner(System.in);
            static{

            System.out.println("Type Activity: ");
            }

            static String activity = scan.next();
            static{ 
                
                System.out.println("Type Duration: ");
            }
            static int duration = scan.nextInt();
            static{
                System.out.println("Calories: " + estimatedCalories(activity, duration) + "\n");
            }
    
            
    
            public static double uberServiceMins(double[] passen, double[] uber1, double[] uber2, double[] uber3) {
            
                double distance1 = Math.abs(passen[0] - uber1[0]) + Math.abs(passen[1] - uber1[1]);

                double time1 = distance1 * 3.5;
                        double minimumTime = time1;

                        double distance2 = Math.abs(passen[0] - uber2[0]) + Math.abs(passen[1] - uber2[1]);
                        double time2 = distance2 * 3.5;
        
                if (minimumTime > time2) {
                    
                    minimumTime = time2;

                }
        
                double distance3 = Math.abs(passen[0] - uber3[0]) + Math.abs(passen[1] - uber3[1]);

                double time3 = distance2 * 3.5; 
        
                        if (minimumTime > time3) {
                    minimumTime = time3;
                }

                         return minimumTime;
                
            }
            
            {System.out.println("Type 8 numbers and hit enter after each: ");}
            Scanner uberService = new Scanner(System.in);
            
            static double[] passen = new double[2]; static double[] uber1 = new double[2]; static double[] uber2 = new double[2]; static double[] uber3 = new double[2];{
             
                passen[0] = uberService.nextDouble(); passen[1] = uberService.nextDouble(); uber1[0] = uberService.nextDouble(); uber1[1] = uberService.nextDouble(); uber2[0] = uberService.nextDouble(); uber2[1] = uberService.nextDouble(); uber3[0] = uberService.nextDouble(); uber3[1] = uberService.nextDouble();
            
                System.out.printf("uberService Time = %.2f min." + "\n", uberServiceMins(passen, uber1, uber2, uber3));

                System.out.printf("Starting server..." + "\n");

            
        
        
    

        
    }
        
       

         
} 

  

    

         






