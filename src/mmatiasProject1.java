import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Scanner;


public class mmatiasProject1 {
    public static void main (String[] args)throws IOException {
        System.out.println("What student would you like to look up?");
        var reader = new Scanner(System.in);
        var user_response  = reader.nextLine();
        var result = 0;
        if (user_response.equals("mason")) {
            var studentFile = "mason.txt";
            String studentGrades = Files.readString(Paths.get(studentFile));
            String[] grade_list = studentGrades.split("\r\n");
            var numGrades = grade_list.length;
            var keepAdding = 0;
            System.out.print(grade_list);
            while (keepAdding < numGrades) {
                result = Integer.parseInt(grade_list[numGrades - 1 - keepAdding])+Integer.parseInt(grade_list[numGrades - 2 - keepAdding] );
                keepAdding = keepAdding + 1;
            }
                int gpa = result / numGrades;
                System.out.print("Your student's GPA is "+gpa);
        }
        }
}
