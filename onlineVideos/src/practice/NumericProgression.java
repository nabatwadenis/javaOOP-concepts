package practice;

public class NumericProgression {

	protected long first;
	protected long current;
	public NumericProgression() {
		current = first = 0;
	}
	
	
	protected long firstValue() {
		current = first;
		return current;
	}
	protected long nextValue() {
		return ++ current;
	}
	
	public void printProgression(int n) {
		System.out.println(firstValue());
		for(int i =2; i<=n; i++) {
			System.out.print(" "+ nextValue());
		}
		System.out.println();
		
	}

}
class ArithProgression extends NumericProgression{
	protected long inc;
	
	ArithProgression(){
		this(1);
	}
	ArithProgression(long increment){
		inc = increment;
	}
	protected long nextValue() {
		current += inc;
		return current;
	}
} 

class GeoProgression extends NumericProgression{
	GeoProgression(){
		this(2);
	}
	GeoProgression(long base){
		first = base;
		current = first;
	}
	protected long nextValue() {
		current *= first;
		return current;
	}
}

class FibonacciProgression extends NumericProgression{
	long prev;
	FibonacciProgression(){
		this(0, 1);
	}
	FibonacciProgression(long value1, long value2){
		first = value1;
		prev = value2 - value1;
	}
	protected long nextValue() {
		long temp = prev;
		prev = current;
		current += temp;
		return current;
	}
}




