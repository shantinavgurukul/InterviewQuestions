package interviewQuestions;

public class Questions1PrimeNum {
	public static void main(String args[]) {
		int user = 8;
		int number = 1;
		int result = 0;
		while (number <= user) {
			if (user % number == 0) {
				result = result + 1;
			}
			number = number + 1;
		}
		if (result == 2) {
			System.out.println("it's prime number");
		} else {
			System.out.println("it's not prime number");
		}

	}

}
