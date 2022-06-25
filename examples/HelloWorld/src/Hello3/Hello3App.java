package Hello3;

import java.util.Scanner;

import Hello3.System._string;
import Hello3.System.impl._opsImpl;

public class Hello3App extends _opsImpl {

	public static void main(String[] args) {
		Hello3App hello3 = new Hello3App();
		hello3.launch_application();
	}

	public void print__string(_string S) {
		System.out.print(S.getValue());
	}
	
	public void start_a_new_line() {
		System.out.println();
	}
	
	public void read_input_from_user_and_store_it_in__string(_string S) {
		Scanner scanner = new Scanner(System.in);
		S.setValue(scanner.nextLine());
	}
}
