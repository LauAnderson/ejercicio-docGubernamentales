public class Main {
    public static void main(String[] args) {
        MiembroGubernamental miembro1 = new Diputado(); //Instanciación de los 3 miembros.
        MiembroGubernamental miembro2 = new Ministro();
        MiembroGubernamental miembro3 = new Presidente();

        miembro1.setSigMiembroGubernamental(miembro2); // Generamos una cadena entre los miembros para enviarse la documentación.
        miembro2.setSigMiembroGubernamental(miembro3);


        miembro1.enviarDocumento("Hola soy un documento", 2);//Prueba, designamos un miembro y enviamos la documentación con su tipo.
    }
}
