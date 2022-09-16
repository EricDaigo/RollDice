import java.security.SecureRandom;

class Main {
  public static void main(String[] args) {
    SecureRandom randomNumbers = new SecureRandom();

    int freq1 = 0;
    int freq2 = 0;
    int freq3 = 0;
    int freq4 = 0;
    int freq5 = 0;
    int freq6 = 0;

    for (int roll = 1; roll <= 6000000; roll++) {
      int face = 1 + randomNumbers.nextInt(6);

      switch (face) {
        case 1:
          freq1++;
          break;
        case 2:
          freq2++;
          break;
        case 3:
          freq3++;
          break;
        case 4:
          freq4++;
          break;
        case 5:
          freq5++;
          break;
        case 6:
          freq6++;
          break;
      }
    }

    /*
     * System.out.printf("Frequência de números 1: %d%n", freq1);
     * System.out.printf("Frequência de números 2: %d%n", freq2);
     * System.out.printf("Frequência de números 3: %d%n", freq3);
     * System.out.printf("Frequência de números 4: %d%n", freq4);
     * System.out.printf("Frequência de números 5: %d%n", freq5);
     * System.out.printf("Frequência de números 6: %d%n", freq6);
     */

    System.out.println("Face\tFrequência");
    System.out.println("");
    System.out.printf("1\t\t%d%n", freq1);
    System.out.printf("2\t\t%d%n", freq2);
    System.out.printf("3\t\t%d%n", freq3);
    System.out.printf("4\t\t%d%n", freq4);
    System.out.printf("5\t\t%d%n", freq5);
    System.out.printf("6\t\t%d%n", freq6);
  }
}