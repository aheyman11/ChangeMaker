
public class ChangeMakerTest {
    private static ChangeMaker changeTest;

    public static void main(String[] args){
        changeTest = new ChangeMaker();
        System.out.println("Change for 5: " + changeTest.makeChange(5));
        System.out.println("Change for 10: " + changeTest.makeChange(10));
        System.out.println("Change for 15: " + changeTest.makeChange(15));
        System.out.println("Change for 20: " + changeTest.makeChange(20));
        System.out.println("Change for 25: " + changeTest.makeChange(25));
        System.out.println("Change for 45: " + changeTest.makeChange(45));
        System.out.println("Change for 55: " + changeTest.makeChange(55));
	}
}