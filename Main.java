import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1
    
    for (int i = 1; i <= 25; i++) {
      if (i % 2 != 0) {
        System.out.print(i + " ");  
      }
    }
    
    // Problem 2
    for(int num = 17; num == 73; num++)
    {
      System.out.println(num);
    }
    if ((num - 17 + 1) % 10 == 0) {
      System.out.println( );
    }
    else {
      System.out.println(" ");
    }

    // Problem 3
    Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 50: ");
        int num = scanner1.nextInt();

        if (num <= 0 || num >= 50) {
            System.out.println("error");
        } else {

            for (int i = num; i <= 50; i++) {
                System.out.print(i + " ");

                if ((i - num + 1) % 5 == 0) {
                    System.out.println();  
                }
            }
        }

        // Problem 4 

        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = scanner2.nextInt();

        if (num <= 0) {
            System.out.println("error");
        } else {
            int start = (num / 3) * 3;

            for (int i = start; i >= 0; i -= 3) {
                System.out.print(i + " ");
            }
        }

  }
}
