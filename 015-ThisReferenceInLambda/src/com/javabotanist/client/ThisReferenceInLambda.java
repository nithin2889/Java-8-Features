package com.javabotanist.client;

public class ThisReferenceInLambda {

	public static void main(String[] args) {

		int x = 30;

		System.out.println("using anonymous class");
		ThisReferenceInLambda.doOperation(x, new Operation() {
			@Override
			public void operate(int n) {
				System.out.println(x+n);
				// this keyword here refers to the inner anonymous class (ThisReferenceInLambda$1@7852e922)
				System.out.println(this);
			}
		});
		
		System.out.println("using lambda expression");
		ThisReferenceInLambda.doOperation(x, n -> {
			System.out.println(x+n);
			/**
			 * 1. We cannot use "this" keyword inside a lambda expression. Here, the semantics of "this"
			 *    keyword has been changed to refer to the surrounding/enclosing class and not the anonymous class.
			 *    As we are using the lambda inside a main static method there is no instance and hence, we will 
			 *    receive a compilation error for the below expression. However, if the method is not static or 
			 * 	  an instance method then we can access the "this" keyword as shown in the above method.
			 * 	  
			 * 2. When we use "this" inside an instance of an inner class we are potentially referencing the instance 
			 *    of an inner class. A Lamdba expression is not an inner class, as it is not referencing to the 
			 *    instance of the class that you defined the lambda expression in.
			 */
			// System.out.println(this);
		});
		
	}

	private static void doOperation(int i, Operation op) {
		op.operate(i);
	}

}
