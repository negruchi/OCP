package ocp2_4;

public class Outer {
	String outer = "Outer";
	private String privateOuter = "Private Outer variable";
	static String staticOuter = "Static Outer variable";

	public void outerNonStatic(String text) {
		System.out.println(text
				+ " Can access to a non static member of the outer class");
	}

	public static class StaticNested {
		String staticNested = "Static nested";
		private String privateStaticNested = "Private static nested";
		static String staticStaticNested = "Static static nested";

		private void goOuter() {
			System.out.println("This is a Static Nested class");
		}

		void accessOuter() {
			System.out.println(staticOuter); // can access the members of the
												// outer class (only static
												// members)
		}

		public static void main(String[] args) {

		}
	}

	public class InnerClass {
		String inner = "Inner";
		private String privateInner = "Private Inner variable";

		// static String staticInner = "Static Inner variable"; //The field
		// staticInner cannot be declared static in a non-static inner type,
		// unless initialized with a constant expression
		private void goOuter() {
			System.out.println("This is a Inner class");
		}

		void accessOuter() {
			System.out.println(outer); // can access the members of the outer
										// class (there are only non-ststic
										// members)
			System.out.println(privateOuter); // can access even the private
												// members, because this class
												// is a member of the outer
												// class
			System.out.println(staticOuter);
			outerNonStatic("From the ic");
		}

		// public static void main(String[] args) {// static members are not
		// allowed in Inner classes
		// }
	}

	public void localInnerMethod() {
		String localVariable = "Local variable";
		final String localFinalVariable = "Local Final variable";

		// public class LocalInner // Illegal modifier for the local class
		// LocalInner; The same rules regarding access modifiers: Only abstract
		// or final can be applied.
		class LocalInner {
			public void accessOuter() {
				System.out.println(outer);
				System.out.println(privateOuter); // can access the outer class
													// members, even the private
													// ones
				System.out.println(staticOuter);
				System.out.println(new Outer().outerMethod());
				// System.out.println(localVariable); //Cannot refer to the
				// non-final local variable localVariable defined in an
				// enclosing scope
				System.out.println(localFinalVariable);
			}

			private void goOuter() {
				System.out.println("This is a Local Inner class");
			}
		}
		LocalInner li = new LocalInner();
		li.goOuter();
		li.accessOuter();
	}

	public static void localStaticInnerMethod() // This is the same, but because
												// it is static, the inner class
												// no access to instance
												// variables of the outer class
	{
		String localVariable = "Local variable";
		final String localFinalVariable = "Local Final variable";
		class LocalInner {
			public void accessOuter() {
				// System.out.println(privateOuter); // can access only to
				// static members
				System.out.println(staticOuter);
				System.out.println(new Outer().outerMethod());
				// System.out.println(localVariable); //Cannot refer to the
				// non-final local variable localVariable defined in an
				// enclosing scope
				System.out.println(localFinalVariable);
			}

			private void goOuter() {
				System.out.println("This is a Local Inner class");
			}
		}
		LocalInner li = new LocalInner();
		li.goOuter();
		li.accessOuter();
	}

	public void anonymousInnerMethod() {
		InnerClass ic = new InnerClass() {
			void goOuter() {
				System.out.println("This should be an Anonymous Inner Class");
			}
		};
		System.out.println("Yes");
		ic.goOuter(); // Porque no ejecuta el metodo overriden???

		Outer ica = new Outer() {
			void goOuter() {
				System.out.println("This is an Anonymous Inner Class");
			}
		};
		ica.goOuter();

	}

	private String outerMethod() {
		return "String outer method";
	}

	void goOuter() {
		// Access to inner classes without an instance: Not allowed
		// System.out.println(staticNested); //inner cannot be resolved to a
		// variable
		System.out.println("This is a normal class");
	}

	void myInnerClass() {
		InnerClass ic = new InnerClass(); // Compiles because here already
											// exists an instance of the Outer
											// class
	}

	public static void main(String[] args) {
		Outer o = new Outer();

		// Create an instance of a static Nested class
		StaticNested sn = new StaticNested();
		// To create an instance of an inner class, you must have an instance of
		// the outer class to tie to the inner class
		// InnerClass ic = new InnerClass(); //No enclosing instance of type
		// Outer is accessible
		Outer.InnerClass ic = o.new InnerClass(); // REMEMBER! Implicit
													// reference to the outer
													// class.
		Outer.InnerClass ic2 = new Outer().new InnerClass(); // one line.

		// Access to inner classes without an instance: Not allowed
		// System.out.println(staticNested); //staticNested cannot be resolved
		// to a variable

		// Access to inner classes through an instance
		// Variables
		System.out.println(o.outer);
		System.out.println(sn.privateStaticNested); // access even to private
													// members
		System.out.println(ic.privateInner); // access even to private members

		// Methods
		o.goOuter();
		sn.goOuter(); // access even to private members
		sn.accessOuter();
		ic.goOuter(); // access even to private members
		ic.accessOuter();

		// LocalInner li = new LocalInner(); //LocalInner cannot be resolved to
		// a type. Cannot access to this class, it is a methodLocal
		o.localInnerMethod(); // Calls the go() and the accessOuter methods
								// inside the local class.
		Outer.localStaticInnerMethod(); // Calls the go() and the accessOuter
										// methods inside the local class.

		// Anonymous
		o.anonymousInnerMethod(); // The same, but inside an local method.... it
									// does not work...???
		Outer ica = new Outer() {
			void goOuter() {
				System.out.println("This is an Anonymous Inner Class");
			}
		};
		ica.goOuter();
	}
}
