package JSONParsing;

import SBT.ASTPrinter;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class JSONWriter {
    public static void main(String[] args) throws IOException {
        ASTPrinter astp = new ASTPrinter();

        // Read the data file
        File data = new File("data/sample.txt");
        BufferedReader br = new BufferedReader(new FileReader(data));
        String line;
        while((line = br.readLine()) != null){
            // Do SBT Stuff
            // TODO after reading code segment, get SBT and Comments, and write code, SBT, and comments to new JSON file

//            MethodDeclaration method = StaticJavaParser.parseMethodDeclaration("""
//                // This is the method header
//                    public String extractFor(Integer id){
//                        LOG.debug("Extracting method with ID:{}", id);  // This is inline with LOG.debug
//                       \s
//                        // This is above return statement
//                        return requests.remove(id);
//                    }""");
//            System.out.println(astp.output(method));
//            List<String> comments = astp.getComments(method);
//            for(String s: comments)
//                System.out.println(s);
        }

    }
}
