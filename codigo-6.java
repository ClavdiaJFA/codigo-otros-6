import java.util.*; //colocado el import java.util

public class codigo6 {
  
  public static void main(String[] args) {
    int[] n = new int[20]; //el n estaba fuera del método

    for (int i = 0; i < 20; i++) {//se agregó un + al i
      n[i] = (int)(Math.random() * 381) + 20;
      System.out.print(n[i] + " "); //se agregó el out
    }
    
    System.out.println("\n¿Qué números quiere resaltar? ");//se agregó la n en printl
    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    int opcion = Integer.parseInt(System.console().readLine());

    int multiplo = (opcion == 1) ? 5 : 7; // se corrigió ? 5 : 7; por que no era correcta en el ternario

    for (int e : n) { //corregido el char. se cambió por el entero
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");
      } else {
        System.out.print(e + " ");
      }
    }
  
  }
}
