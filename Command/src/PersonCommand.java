public class PersonCommand implements ICommand{

    public void doICommand(String label) {
        System.out.println(label+":由我人类处理器处理");
    }

}
