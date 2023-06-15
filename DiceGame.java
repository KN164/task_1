import java.util.Random;

class DiceGame{
  public static void main(String args[]) {

      System.out.println("What is your name?");
      
      Scanner sc=new Scanner(System.in);
      String name=sc.nextLine();
	
      System.out.println("Hello, "+name+"!");
      
      System.out.println("Rolling dice...");
      
      Random rand = new Random();
      int num1 = rand.nextInt(6)+1;
      int num2 = rand.nextInt(6)+1;

      System.out.println("Dic 1: "+num1);
      System.out.println("Dic 2: "+num2);
      
      System.out.println("Total value: "+(num1+num2));
      
      if(num1+num2>7){
	  System.out.println("You won");
      }else{
	  System.out.println("You lost");
      }
  }
    
}
