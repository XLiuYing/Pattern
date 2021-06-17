public class CommandTest {
    public static void main(String[] args) {
        System.out.println("我这里有一个生物需要处理");
        String thing1 = MainCommand.INSECT;//昆虫
        String thing2 = MainCommand.ANIMAL;//动物
        new MainCommand().doICommand(thing1);
        new MainCommand().doICommand(thing2);
    }
}
