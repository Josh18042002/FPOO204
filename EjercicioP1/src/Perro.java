import javax.swing.*;

public class Perro  extends Animal{

    @Override
    public void HacerSonido() {
        JOptionPane.showInputDialog("El perro esta ladrando");
    }
}
