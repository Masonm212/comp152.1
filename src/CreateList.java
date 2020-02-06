import java.util.ArrayList;
import java.util.Scanner;


public class CreateList {
    public static void main(String[] args){
        var class_names = new ArrayList<String>();
        var reader = new Scanner(System.in);
        var user_response  = "";
        while (!user_response.toUpperCase().equals("DONE")){
            System.out.println("Enter the next student, or type done to finish:");
            user_response = reader.nextLine();
            if (user_response.toUpperCase().equals("DONE"))
                break;
            class_names.add(user_response);
        }
        for (String name: class_names){
            System.out.println(name);
        }
    }
}
