import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Gato());
        animales.add(new Perro());

        for (Animal animal: animales){
            animal.HacerSonido();
        }
    }
}