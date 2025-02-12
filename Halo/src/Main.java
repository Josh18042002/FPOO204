public class Main {


    public static void main(String[] args) {

        //creamos Objeto = Instanciar objeto
        Spartan jefeMaestro = new Spartan();
        Spartan reach= new Spartan();

        //asignamos los atributos del objeto
        jefeMaestro.nombre = "Jonh 117";
        jefeMaestro.salud = 100;
        jefeMaestro.escudo = 90;
        jefeMaestro.armaPrincipal = "Rifle de asalto";

        //usar sus metodos de jefe maestro
        jefeMaestro.mostrarInfo();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recargaArma(65);
        jefeMaestro.correr(true);


        //Segundo Objeto Reach
        reach.nombre = "Emile";
        reach.salud = 0;
        reach.escudo = 0;
        reach.armaPrincipal = "Aguijoneador";

        //
        reach.mostrarInfo();
        reach.atacar("Grunt");
        reach.recargaArma(10);
        reach.correr(false);



    }


}//llave de la clase