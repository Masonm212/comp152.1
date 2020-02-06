import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class mmatiasProject {
    public static void main (String[] args)throws IOException{
        //part 1 reading into the list
        var fileName = "students.txt";
        String all_names = Files.readString(Paths.get(fileName));
        String[] name_list = all_names.split("\r\n");

        var randGen = new Random();
        var numStudents = name_list.length;
        var randomNumber = randGen.nextInt(numStudents);
        var studentsName = name_list[randomNumber];
        System.out.println( "Congrats "+studentsName+" you get to answer the next question.");
    }
}
