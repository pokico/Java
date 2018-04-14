package Program;
import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class kalkulator{
    public static void main(String[] args) throws ScriptException {
while(true){
try{
System.out.println("Podaj działanie");
Scanner skaner= new Scanner(System.in);
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("js");
    String wyrazenie = skaner.nextLine();
    Object result = engine.eval(wyrazenie);
System.out.println(result);
}
catch (ScriptException | NullPointerException e) {
            System.out.println("Blad w podanym wyrazeniu");
        }
}
}
}