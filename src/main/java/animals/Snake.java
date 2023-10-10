package animals;


public class Snake extends Pets{
    public Snake(String name, String type) {
        super(name, type);

    }

    @Override
    public void petSpeak() {
        System.out.println(getName() + "Says Hissss");
    }
}