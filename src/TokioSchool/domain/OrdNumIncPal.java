package TokioSchool.domain;

import java.util.List;

public class OrdNumIncPal extends AlgoritmoOrdenacion {
    @Override
    public void Ordenar(List listaCartas) {
        // Algoritmo de ordenaci�n
        for (int i = 0; i <listaCartas.size() ; i++) {
            Carta iElem = (Carta)listaCartas.get(i);
            for (int j = 0; j < i; j++) {
                Carta jElem = (Carta)listaCartas.get(j);
                if (comparadorCarta(jElem,iElem) > 0){

                    listaCartas.remove(i);
                    listaCartas.add(j,iElem);
                    break;
                }
            }

        }
    }

    public static int comparadorCarta(Carta c1, Carta c2) {
        int comp = c1.getNumero().compareTo(c2.getNumero());
        if (comp == 0) {
            return c1.getPalo().compareTo(c2.getPalo());
        }
        return comp;
    }
}