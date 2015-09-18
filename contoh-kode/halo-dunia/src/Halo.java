package belajar;

import org.joda.time.DateTime;

public class Halo {
  public static void main(String[] x){
    System.out.println("Halo");

    DateTime hariIni = new DateTime();
    System.out.println("Hari ini : "+hariIni);

    DateTime kapanKapan = hariIni.plusDays(22);
    System.out.println("22 hari lagi : "+ kapanKapan);
  }
}