public class FizzBuzz {

	public boolean checkFizzBuzz(int n) {
		if (n % 3 == 0 || n % 5 == 0) {
			return true;
		} else {
			return false;
		}
	}
	public String printFizzBuzz(int n) {
		if (n % 3 == 0 && n % 5 == 0) {
			return "FizzBuzz";
		} else if (n % 3 == 0) {
			return "Fizz";
		} else {
			return "Buzz";
		}
	}
}