public class Presidente extends MiembroGubernamental {//Extiende de la clase MiembroGubernamental
    @Override
    public void enviarDocumento(String documento, Integer tipo) {
        if (tipo == 1 || tipo == 2 ||  tipo == 3)
            System.out.println("Yo me encargo de leerlo. Presidente");
         if (getSigMiembroGubernamental()!= null) { //Si al obtener el siguiente miembro es diferente a nulo, que lo tome y envie el documento
            getSigMiembroGubernamental().enviarDocumento(documento, tipo);
        }
    }
}
