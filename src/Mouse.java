public class Mouse extends Animal {
    public Mouse() {
    }

    public Mouse(int age, int id) {
        super(age, id);
    }

    @Override
    public String toString() {
        return "Mouse age:" + getAge()+"id:"+ getId();


    }
}