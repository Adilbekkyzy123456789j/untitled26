public class Dog extends Animal {
    public Dog(int age, int id) {
        super(age, id);
    }

    @Override
    public String toString() {
        return "Dog age" + getAge() +"id" + getId();


    }
}