public class App {
    public static void main(String[] args) throws Exception {

        for (int i = 5; i != 0; i--) {
         
         if (i == 4) {
                System.out.println("WAIT! Need a break!");
                break;
            }
        
            System.out.println("Anne");
        
        }
        int surnameCount= 5;

        do {
            System.out.println("Reyes");
            surnameCount--;
        } while (surnameCount != 0);
        
        int nicknameCount = 5;
          
        while (nicknameCount != 0) {
            
            nicknameCount--;
            if (nicknameCount == 2) {
                System.out.println("SKIP THIS GO TO THE NEXT LOOP");
                continue;
            }
            
            System.out.println("Jhaaaaa"); 
            
        }
    }
}
