
package mal2json;
import java.io.File;

public class Generate {
    
    public static void main(String[] args) {
        try {
            String malFile = args[0];
            AST ast = Parser.parse(new File(malFile));
            Lang lang = LangConverter.convert(ast);
            Generator.generate(lang, null);
        } catch(Exception e) {
            System.out.println("Error: No file provided, please provide an input mal specification");
            System.out.println("Example Usage:");
            System.out.println("java -jar mal2json.jar /path/to/spec.mal");
        }
    }

}
