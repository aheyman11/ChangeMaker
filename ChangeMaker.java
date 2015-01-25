import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by andreahe on 1/21/15.
 */
public class ChangeMaker {

    public ArrayList<ArrayList<Integer>> makeChange(int amount) {
        ArrayList<ArrayList<Integer>> possibleChanges = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> changesFiveLess;
        ArrayList<ArrayList<Integer>> changesTenLess;
        ArrayList<ArrayList<Integer>> changesQuarterLess;
        ArrayList<ArrayList<Integer>> changeForNickel = new ArrayList<ArrayList<Integer>>();
        if (amount == 5) {
            ArrayList<Integer> nickel = new ArrayList<Integer>();
            nickel.add(5);
            changeForNickel.add(nickel);
            return changeForNickel;
        }

        else {
            //System.out.println(possibleChanges);
            if (amount > 5) {
                changesFiveLess = new ArrayList<ArrayList<Integer>>(makeChange(amount-5));
                for (int i = 0; i < changesFiveLess.size(); i++) {
                    (changesFiveLess.get(i)).add(5);
                    Collections.sort(changesFiveLess.get(i));
                    possibleChanges.add(changesFiveLess.get(i));
                }
                //System.out.println("changesFiveLess: " + changesFiveLess);
            }
            if (amount > 10) {
                changesTenLess = new ArrayList<ArrayList<Integer>>(makeChange(amount-10));
                for (int i = 0; i < changesTenLess.size(); i++) {
                    (changesTenLess.get(i)).add(10);
                    Collections.sort(changesTenLess.get(i));
                    if(!possibleChanges.contains(changesTenLess.get(i))) {
                        possibleChanges.add(changesTenLess.get(i));
                    }
                }
            }
            if (amount > 25) {
                changesQuarterLess = new ArrayList<ArrayList<Integer>>(makeChange(amount-25));
                for (int i = 0; i < changesQuarterLess.size(); i++) {
                    (changesQuarterLess.get(i)).add(25);
                    Collections.sort(changesQuarterLess.get(i));
                    if(!possibleChanges.contains(changesQuarterLess.get(i))) {
                        possibleChanges.add(changesQuarterLess.get(i));
                    }
                }
            }
            if (amount == 10) {
                ArrayList<Integer> dime = new ArrayList<Integer>();
                dime.add(10);
                possibleChanges.add(dime);
            }
            if (amount == 25) {
                ArrayList<Integer> quarter = new ArrayList<Integer>();
                quarter.add(25);
                possibleChanges.add(quarter);
            }
            return possibleChanges;
        }
    }
}
