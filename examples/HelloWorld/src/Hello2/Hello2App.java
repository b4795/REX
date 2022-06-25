package Hello2;

import Hello2.System._string;
import Hello2.System.impl._opsImpl;

public class Hello2App extends _opsImpl {

	public static void main(String[] args) {
		Hello2App hello2 = new Hello2App();
		hello2.launch_application();
	}

	public void print__string(_string S) {
		System.out.println(S.getValue());
	}
}
