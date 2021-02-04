package test;
import java.util.Arrays;
import static domain.Exercise.*;
public class TestResult 
{
    public static void main(String[] args) 
    {
    	int[] arr = creator(10);
		System.out.println(Arrays.toString(arr));		
		int count = returner(arr);
		System.out.println(count);
    }
}
