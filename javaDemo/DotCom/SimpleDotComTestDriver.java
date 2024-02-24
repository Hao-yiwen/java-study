public class SimpleDotComTestDriver {
    public static void main(String[] args) {
        SimpleDotCom dotCom = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.CheckYourSelf(userGuess);
        String testResult = "failResult";
        if(result.equals('hit')){
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}