public class fibonacci {
        public static void main(String[] args) {

        int n = 20, firstNum = 0, secondNum = 1;
	System.out.println("Numbers up to " + n + "places");

	for (int i = 1; i <= n; ++i) {
	System.out.println(firstNum + ", ");

	//calculate next number
	int NextNum = firstNum + secondNum;
	firstNum = secondNum;
	secondNum = NextNum;
	}
	}
}


