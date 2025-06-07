import java.util.Scanner;
class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int myNo= (int)(Math.random()*100);
        
    do {
        System.out.println("Guess the number between 1 to 100");
        int guess = sc.nextInt();
        if (guess==myNo){
            System.out.println("You guessed it");
            break;
        }
        else if(guess>myNo){
            System.out.println("Your guess is higher than the number");
        }
        else{
            System.out.println("Your guess is lower than the number");
        }

    } while(myNo>=0);
    System.out.println("My no was:");
    System.out.println(myNo);
}
}