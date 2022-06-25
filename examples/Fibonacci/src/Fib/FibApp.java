package Fib;

import Fib.System._boolean;
import Fib.System._integer;
import Fib.System.impl._opsImpl;

public class FibApp extends _opsImpl {

	public static void main(String[] args) {
		FibApp fib = new FibApp();
		fib.launch_application();
	}

	public void _integer_is__integer(_integer X, _integer Y) {
		X.setValue(Y.getValue());;
	}

	public void _integer_is_greater_than_or_equal_to__integer_is__boolean(
			_integer X, _integer Y, _boolean B) {
		B.setValue(X.getValue() >= Y.getValue());
	}

	public void the_addition_of__integer_with__integer_is__integer(
			_integer A, _integer B, _integer X) {
		X.setValue(A.getValue() + B.getValue());
	}

	public void the_difference_between__integer_and__integer_is__integer(
			_integer A, _integer B, _integer X) {
		X.setValue(A.getValue() - B.getValue());
	}
	
	public void output__integer(_integer X) {
		System.out.println(X.getValue());
	}
}
