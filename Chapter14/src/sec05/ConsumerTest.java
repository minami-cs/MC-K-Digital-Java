package sec05;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void add10(Consumer<Integer> d) {
		d.accept(10);
	}
	public static void main(String[] args) {
		add10((x)->{
			int sum = 0;
			for(int i=0; i<=x; i++) {
				sum += i;
			}
			System.out.println(sum);
		});
		
		BiConsumer<Integer, Integer> calc = (t, u) -> {System.out.println(t+u);};
		calc.accept(3, 5);  // 8로 출력
		
		BinaryOperator<Double> bo = (x, y) -> {return x+y;};
		double r = bo.apply(3.14, 5.21);
		System.out.println(r);
		
		BiPredicate<String, String> bp = (x, y) -> { return x.equals(y); };
		boolean b = bp.test("hong", "hong");
		System.out.println(b);
		
//		Consumer<String> consumer = (t) -> { System.out.println(t+"11"); };
//		consumer.accept("Java");
//		
//		// 위와 같은 식이지만 위처럼 람다식을 사용하면 코드가 간결해진다
//		Consumer<String> myconsumer = new Consumer<String>() {
//			
//			@Override
//			public void accept(String t) {
//				System.out.println(t+"11");
//			}
//		};
//		myconsumer.accept("Java");
	}

}
