import java.util.Scanner;

/*
Dear fellow programmer opening this chaos
I was js bored and having fun
cheers mate.
*/

class MadLibs {

       private static final Scanner sc = new Scanner(System.in);

       private static String requestInput(String inputType) {
              System.out.printf("Enter %s: ", inputType);
              String input = sc.nextLine().trim();

              return input.isEmpty() ? requestInput(inputType) : input;
       }

       public static void main(String[] args) {

              // THE WORDS

              String place = requestInput("a place");
              String adjective1 = requestInput("an adjective");
              String noun = requestInput("an noun");
              String object = requestInput("an object");
              String strangePhrase = requestInput("a strange phrase");
              String verb1 = requestInput("a verb");
              String adjective2 = requestInput("an adjective");
              String adjective3 = requestInput("an adjective");
              String animal = requestInput("an animal");
              String noun2 = requestInput("a noun");
              String adjective4 = requestInput("an adjective");
              String noun3 = requestInput("a noun");
              String verb2 = requestInput("a verb");
              String verb3 = requestInput("a verb");
              String adjective5 = requestInput("an adjective");
              String noun4 = requestInput("a noun");

              // THE STORY NO 1

              System.out.printf(
                      """
                      Last night, I was at %s when i noticed a %s %s sitting near the %s
                      It looked at me and whispered %s
                      Not sure what to do I decided to %s but the ground suddenly felt %s beneath my feet.
                      From the shadows, a %s %s appeared carrying a %s in its mouth.
                      Before i could react, a stranger wearing %s clothes approached and said "hand over the %s or prepare to %s"
                      i didn't know whether to laugh, run or %s
                      By the end of the night, all I had left was a %s memory and a %s that still didn't make sense.
                      """
            , place, adjective1, noun, object, strangePhrase, verb1, adjective2, adjective3, animal, noun2, adjective4, noun3, verb2, verb3, adjective5, noun4);
              sc.close();
       }
}