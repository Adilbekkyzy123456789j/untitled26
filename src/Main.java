import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import static jdk.internal.icu.text.UCharacterIterator.getInstance;

public class Main {

    public static void main(String[] args) {

        // 50 ашык мышык жана ит тузулду.Алар LinkedList ке салынды
        LinkedList<Animal> animals = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            animals.add(new Dog(i + 1, random.nextInt(20)));
            animals.add(new Cat(i + 1, random.nextInt(10)));
        }
        // 5 чи турган мышыктар очурулду
        int count = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat) {
                count++;
                if (count == 5) {
                    animals.remove(animals.get(i));
                    count = 0;
                }
                // Ар бир иттен кийин бирден чычкан кошулду
                count = 0;
                int mouseID = 1;
                for (int j = 0; j < animals.size(); j++) {
                    if (animals.get(i) instanceof Dog) {
                        count++;
                        if (count == 3) {
                            animals.add(i + 1, new Mouse(mouseID, random.nextInt(5)));
                            mouseID++;
                            count = 0;

                        }

                        for (int k = 0; k < animals.size(); k++) {
                            if (animals.get(k) instanceof Cat) {
                                if (animals.get(k + 1) instanceof Mouse || animals.get(k - 1) instanceof Mouse) {
                                    animals.add((Cat) animals.get(k));
                                    animals.remove(animals.get(k));

                                }

                                for (Animal animal : animals)
                                    System.out.println(animal);

                            }
                        }
                    }
                }
            }
        }
    }
}

