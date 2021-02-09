
public class MainArgsExample {

	public static void main(String[] args) {  // 3 + 5
		int val1 = Integer.parseInt(args[0]);
		int val2 = Integer.parseInt(args[2]);
		
		String op = args[1];
		
		switch(op) {
		case "+": System.out.println(args[0] + args[1] + args[2] + "=" + (val1+val2)); break;
		case "-": System.out.println(args[0] + args[1] + args[2] + "=" + (val1-val2)); break;
		case "x": System.out.println(args[0] + args[1] + args[2] + "=" + (val1*val2)); break;
		case "/": System.out.println(args[0] + args[1] + args[2] + "=" + (val1/val2)); break;
		}

	}

}
