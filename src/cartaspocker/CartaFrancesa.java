/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cartaspocker;

import java.util.Random;

/**
 *
 * @author Maria
 */
public class CartaFrancesa {

    public static final int TREBOLES = 0;
    public static final int DIAMANTES = 1;
    public static final int CORAZONES = 2;
    public static final int PICAS = 3;
    public static final int COMODIN = 4;
    public int numCarta;
    public int palo;

    public void numCarta() {
    }

    public int getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(int carta) {
        this.numCarta = carta;
        Random cartaAleatoria = new Random();
        numCarta = cartaAleatoria.nextInt(12);

        switch (numCarta) {
            case 0:
                numCarta = 1;
                break;
            case 1:
                numCarta = 2;
                break;
            case 2:
                numCarta = 3;
                break;
            case 3:
                numCarta = 4;
                break;
            case 4:
                numCarta = 5;
                break;
            case 5:
                numCarta = 6;
                break;
            case 6:
                numCarta = 7;
                break;
            case 7:
                numCarta = 8;
                break;
            case 8:
                numCarta = 9;
                break;
            case 9:
                numCarta = 10;
                break;
            case 10:
                numCarta = 'J';
                break;
            case 11:
                numCarta = 'Q';
                break;
            case 12:
                numCarta = 'K';
                break;
        }
    }

    public int getPalo() {
        return palo;
    }

    public void setPalo(int palo) {
        this.palo = palo;
    }

    public CartaFrancesa(int carta, int palo) {
        this.numCarta = carta;
        this.palo = palo;
    }

    public String toString() {
        if (palo == 0) {
            System.out.println(numCarta + "de Treboles");

        } else {
            if (palo == 1) {
                System.out.println(numCarta + "de Diamantes");
            } else {
                if (palo == 2) {
                    System.out.println(numCarta + "de Corazones");
                } else {
                    if (palo == 3) {
                        System.out.println(numCarta + "de Picas");
                    }
                }
            }

            
        }
        return null;
    }
    
    

    public String toCodigo() {
        if (palo == 0) {
            System.out.println(numCarta + "T");

        } else {
            if (palo == 1) {
                System.out.println(numCarta + "D");
            } else {
                if (palo == 2) {
                    System.out.println(numCarta + "C");
                } else {
                    if (palo == 3) {
                        System.out.println(numCarta + "P");
                    
                }
            }
        }
        }
        return null;
    }
            
    

