import java.util.*;

public class Taller {

    private Map<Persona, Coche> reparaciones =

            new TreeMap<>(Comparator.comparing(Persona::getNumSeguridadSocial));

    public void registrarReparacion(Persona persona, Coche coche){
        reparaciones.putIfAbsent(persona,coche);
        //vincula persona con coche en el map. if absent solo si no existía. 1 persona por coche sin machacar el anterior
    }

    public Coche obtenerCoche(Persona persona){

        return reparaciones.get(persona);
    }

    public Set<Persona> obtenerClientes(){
        return reparaciones.keySet();
        //devuelve el conjunto de llaves. devolvemos set ya que no pueden tener elementos repetidos, va bien para devolver keys, al contrarior que los list
    }

    public Collection<Coche> obtenerCochesList(){

        return reparaciones.values();
    }

}