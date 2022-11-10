package baraja;

import Enumeradas.ColoresBajaraUno;
import Enumeradas.EfectosBarajaUno;
/**
 * @Author: Andrés Fernández Pereira
 */
public class BarajaUno extends Baraja<CartaUno>  {
  private boolean sentido; // true = sentido agujas del reloj, false = sentido contrario agujas del reloj
  private CartaUno ultimaCarta;
  private ColoresBajaraUno colorActual;

  public BarajaUno() {
      this.numCartas = 108;
      this.cartasPorPalo = 13;
      this.sentido = true;

      this.crearBaraja();
      super.barajar();;

      this.ultimaCarta = super.siguienteCarta(true);
      this.actualizarColor();
  }
  @Override
    public void crearBaraja() {

      ColoresBajaraUno[] colores = ColoresBajaraUno.values();

      for (ColoresBajaraUno color : colores) {
          if (color !=ColoresBajaraUno.NEGRO) {

              for (int i = 0; i < this.cartasPorPalo; i++) {
                  if (i  > 9) {
                      switch (i) {
                          case 10:
                              this.cartas.push(new CartaUno(color, EfectosBarajaUno.MASDOS));
                              break;
                          case 11:
                              this.cartas.push(new CartaUno(color, EfectosBarajaUno.SALTO));
                              break;
                          case 12:
                              this.cartas.push(new CartaUno(color, EfectosBarajaUno.REVERSO));
                              break;
                      }

                  }else {
                      this.cartas.push(new CartaUno(i, color));
                  }
              }

              for (int i = 0; i <4; i++) {
                  this.cartas.push(new CartaUno(color, EfectosBarajaUno.MASCUATRO));
                  this.cartas.push(new CartaUno(color, EfectosBarajaUno.CAMBIOCOLOR));
              }

          }

      }

  }

  public boolean isSentido() {
      return sentido;
  }

  public void cambiarSentido() {
      this.sentido = !this.sentido;
  }

  public CartaUno getUltimaCarta() {
      return ultimaCarta;
  }

  public void setUltimaCarta(CartaUno ultimaCarta) {
      this.ultimaCarta = ultimaCarta;
  }

  public ColoresBajaraUno getColorActual() {
      return colorActual;
  }

  public void setColorActual(ColoresBajaraUno colorActual) {
      this.colorActual = colorActual;
  }
  public void actualizarColor() {
      this.colorActual = this.ultimaCarta.getPalo();
  }

    }





