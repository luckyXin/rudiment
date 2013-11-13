package dx.web.common;

public class ReflectionObject {

	private ReflectionObject() {
	}

	@SuppressWarnings("unused")
	private void systemOutPrint() {
		System.out.println("已经输出");
	}

	@SuppressWarnings("unused")
	private int sum(int i, int n) {
		return i + n;
	}
}
