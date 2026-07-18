package String;

// remove the path information from a file path and print only the file name 

// C:\JavaProgram\demo1.txt -> demo1.txt 

public class RemovePath {
    public static void main(String[] args) {

        String str = "C:\\JavaProgram\\demo1.txt" ;

        String[] result = str.split("\\\\") ; 

        System.out.println(result[result.length-1]);
        
    }
}
