/**
 *Counts the number of ones that appear in an integer
 * @author Jackson
 */
public class Main {

  public static int countOnes(int num){
    int count = 0;
    while(num >= 10){
      if(num % 10 == 1){
        count = count + 1;
      }
      num = num / 10;
    }
    if(num == 1){
      count = count + 1;
    }
    return count;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //
    int count = countOnes(736482);
    
    System.out.println(count);
  }
}
