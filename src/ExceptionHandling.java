
public class ExceptionHandling {
	public static void main(String[] args) {
		Integer age = 200;
		try {
			checkAge(age);
		} catch (AgeOutofRangeException e) {
			System.out.println("Age is incorrect");
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			// closing any open files
			// undoing any thing which is open
			System.out.println("Completed execution");
		}

	}
	private static void checkAge(Integer age) throws AgeOutofRangeException {
			if (age > 130)
				throw new AgeOutofRangeException();
			Integer result = age / 0;
			System.out.println(result);
	}
}
