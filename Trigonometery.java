import java.util.*;
public class Trigonometery 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);

        //Variable Declaration:
        int option_1;

        //
        System.out.println("Welcome to the program which can help you with Trigonometery! ");
        System.out.println("I can do many things... ");
        System.out.println("I can show you all the formulas... ");
        System.out.println("standard angle table... ");
        System.out.println("and much much more \n");
        System.out.println("1 - for the Standard Angles ");
        System.out.println("2 - for General formulas of sin, cos, tan, etc ");
        option_1 = sc.nextInt();

        switch(option_1)
        {
            case 1://standard angle table
            {
                System.out.println("What do you want? - sin, cos, tan, cot, sec, cosec");
                String choice = sc.next();
                choice = choice.toLowerCase().strip();

                System.out.println("Enter angle of \u0398");
                String angle_1 =  sc.next();
                angle_1 = angle_1.toLowerCase().strip();
                String var3  = choice.concat(angle_1);
                System.out.println(var3);

                //System.out.println(var3);
                if (var3 == "sin0"||var3=="cos90"||var3=="tan0"||var3=="cot90")
                    System.out.println("0");
                
                else if (var3=="sin30"||var3=="cos60")
                    System.out.println("1/2");
                
                else if (var3=="sin90"||var3=="tan45"||var3=="cot45"||var3=="sec0"||var3=="cosec90")
                    System.out.println("1");
                
                else if (var3=="tan90"||var3=="cot0"||var3=="sec90"||var3=="cosec0")
                    System.out.println("Not defined ");
                
                else if (var3=="sin45"||var3=="cos45")
                    System.out.println("1/\u221A 2 ");
                
                else if(var3=="tan30"||var3=="cot60")
                    System.out.println("1 / \u221A 3");

                else if(var3=="sin60"||var3=="cos60")
                    System.out.println("\u221A 3 / 2 ");

                else if (var3=="sec30"||var3=="cosec60")
                    System.out.println("2 / \u221A 3");

                else if(var3=="sec45"||var3=="cosec45")
                    System.out.println("\u221A 2");

                else if(var3=="cot30"||var3=="tan60")
                    System.out.println("\u221A 3");

                else if (var3=="cosec30"||var3=="sec60")
                    System.out.println("2");

                else
                    System.out.println("Error! Please enter correct values. ");
            
            }
            break;
            case 2://general formula
            {
                System.out.println("In the trinagle, ");

                System.out.println("Enter length of Hypotenuse: ");
                double hypotenuse_2 = sc.nextDouble();

                System.out.println("Enter length of Adjacent ");
                double adjacent = sc.nextDouble();

                System.out.println("Enter length of Opposite ");
                double opposite = sc.nextDouble();

                if ((hypotenuse_2*hypotenuse_2) == (opposite*opposite) + (adjacent*adjacent))
                {
                    // AB hyp; BC opp; AC adj
                    System.out.println("Sin \u0398");
                    FindReducedFraction(opposite,hypotenuse_2);

                    System.out.println("\ncos \u0398");
                    FindReducedFraction(adjacent, hypotenuse_2);

                    System.out.println("\ntan \u0398");
                    FindReducedFraction(opposite, adjacent);

                    System.out.println("\ncot \u0398");
                    FindReducedFraction(adjacent, opposite);

                    System.out.println("\nsec \u0398");
                    FindReducedFraction(hypotenuse_2, adjacent);

                    System.out.println("\ncosec \u0398");
                    FindReducedFraction(hypotenuse_2, opposite);
                }
                else
                    System.out.println("Enter correct values: ");                
            }
            break;
            default:
            System.out.println("Error!! Enter correct values ");
        }
        sc.close();
    }

    public static void FindReducedFraction(double var1,double var2){
        double temp1 = var1;
        double temp2 = var2; 
        while (var1 != var2)
        {
            if(var1 > var2)
                var1 = var1 - var2;
            else
                var2 = var2 - var1;
        }      

        double n3 = temp1 / var1 ;
        double n4 = temp2 / var2 ;
        System.out.println(n3+" : "+n4);

    }
}