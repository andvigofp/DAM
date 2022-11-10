package baraja;

import Enumeradas.ColoresBajaraUno;
import Enumeradas.EfectosBarajaUno;

/**
 * @Author: Andrés Fernández Pereira
 */
public class CartaUno extends Carta<ColoresBajaraUno> {

    private EfectosBarajaUno efecto;

    public CartaUno(int numero, ColoresBajaraUno color) {
        super(numero, color);
    }

    public CartaUno() {
    }

    public CartaUno(ColoresBajaraUno color, EfectosBarajaUno efecto) {
        super (-1, color);
        this.efecto = efecto;
    }

    public EfectosBarajaUno getEfecto() {
        return efecto;
    }

    public boolean isEspecial() {
        return this.efecto !=null;
    }

    public boolean compatible(CartaUno c) {
        return this.getPalo() == ColoresBajaraUno.NEGRO
                || this.getPalo() == c.getPalo()
                || (this.getNumero() == c.getNumero() && !this.isEspecial() && !c.isEspecial())
                || (this.isEspecial() && c.isEspecial() && this.efecto == c.efecto);
    }

    @Override
    public String toString() {

        String estado = "";

        if (this.isEspecial()) {
            switch (this.efecto) {
                case MASDOS:
                    estado = "+2 " + palo;
                    break;
                case MASCUATRO:
                    estado = "+4";
                    break;
                case SALTO:
                    estado = "Salto turno "+palo;
                    break;
                case REVERSO:
                     estado = "reverso "+palo;
                     break;
                case CAMBIOCOLOR:
                    estado = "Cambio color";
                    break;
            }
        } else {
            estado = numero + " " +palo;
        }
        return estado;
    }
}
