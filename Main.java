import java.util.Scanner;

class Main {
  public static int getDegrees()
  {
    
  }

  public static void main(String[] args) {
    bool inputIsGood = true;
    do
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("This program can convert from C to F\nand vice versa.")
      System.out.print("Select a unit that you would like to from: ");
      String originalType = scanner.nextLine();
      switch (originalType)
      {
        case F:
          
          break;
        case C:
          // code block
          break;
        default:
          System.out.println("Please choose either F or C.")
          inputIsGood = false;
      }
    } while (!inputIsGood);
    
  }
}