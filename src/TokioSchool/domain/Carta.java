package TokioSchool.domain;



public final class Carta {

    private final String numero;
    private final String palo;

    public Carta(String numero, String palo) {
        this.numero = numero;
        this.palo = palo;

    }
    public String getNumero(){
        return numero;
    }
    public String getPalo(){
        return palo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
        return false;
    }
        if (getClass() != obj.getClass()){
            return false;
        }
        final Carta other = (Carta) obj;
        if (this.numero != other.palo) {
        return false;
        }
        if (this.palo != other.palo){
        return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hast = 5;
        hast = 47 * hast+(this.numero != null ?
                this.numero.hashCode() : 0);
        hast = 47 * hast+(this.palo != null ?
                this.palo.hashCode() : 0);
        return hast;
    }
    @Override
    public String toString(){
        return numero + " " + palo;
    }
}
