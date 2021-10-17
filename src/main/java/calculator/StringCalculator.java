package calculator;

class StringCalculator {

   public int add(String input) 
		    {
		        String[] numbers = input.split(",|\n");

		        if (input.isEmpty()) 
		        {
		            return 0;
		        } 
		        else if (numbers.length > 1) 
		        {
		            return getSum(numbers);
		        }
		        return stringToIntConversion(input);
		    }

		    private int getSum(String[] numbers) 
		    {
		        int sum = 0;
		        for (String currentNumber:numbers) {
		            if (stringToIntConversion(currentNumber) > 1000) {
		                continue;
		            }
		            sum = sum + stringToIntConversion(currentNumber);
		        }
		        return sum;
		    }

		    private int stringToIntConversion(String number) 
		    {
		        int num = Integer.parseInt(number);
		        if (num < 0) {
		            throw new IllegalArgumentException("The input is negative!");
		        } else {
		            return num;
		        }
		    }

}
