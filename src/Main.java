import java.util.Scanner;

class MadLibs{
        public static void main(String[] args) {

                // MAD LIBS

                Scanner scanner = new Scanner(System.in);
         String place,
                 adjective1,
                 noun,
                 object,
                 strangePhrase,
                 verb1,
                 adjective2,
                 adjective3,
                 animal,
                 noun2,
                 adjective4,
                 noun3,
                 verb2,
                 verb3,
                 adjective5,
                 noun4;

                System.out.println("Enter a place: ");
                place = scanner.nextLine();
                System.out.println("Enter an adjective: ");
                adjective1= scanner.nextLine();
                System.out.println("Enter a noun: ");
                noun= scanner.nextLine();
                System.out.println("Enter an object: ");
                object= scanner.nextLine();
                System.out.println("Enter a strange phrase: ");
                strangePhrase= scanner.nextLine();
                System.out.println("Enter a verb: ");
                verb1= scanner.nextLine();
                System.out.println("Enter an adjective: ");
                adjective2= scanner.nextLine();
                System.out.println("Enter an adjective: ");
                adjective3= scanner.nextLine();
                System.out.println("Enter an animal: ");
                animal= scanner.nextLine();
                System.out.println("Enter a noun: ");
                noun2= scanner.nextLine();
                System.out.println("Enter an adjective: ");
                adjective4= scanner.nextLine();
                System.out.println("Enter a noun: ");
                noun3= scanner.nextLine();
                System.out.println("Enter a verb: ");
                verb2= scanner.nextLine();
                System.out.println("Enter a verb: ");
                verb3= scanner.nextLine();
                System.out.println("Enter an adjective: ");
                adjective5= scanner.nextLine();
                System.out.println("Enter a noun: ");
                noun4= scanner.nextLine();

                System.out.println("Last night, I was through " + place + " when i noticed a " + adjective1 + " " + noun + " sitting near the " + object);
                System.out.println("It looked at me and whispered " + strangePhrase);
                System.out.println("Not sure what to do, I decided to " + verb1 + " but the ground suddenly felt " + adjective2 + " beneath my feet.");
                System.out.println("From the shadows, a " + adjective3 + " " + animal + " appeared, carrying a " + noun2 + " in it's mouth.");
                System.out.println("Before I could react, a stranger wearing a " + adjective4 + " clothes approached and said \"Hand over the " + noun3 + " or prepare to " + verb2 + "\"");
                System.out.println("I didn't know whether to laugh, run or " + verb3);
                System.out.println("By the end of the night, all i had left was a " + adjective5 + " memory and a " + noun4 + " that still didn't make sense");
scanner.close();
        }
}