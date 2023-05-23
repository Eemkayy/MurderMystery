import java.util.ArrayList;
import java.util.HashMap;

public class MurderMystery {
    private HashMap<Person,ArrayList<Person>> correlationList;
    private boolean victimIdentified;
    private HashMap<Person,ArrayList<String>> potentialSuspects;
    private HashMap<Person, Double> shortestDrive;
    private ArrayList<String> clues;

    public MurderMystery(){
        correlationList = null;
        victimIdentified = false;
        potentialSuspects = null;
        shortestDrive = null;
        clues = null;
    }

    public void establishCorrelations(String inputFile){
        StdIn.setFile(inputFile);
        correlationList = new HashMap<>();
        Integer peopleAmount = StdIn.readInt();
        for (int i=0; i< peopleAmount;i++){
            String name = StdIn.readString();
            String lastName = StdIn.readString();
            Person newPerson = new Person(name, lastName);
            correlationList.put(newPerson, null);
        }
        Integer correlations = StdIn.readInt();
        for (int i=0; i< correlations;i++){
            String name = StdIn.readString();
            String lastName = StdIn.readString();
            String fullName = name + " " + lastName;
            String name2 = StdIn.readString();
            String lastName2 = StdIn.readString();
            Person valuePerson = new Person(name2,lastName2);

            for (Person key : correlationList.keySet()){
                if (key.getFullName().equals(fullName)){
                    if (correlationList.get(key)==null){
                        ArrayList<Person> newList = new ArrayList<>();
                        newList.add(valuePerson);
                        correlationList.put(key, newList);
                    } else {
                        ArrayList<Person> list = correlationList.get(key);
                        list.add(valuePerson);
                        correlationList.put(key, list);
                    }
                }
            }
        }
        printSpreadSheet();
    }




    public void printSpreadSheet(){
        //prints the correlationList
        for (Person persona : correlationList.keySet()){
            StdOut.print(persona.getFullName() + ":");
            if (correlationList.get(persona)!=null){
                for (int i=0; i< correlationList.get(persona).size();i++){
                    StdOut.print(" "+ correlationList.get(persona).get(i).getFullName());
                }
            }
            StdOut.println();
        }
        StdOut.println();
    }

}
