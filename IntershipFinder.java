import java.util.Scanner;

public class IntershipFinder{
   /*
    * 
    1. Sing up
    1.1 Name 
    1.2 Gmail
    2. sign in
    2.1 checking data
    3. collection data
    4. show data
    5. searching data
    6. edit data
    7. remove data
    */
    public static void main(String[] args) {
        option();
    }
    public static void option(){
      try (Scanner sc = new Scanner(System.in)) {
        int option;
        do{
            System.out.println("""
                    -----------< Intership Finder >-----------
                    1. Create account
                    2. Login account
                    3. Exit
            """);
            System.out.println("**************************************");
            System.out.print("Choose option: ");
             option = sc.nextInt();
            System.out.println("**************************************");
                 
              switch(option){
                case 1: 
                  break;
                case 2: 
                  break;
                case 3:  
                   System.out.println("||=========({<Thank you>})=========||");
                   System.exit(0);
                  break;
              }
        }while(option <= 3);
    }
    }
}