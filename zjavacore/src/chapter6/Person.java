package chapter6;

public interface Person {
	default String getName() {
		return getClass().getName() + "_" + hashCode();
		
	}
}
