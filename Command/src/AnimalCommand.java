public class AnimalCommand implements ICommand{

    public void doICommand(String label) {
        System.out.println(label+":由我动物类处理器处理");
    }

}
