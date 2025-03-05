public class Main {
    public static void main(String[] args) {

            SpartanII jefeMaestro = new SpartanII("Jonh", 100, "Rifle de asalto", 0);
            SpartanIII Spar = new SpartanIII("Pepe", 90, "Cuchara", 0);
            SpartanIV Sparta = new SpartanIV("El Beto", 100, "Pica Hielo", 0);

            jefeMaestro.mostrarInfo();
            jefeMaestro.usarManejoAvanzado();
            jefeMaestro.atacar("Covenant");
            jefeMaestro.recibirDano(50);
            jefeMaestro.recargarEscudo();

            System.out.println("-----------------------------------------------------------------------");

            Spar.mostrarInfo();
            Spar.camuflajeActivo();
            Spar.atacar("Fantom");
            Spar.recibirDano(50);
            Spar.recargarEscudo();

            System.out.println("-----------------------------------------------------------------------");

            Sparta.mostrarInfo();
            Sparta.propulsores();
            Sparta.atacar("Cocodrai");
            Sparta.recibirDano(50);
            Sparta.recargarEscudo();
    }
}