public class MurderMysteryDriver{
    public static void main(String[]args){
        //getCorrelations (adj list), potentialSuspects, addClue, removeClue, Accuse (person has 3 attempts to guess it right), getShortestDrive  
        String[] methods = {"establishCorrelations", "identifyVictim" ,"potentialSuspects", "getShortestDrive", "addClue", "removeClue", "Accuse"};
        String[] options = {"Get a new set of people","Try another method ","Suspect's on the loose, and they shall remain that way for now (Quit)"};

        int optionsChoice =1;

        MurderMystery MurderSetting = new MurderMystery();

        System.out.println("Max: Welcome detective, we've been waiting for you!");
        System.out.println("Max: A person has been murdered here, and we need your help!");
        System.out.println("Max: Please, find who died and who did this!");

        do {
            System.out.println("You: I need the list of people behind this!");
            System.out.print("Enter the input file => ");
            String inputFile = StdIn.readLine();
            System.out.println("Max: Right here! Best of luck! *runs away*");

            do {
                StdOut.println("\nYou: Hmm..What can I do with this?");
                for (int i =0; i< methods.length;i++){
                    StdOut.printf("%d. %s\n", i+1, methods[i]);
                }
                StdOut.print("You: Let me try...");
                int choice = Integer.parseInt(StdIn.readLine());
                switch (choice){

                    //major issue: all messages print out here. Possible fix, create a MurderMystery.java file, have all the methods there.
                    //Would make most sense. However... Dijkstra..?

                    case 1:
                    //establishCorrelations
                    StdOut.println("You: Tsh... might as well see who's connected with who");
                    MurderSetting.establishCorrelations(inputFile);
                    

                    case 2:
                    //identifyVictim
                    //StdOut.println("You: Gotta pay a few trips and see who's not breathing...");

                    //StdOut.println("You: Okay, victim identified, that's one less hurdle...");

                    case 3:
                    //potentialSuspects
                    //StdOut.println("Aight... so who do we have as a suspect right now");
                    //make a method that, if some suspect does not have a matching clue, remove from that suspect list
                    //output the remaining list

                    case 4:
                    //getShortestDrive
                    //StdOut.println("They had to be quick about it... so... who did it in the shortest time?");
                    //Dijkstra's


                    case 5:
                    //addClue
                    //StdOut.println("Let me add the following as a clue...");
                    //there's probably going to be some sort of format of adding clues.
                    //Clues are probably going to be added either to an ArrayList or some sort of HashMap

                    case 6:
                    //removeClue

                    //method comes here, then the print out
                    //StdOut.println("Nevermind, scratch that, doesn't add up...");

                    case 7:
                    //Accuse
                    //StdOut.println("Welp, I found my murderer, you're going to jail!");

                    default:
                    //not a real choice
                    //StdOut.println("Max: *runs back* Please be serious detective! *runs away yet again*");

                }
                StdIn.resetFile();
                StdOut.println("What can I do now...");
                for (int i=0; i<3;i++){
                    StdOut.printf("%d. %s\n", i+1,options[i]);
                }
                StdOut.print("I'll go with...");
                optionsChoice = Integer.parseInt(StdIn.readLine());

            } while (optionsChoice==2);

        } while (optionsChoice==1);
    }
}