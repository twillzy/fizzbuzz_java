public class FizzBuzzGame {

	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		boolean isFizzBuzz = false;
		for(int i = 1; i < 100; i++) {
			isFizzBuzz = fb.checkFizzBuzz(i);
			if (isFizzBuzz) {
				System.out.println(fb.printFizzBuzz(i));
			} else {
				System.out.println(i);
			}
		}
	}
}