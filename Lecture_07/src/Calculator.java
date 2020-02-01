public class Calculator {

	public float result;

	public Calculator(float result) {
		this.result = result;
	}

	public void add(float value) {
		this.result += value;
	}

	public void sub(float value) {
		this.result -= value;
	}

	public void mult(float value) {
		this.result *= value;
	}

	public void div(float value) {
		this.result /= value;
	}

	public void power(int value) {
		
		
		if (value < 0 ) {
			value = -value;
			result = 1 / result;
		}
		float base = result;
		
		for (int i = 0; i < value - 1; i++) {
			result *= base;
		}
	}

	public float getResult() {
		return this.result;
	}

	public void abs() {
		if (result < 0) {
		result = -result;

		}

	}

}
