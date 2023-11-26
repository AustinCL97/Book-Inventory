package Menu;


import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Menu {

    private PrintWriter out;
    private Scanner in;

    public Menu(InputStream input, OutputStream output) {
        this.out = new PrintWriter(output);
        this.in = new Scanner(input);
    }

    public Object getChoiceFromOptions(Object[] options){

        Object choice = null;
        while(choice == null){
            displayMenuOptions(options);
            choice = getChoiceFromUserInput(options);
        }

        return choice;

    }

    private Object getChoiceFromUserInput(Object[] options){
        Object choice = null;
        String userInput = in.nextLine();
        try {
            int selectedOption = Integer.parseInt(userInput);
            if(selectedOption > 0 && selectedOption <= options.length){
                choice = options[selectedOption - 1];
            }
        } catch (NumberFormatException ex){
            System.out.println("Number Format Exception in Menu.java");
        }
        if(choice == null){
            System.out.println("*****" + userInput + " is not a valid input" + "*****");
        }

        return choice;
    }

    private void displayMenuOptions(Object[] options){
        System.out.println();
        for(int i = 0; i < options.length; i++){
            int optionNum = i + 1;
            if(optionNum < 4) {
                System.out.println(optionNum + ") " + options[i]);
            }
        }

        System.out.println("Please Choose an option >>>");
        out.flush();
    }


}
