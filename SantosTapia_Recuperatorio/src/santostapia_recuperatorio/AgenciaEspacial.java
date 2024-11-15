
package santostapia_recuperatorio;

import java.util.ArrayList;
import java.util.List;

public class AgenciaEspacial {
    private List<Nave> naves = new ArrayList<>();


    public void agregarNave(Nave nave){
        if(nave == null){
            throw new NullPointerException("Hay un null en lugar de una nave");
        }
        for (Nave naveRepe : naves) {
            if (naveRepe.getNombre().equals(nave.getNombre()) && naveRepe.getAnioLanzamiento()==(nave.getAnioLanzamiento())) {
                throw new NaveRepetidaException();
            }
        }
        naves.add(nave);
    }

    public void mostrarNaves() {
        if(naves.isEmpty()){
            System.out.println("Lista de naves vacia");
        }
        for (Nave nave : naves) {
            System.out.println(nave.toString());
        }
    }

    public void iniciarExploracion() {
        for (Nave nave : naves) {
            if (nave instanceof Explorable) {
                System.out.println("Iniciando exploracion con: " + nave.getNombre());
            } else {
                System.out.println("La nave " + nave.getNombre() + " no puede realizar la exploracion");
            }
        }
    }
}
