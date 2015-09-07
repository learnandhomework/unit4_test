package lgspath.com;

public class Unit4_test {
	private static int result;
	private static int rrandom;

	public int Number() {
		int random = (int) Math.random();
		rrandom = random;
		return rrandom;

	}

	public void For() {
		for (int i = 0; i < rrandom; i++) {
			result = i;
		}
	}

	public int getResult() {
		return result;

	}

}
