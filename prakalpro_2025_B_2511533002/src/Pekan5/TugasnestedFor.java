package Pekan5;

public class TugasnestedFor {

	public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            
            if (i == 0 || i == 9) {
                System.out.print("#");
                
                for (int j = 0; j < 16; j++) {
                    System.out.print("=");
                }
                
                System.out.println("#"); 
            
            } else {
               
                switch (i) {
                    case 1:
                        System.out.println("|      <><>      |");
                        break;
                    case 2:
                        System.out.println("|    <>....<>    |");
                        break;
                    case 3:
                        System.out.println("|  <>........<>  |");
                        break;
                    case 4:
                        System.out.println("|<>............<>|");
                        break;
                    case 5:
                        System.out.println("|<>............<>|");
                        break;
                    case 6:
                        System.out.println("|  <>........<>  |");
                        break;
                    case 7:
                        System.out.println("|    <>....<>    |");
                        break;
                    case 8:
                        System.out.println("|      <><>      |");
                        break;
                }
            }
        }
    }
}
