package p3.MasterMind;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

 class MmRandomGenerator extends ArrayList<Integer> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5015798131813875747L;
	public static Scanner enterInt = new Scanner(System.in);
    /**
     * nbDigits = number of usable digits for secret code generation nbNumber =
     * number of digits composing secret code nbDgtSrcTableI = usable digits
     * source table index number rdChar = random number selected among digits
     * source table pcSecretCode = computer generated secret code
     * nbDigitsSources = table of usable digits for secret code generation size
     * equals nbDigits randomNb = random number
     */
   // private final int nbDigits;
  //  private final int nbNumber;

//    private int nbDgtSrcTableInd, rdChar;
 //   private final StringBuilder pcSecretCode = new StringBuilder();
 //   Random randomNb = new Random();
    

    public MmRandomGenerator() {
        /**
         * Define the different number to use for the secret code
         */
      //  System.out.println("Enter the number of digits to use for the secret code generation between 1-10 = A");
      //  nbDigits = enterInt.nextInt();
      // this.forEach( i -> this.add(i++));
      
        for (int i = 0; i < 10; i++) {
            this.add(i);}
            this.forEach(num-> System.out.print(num.toString()));
       

        //System.out.println("Enter the number of digits composing the secret code between 1 and A");
        /**
         * ask for character number composing secret code
         */
       // nbNumber = enterInt.nextInt();
        /**
         * random integer generation between 0 and usable digits table size i.e
         * if A = 5 random number generated will be into the rang 0-5)
         */
       // for (int i = 0; i < nbNumber; i++) {
           // nbDgtSrcTableInd = randomNb.nextInt(this.size());
          //  rdChar = this.get(nbDgtSrcTableInd);
          //  pcSecretCode.append(rdChar);
            /**
             * Remove rdChar into digits source table in order to avoid
             * duplicates
             */
          //  this.remove(nbDgtSrcTableInd);
        }
      //  System.out.println("The secret code is : " + pcSecretCode.toString());
    }//

//}
