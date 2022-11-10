package Enumeradas;

/**
 * @Author: Andrés Fernández Pereira
 */
public enum EfectosBarajaUno {
    MASDOS(20),
    MASCUATRO(50),
    SALTO(20),
    REVERSO(20),
    CAMBIOCOLOR(50);

    private int puntos;

    private EfectosBarajaUno(int puntos) {
        this.puntos = puntos;
    }

    public int getPuntos() {
        return this.puntos;
    }
}
