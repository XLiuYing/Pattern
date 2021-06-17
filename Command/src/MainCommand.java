
import java.util.HashMap;
import java.util.Map;
public class MainCommand{
    public static final String FISH = "fish";
    public static final String ANIMAL = "animal";
    public static final String INSECT = "insect";
    public static final String PERSON = "person";
    public static final String FIRST = "first";
    private Map<String,ICommand> Commands = new HashMap<String,ICommand>();
    public MainCommand(){
        Commands.put(FISH, new FishCommand());
        Commands.put(ANIMAL, new AnimalCommand());
        Commands.put(INSECT, new InsectCommand());
        Commands.put(PERSON, new PersonCommand());
        Commands.put(FIRST, new FirstCommand());

    }

    public void doICommand(String label) {
        ICommand ICommand = Commands.get(label);
        if(ICommand!=null){
            ICommand.doICommand(label);
        }
    }

}