public abstract class MiembroGubernamental {
    private MiembroGubernamental sigMiembroGubernamental;//Atributo sig..., del tipo MiembroGubernamental.

    protected MiembroGubernamental() {// Para que se pueda acceder al método desde esta clase. PREGUNTAR?
    }


    public abstract void enviarDocumento(String documento, Integer tipo); //Un método que luego será sobreescrito, con 2 parámetros.


    public void setSigMiembroGubernamental(MiembroGubernamental miembro){ //Para designar quien es el siguiente miembro, por parámetro enviamos un miembro del tipo MiembroGubernamental.
        sigMiembroGubernamental = miembro;
    }
    public MiembroGubernamental getSigMiembroGubernamental(){ //Método que toma el miembro que sigue y retorna dicho miembro

        return sigMiembroGubernamental;
    }
}
