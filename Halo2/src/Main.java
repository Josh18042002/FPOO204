public class Main {
    public static void main(String[] args) {

        //creamos Objeto = Instanciar objeto
        Spartan jefeMaestro = new Spartan("John 117", 100, 90, "Rifle de Asalto");
        Spartan reach= new Spartan("Emile", 0, 0, "Aguijoneador");

        //asignamos los atributos del objeto
        jefeMaestro.setNombre("John 117");
        jefeMaestro.setSalud(100);
        jefeMaestro.setEscudo(90);
        jefeMaestro.setArmaPrincipal("Rifle de Asalto");

        //usar sus metodos de jefe maestro
        jefeMaestro.mostrarInfo();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recargaArma(65);
        jefeMaestro.correr(true);


        //Segundo Objeto Reach
        reach.setNombre("Emile");
        reach.setSalud(0);
        reach.setEscudo(0);
        reach.setArmaPrincipal("Aguijoneador");

        //
        reach.mostrarInfo();
        reach.atacar("Grunt");
        reach.recargaArma(10);
        reach.correr(false);

        jefeMaestro.setNombre("Joshus Moises");
        jefeMaestro.mostrarInfo();
        System.out.println(jefeMaestro.getNombre());
    }


}//llave de la clase