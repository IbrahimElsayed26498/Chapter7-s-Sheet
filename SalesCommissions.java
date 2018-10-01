/*
In the name of Allah, the Gracious, the Merciful
 */
package salescommissions;
//7.10
import java.security.SecureRandom;

/**
 *
 * @author ibrahim
 */
public class SalesCommissions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] frequency = new int [11];
        SecureRandom randomNumber = new SecureRandom();//random number for the salary
        for(int saller=0;saller<1000;saller++){//1000 there is a supposed number for salespeople
            ++frequency[(200+randomNumber.nextInt(800))/100];
        }
        for(int salaryRange=2; salaryRange<frequency.length; salaryRange++){
            if(salaryRange == 10){
                System.out.println("$1,000 and over " + frequency[salaryRange]);
            }
            else{
                System.out.printf("$%d-%d %d%n",salaryRange*100,salaryRange*100+99,frequency[salaryRange]);
            }
        }
    }
    
}
