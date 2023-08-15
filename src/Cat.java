public class Cat extends Animal {
    public Cat(int age, int id) {
        super(age, id);

    }

    @Override
    public String toString() {
        return "Cat age:" + getAge ()+"id:" + getId();


    }
}
