
import java.util.Scanner;
interface Burger
{
    void burgerRecipe();
}
interface BurgerKing extends Burger{
    public String sauces();
}
interface Macdonalds extends Burger{
   public String sauces();
}
final class BurgerKingMenu implements BurgerKing
{   Scanner sc;
    BurgerKingMenu()
    {
        sc=new Scanner(System.in);
    }
    public String sauces()
    {
        System.out.println("Please choose sauce you want to add \n1.for Mayonise \n2.for Tandoori \n3.Mustard \n4.Tomato \n5.Garlic");
        switch(sc.nextInt())
        {
            case 1:
            return "Mayonise";
            
            case 2:
            return "Tandoori";
            
            case 3:
            return "Mustard";
            
            case 4:
            return "Tomato";
            
            case 5:
            return "Garlic";
            

        }
        return "something";
    }
    public void  burgerRecipe()
    {
        System.out.println(sauces()+" sauces added enjoy your meal");
    }
    public void showmenu()
    {
        System.out.println("What would you like to have\n 1.TikkiTwist \n2.Whopper \n4.Coke \n4.FrenchFries");
        switch(sc.nextInt())
        {   
                case 1:
                burgerRecipe();
                break;
                case 2:
                burgerRecipe();
                break;
                case 3:
                System.out.println("enjoy your coke");
                break;
                case 4:
                System.out.println("enjoy your Fries");
                break;

        }
    }

}
final class MacdonaldsMenu implements Macdonalds{
   
        Scanner sc;
        MacdonaldsMenu()
        {
            sc=new Scanner(System.in);
        }
    public String sauces()
    {
        System.out.println("Please choose sauce you want to add \n1.for Mayonise \n2.for Tandoori \n3.Mustard \n4.Tomato \n5.Garlic");
        switch(sc.nextInt())
        {
            case 1:
            return "Mayonise";
            
            case 2:
            return "Tandoori";
            
            case 3:
            return "Mustard";
            
            case 4:
            return "Tomato";
            
            case 5:
            return "Garlic";
            

        }
        return "something";
    }
    
    public void burgerRecipe()
    {
        System.out.println(sauces()+"sauces added enjoy your meal");
    }
    public void showmenu()
    {
        System.out.println("What would you like to have \n1.MacAlooTikki \n2.MaharajaMac \n3.Coke \n4.FrenchFries");
        switch(sc.nextInt())
        {   
                case 1:
                burgerRecipe();
                break;
                case 2:
                burgerRecipe();
                break;
                case 3:
                System.out.println("enjoy your coke");
                break;
                case 4:
                System.out.println("enjoy your Fries");
                break;

        }
    }
}

