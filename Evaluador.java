public class Evaluador {

        private int tamano;
        private char simboloJugador1;
        private char simboloJugador2;
        private boolean turno1;
        private int x;
        private char simbolo;
        private boolean connectFour;
        private int[] ys;
        private int y;
        private int contador;
        private char[][] matriz;

        public Evaluador(){
            this.tamano = 6;
            this.simboloJugador1 = 'X';
            this.simboloJugador2 = 'Y';
            this.turno1 = true;
            this.x = 3;
            this.simbolo = simboloJugador1;
            this.connectFour = false;
            this.ys = new int[tamano];
            this.y = tamano - ys[x];
            this.contador = 0;
            this.matriz = new char [tamano][tamano];
        }


        public void verificarhorizontal(){
            for (int i = 0; i < tamano; i++) {
                if (matriz[y][i] == simbolo) {
                    contador++;
                    if (contador == 4) {
                        connectFour = true;
                        break;
                    }
                } else {
                    contador = 0;
                }
            }
        }

        public void verificarvertical() {
            if (!connectFour) {
                contador = 0;
                for (int i = 0; i < tamano; i++) {
                    if (matriz[i][x] == simbolo) {
                        contador++;
                        if (contador == 4) {
                            connectFour = true;
                            break;
                        }
                    } else {
                        contador = 0;
                    }
                }
            }
        }

        public void verificardiagonalprincipal(){
            if (x == y) {
                contador = 0;
                for (int i = 0; i < tamano; i++) {
                    if (matriz[i][i] == simbolo) {
                        contador++;
                        if (contador == 4) {
                            connectFour = true;
                            break;
                        }
                    } else {
                        contador = 0;
                    }
                }
            }
        }

        public void verificardiagonalinvertida(){
            if (x + y == tamano - 1) {
                contador = 0;
                for (int i = 0; i < tamano; i++) {
                    if (matriz[i][tamano - 1 - i] == simbolo) {
                        contador++;
                        if (contador == 4) {
                            connectFour = true;
                            break;
                        }
                    } else {
                        contador = 0;
                    }
                }
            }
        }

        public void imprimir(){
            for(int i=0; i<matriz.length; i++){
                for(int j=0; j<matriz[i].length; j++){
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
            turno1 = !turno1;
        }
        }
