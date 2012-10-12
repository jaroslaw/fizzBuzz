public class FizzBuzz {
    public static void main(String[] args) {
        new FizzBuzz().run();
    }

    private void run() {
        for (int i = 1; i <= 100; i ++)
            System.out.println(NumberToString(i));
    }

    public String NumberToString(Integer number) {
        String res = "";
        if (number % 3 == 0) res = "Fizz";
        if (number % 5 == 0) res += "Buzz";
        if (res == "") res = number.toString();
        return res;
    }
}
