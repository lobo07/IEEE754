
import java.util.Stack;



/**
 *
 * @author Edwin
 */
public class Binary {
    private double num = 0;
    private Stack<Character> binaryNum;
    private Stack<Character> binaryNum2;
    public Binary(double newNum)
    {
        num = newNum;        
    }
    
    public String DecimalToBinary ()
    {
        char binaryDig;
        String binary = " ";
        int whole = (int)num;
        while(whole !=0)
        {
            if(whole%2 != 0)
                binaryDig = '1';
            else
                binaryDig = '0';
            binaryNum.push(binaryDig);
            whole = whole/2;
            
        }
        while(binaryNum.size() != 0) {
            binary += binaryNum.pop();
        }
            
        return binary;
    }
    
    public double BinaryToDecimal(String bin)
    {
        double deci = 0;
        for (int i =0; i < bin.length(); i++)
        {
            if(bin.charAt(i) == '1')
                deci = deci * 2 + 1;
            else
                deci = deci * 2 + 0;
        }
        return deci;
    }
}
