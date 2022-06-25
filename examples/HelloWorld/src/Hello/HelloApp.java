package Hello;

import Hello.System.impl._opsImpl;

public class HelloApp extends _opsImpl {

	public static void main(String[] args) {
		HelloApp hello = new HelloApp();
		hello.launch_application();
	}

	public void print_hello_world() {
		System.out.println("Hello, World!");
	}
}
