public class FirstCommand implements ICommand{

    public void doICommand(String label) {
        System.out.println(label+":由我first处理器处理");
    }

}

