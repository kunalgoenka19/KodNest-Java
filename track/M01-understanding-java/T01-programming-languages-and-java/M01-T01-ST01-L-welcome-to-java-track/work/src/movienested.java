public class movienested{
    public static void main(String[] args){
        boolean ticketPresent = true ;
        int age = 18;

        if (ticketPresent == true){
            if(age >= 18){
            System.out.println("Watch movie");
            }
            else {
                System.out.println("Too young");
            }
        } else {
            System.out.println("buy ticket");
        }
    }
}