package com.curso.java.algoritmos.service;

public class CaballoSaltadorService {

    static final int N =  8;
    static final int n = (N+1);
    private int [][] tablero = new int[n][n];
    private boolean exito;
    private int [][] salto = {{2,1} ,{1,2}, {-1,2}, {-2,1}, {-2,-1},{-1,-2},{1,-2},{2,-1} };

    private int x0, y0;

    public CaballoSaltadorService(int x, int y) throws Exception{
        if((x<1)|| (x>N) || (y<1) || (y>N)){
            throw new Exception("Cordenadas fuera de rango");
        }
        x0 = x;
        y0 = y;

        for(int i=1; i<=N ; i++){
            for(int j=1 ; j<=N; j++){
                tablero[i][j] = 0;
            }
        }
        tablero[x0][y0] =1;
        exito= false;
    }


    public boolean resolverProblema(){
        saltoCaballo(x0,y0,2);
        return exito;
    }

    private void saltoCaballo(int x, int y , int i){
        int nx, ny;
        int k;
        k=0; // inicializa el conjunto posible de movientos

        do{
            k++;
            nx= x + salto[k-1][0];
            ny = y + salto[k-1][1];

            // Determina si nuevas cordenadas son aceptables
            if((nx>=1) && (nx<= N) && (ny>=1) && (ny<= N) && (tablero[nx][ny]==0)){
                tablero[nx][ny] = i ;
                if(i< N*N){
                    saltoCaballo(nx,ny,i+1);
                    // Se analiza si se ha completado la solución
                    if(!exito){
                        // No se alcanzo la solución
                        tablero[nx][ny] = 0; // Se borra la anotación
                    }
                }else {
                    exito = true; // tablero cubierto
                }
            }

        }while (k < 8  && !exito);
    }

    // muestra en pantalla los pasos del caballo en el tablero
    public void escribirTablero(){
       for(int i= 1 ; i<= N; i++){
           for (int j=1; j<=N; j++){
               System.out.print(tablero[i][j]+ " ");
           }
           System.out.println();
       }
    }


}
