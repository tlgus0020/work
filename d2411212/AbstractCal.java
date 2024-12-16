package d2411212;

class Cal{
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
}

public abstract class AbstractCal {
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	abstract public int mux(int a, int b);
}
