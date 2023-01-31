package TokioSchool.domain;

import java.util.List;

public class OrdPalNumInc extends AlgoritmoOrdenacion {
    @Override
    public void Ordenar(List listaCartas) {
        for (int i = 0; i <listaCartas.size() ; i++) {
            Carta iElem = (Carta)listaCartas.get(i);
            for (int j = 0; j < i; j++) {
                Carta jElem = (Carta)listaCartas.get(j);
                if (comparadorCartas(jElem,iElem) > 0){
                    Carta aux = (Carta)listaCartas.remove(i);
                    listaCartas.add(j,aux);

                    break;
                }
            }

        }
    }
    public static int comparadorCartas(Carta c1, Carta c2){
        int comp = c1.getPalo().compareTo(c2.getPalo());
        if(comp == 0) {
            return c1.getNumero().compareTo(c2.getNumero());
        }
        return comp;
    }
}
