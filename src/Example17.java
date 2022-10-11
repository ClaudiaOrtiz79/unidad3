import java.util.Scanner;
  class Example17 {
      public static void main(String[] args) {
          int hora;
          int minutos;
          int segundos;
          System.out.println(" Escribir hora: ");
          Scanner inputValue;
          inputValue = new Scanner(System.in);
          hora = inputValue.nextInt();
          System.out.println(" Escribir minutos: ");
          minutos = inputValue.nextInt();
          System.out.println(" Escribir segundos  ");
          segundos = inputValue.nextInt();

          if ((hora < 10 && hora > 1) && (minutos < 10 && minutos > 1) && (segundos < 10 && segundos > 1)) {
              System.out.println("0" + hora + ":" + "0" + minutos + ":" + "0" + segundos);
          }
          if (hora <= 24 && minutos <=59 && segundos <= 59) {
              segundos +=1;
              System.out.println(hora + ":" + minutos + ":" + segundos);
          }
          if (segundos >= 59) {
              segundos = 0;
              minutos++;
              System.out.println(hora + ":" + minutos + ":" + segundos);
          }
              if (minutos >= 59 ) {
                  minutos = 0;
                  hora++;
                  System.out.println(hora + ":" + minutos + ":" + segundos);
              }
                  if (hora == 24) {
                      hora = 0;
                  System.out.println(hora + ":" + minutos + ":" + segundos);
                  }
      }
  }