import java.util.*;

import java.util.stream.Collectors;

public class RegistroVehiculos {

    private Set<Coche> coches = new HashSet<>();

    public void registrarVehiculo(Coche coche){

    }

// Optional&lt;Coche&gt; es una nueva funcionalidad de Java 8 para evitar trabajar con null

// Lo puedes omitir si trabajas con Java 7

    public Optional<Coche> obtenerVehiculo(String matricula){

    }

    public void eliminarVehiculo(String matricula){
    coches.removeIf(coche -> coche.getMatricula().equalsIgnoreCase(matricula));
    }

    public Optional<Coche>  obtenerVehiculoPrecioMax(){
        //comparador de coches en funcion del coste. stream convierte estructura de datos en flujo de objetos
        return coches.stream().max(Comparator.comparing(Coche::getCoste));
    }

    public List<Coche>  obtenerVehiculosMarca(String marca){
        return coches.stream().filter(coche -> coche.getMarca().equalsIgnoreCase(marca)).collect(Collectors.toList());
    }

    public List<Coche>  obtenerTodos() {
        List<Coche> cocheList = new ArrayList<>(coches);
        return cocheList;
    }
}