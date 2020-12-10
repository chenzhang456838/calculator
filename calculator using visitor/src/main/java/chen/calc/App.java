package chen.calc;

import org.antlr.runtime.CharStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.UserInterruptException;
import org.jline.terminal.TerminalBuilder;
import org.jline.terminal.Terminal;
import org.jline.reader.EndOfFileException;

public class App 
{
    public static void main (String[] args) throws Exception {
   
        LineReader read = LineReaderBuilder.builder().build();
        String equation = "calculator>";
        while (read != null) {
            String line = null;
            try {
                line = read.readLine(equation);
                calculatorParser parser = createParser(line);
                ParseTree ptree = parser.expression();
                visitor visit = new visitor();
                Double result = visit.visit(ptree);
                if (result != null) 
                System.out.println(result);
            } catch (UserInterruptException e) {
                return;
            } catch (EndOfFileException e) {
                return;
            }
        }    
        
      
    }
    
    static calculatorParser createParser(String expression) {
        CodePointCharStream stream = CharStreams.fromString(expression);
        calculatorLexer lexer = new calculatorLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new calculatorParser(tokens);
    }
    
}