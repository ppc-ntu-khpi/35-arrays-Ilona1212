# Практична робота "Масиви, вирази, керування виконанням програми"

## Завдання
4. Знайти в масиві число, яке повторюється найбільшу кількість разів

Код Exercise.java	
  ```java
package domain;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise 
{	
	private static final ThreadLocalRandom rnd = ThreadLocalRandom.current();
	/**
	 * Створює array
	 * @param size довжина array
	 * @return массив
	 */
	public static int[] creator(int size) 
        {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) 
                {
			array[i] = rnd.nextInt(10);
		}
		return array;
	}	
	/**
	 * Знаходить в массиві число, яке повторюється найбільшу кількість разів
	 * 
	 * @param arr - array
	 * @return - повертає число, яке в массиві повторюються найбільшу кількість разів
	 */
	public static int returner(int[] arr) 
        {
		Map<Integer, Integer> nums = new HashMap<>();
		for (int number : arr) {
			Integer i = nums.get(number);
			nums.put(number, i == null ? 1 : i+1);
		}		
		int max = Collections.max(nums.values());
		for (Map.Entry<Integer, Integer> number : nums.entrySet()) 
                {
			if (number.getValue() == max)
				return number.getKey();
		}
		return -1;
	}
}
  ```

Код TestResult.java
  ```java
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

  ```
  
</details>

Результат виконання програми:
----
![Gitter](https://github.com/ppc-ntu-khpi/35-arrays-Ilona1212/blob/master/img/1.png?raw=true)<br><br>
![Gitter](https://github.com/ppc-ntu-khpi/35-arrays-Ilona1212/blob/master/img/2.png?raw=true)<br>
