import java.util.Scanner;

public class Tablero {
        Scanner lector = new Scanner(System.in);
        private int tamano;
        private char simboloJugador1;
        private char simboloJuegador2;
        private boolean turno1;
        private char[][] matriz;
        private int[] cantidadFichas;

        public Tablero(int tamano) {
            this.tamano = 6;
            this.simboloJugador1 = 'X';
            this.simboloJuegador2 = 'Y';
            this.turno1 = true;
            this.matriz = new char[this.tamano][this.tamano];
            this.cantidadFichas = new int[this.tamano];
        }

        public int getTamano() {
            return tamano;
        }

        public char getSimboloJugador1() {
            return simboloJugador1;
        }

        public char getSimboloJuegador2() {
            return simboloJuegador2;
        }

        public char[][] getMatriz() {
            return matriz;
        }

        public int[] getCantidadFichas() {
            return cantidadFichas;
        }

        public void setSimboloJugador1(char simboloJugador1) {
            this.simboloJugador1 = simboloJugador1;
        }

        public void setSimboloJuegador2(char simboloJuegador2) {
            this.simboloJuegador2 = simboloJuegador2;
        }

        public void setTurno1(boolean turno1) {
            this.turno1 = turno1;
        }

        public void setCantidadFichas(int[] cantidadFichas) {
            this.cantidadFichas = cantidadFichas;
        }

        public void setMatriz(char[][] matriz) {
            this.matriz = matriz;
        }

    }
