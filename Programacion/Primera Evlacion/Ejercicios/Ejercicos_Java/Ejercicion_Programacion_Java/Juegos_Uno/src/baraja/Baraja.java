package baraja;
import java.util.ArrayList;
import pila.PilaDinamica;

/**
 * @Author: Andrés Fernández Pereira
 */

// Clase baraja
//parametro <T>

   public abstract class Baraja<T extends Carta> {

       //Atributos
    protected PilaDinamica<T> cartas;
    protected PilaDinamica<T> cartasMonton;
    protected int numCartas;
    protected int cartasPorPalo;

    public Baraja() {
        this.cartas = new PilaDinamica<>();
        this.cartasMonton = new PilaDinamica<>();
    }

    //Metodo abstracto CrearBaraja
    public abstract void crearBaraja();

    //Barja todas las cartas
    public void barajar() {
        int posAleatoria = 0;
        T carta;

        while (!this.cartasMonton.isEmpy()) {
            this.cartas.push(this.cartasMonton.pop());

        }
        ArrayList<T> cartasBarajar = new ArrayList<>();

        while (!this.cartas.isEmpy()) {
            cartasBarajar.add(this.cartas.pop());

        }
        for (int i = 0; i < cartasBarajar.size(); i++) {

            do {
                posAleatoria = Metodos.generaNumeroEnteroAleatorio(0, cartasBarajar.size() -1);
                carta = cartasBarajar.get(posAleatoria);

            }while (carta == null);

            this.cartas.push(carta);
            cartasBarajar.set(posAleatoria, null);

        }
    }

    //Devuelve la siguiente carta
    //Parametro monton
    //return carta del arreglo

    public T siguienteCarta(boolean monton) {

        T carta = null;

        if (!this.cartas.isEmpy()) {
            carta = cartas.pop();
            if (monton) {
                this.cartasMonton.push(carta);

            }

        }
        return carta;
    }

    //Devuelve un numero de cartas. Controla si hay mas acrtas
    //de las que piden
    //Parametro numCartas
    //Parametro monton
    //return

    public ArrayList<T> darCartas(int numCartas, boolean monton) {

        if (numCartas > numCartas || cartasDisponible() < numCartas) {
            return null;

        }else {
            ArrayList<T> cartasDar = new ArrayList<>();

            //recorro el array que acabo de crear para rellenarlo
            for (int i = 0; i < numCartas; i++) {
                cartasDar.add(siguienteCarta(monton)); //uso el metodo anterior
            }

            //Lo devuelvo
            return cartasDar;
        }
    }

    //Indica el numero de cartas que hay disponibles
    public int cartasDisponible() {
        return this.cartas.size();
    }
    //Muestro las cartas que han salido
    public void cartasMonton() {

        if (cartasDisponible() == numCartas) {
            System.out.println("No se ha sacado ninguna carta");
        }else {
            System.out.println(this.cartasMonton.toString());
        }
    }

    //Muestro las cartas que aun no ha salido
    public void mostrarBarja() {

        if (cartasDisponible() == 0) {
            System.out.println("No hay cartas que mostrar");
        }else {
            System.out.println(this.cartas.toString());
        }
    }

    public void agregarCartasMonton(T carta) {
        this.cartasMonton.push(carta);
    }
   }

