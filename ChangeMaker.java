import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by andreahe on 1/21/15.
 */
public class ChangeMaker {

    public ArrayList<ArrayList<Integer>> makeChange(int amount) {
        ArrayList<ArrayList<Integer>> possibleChanges = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> changesFiveLess = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> changesTenLess = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> changesQuarterLess = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> changeForNickel = new ArrayList<ArrayList<Integer>>();
        if (amount == 5) {
            ArrayList<Integer> currentChange = new ArrayList<Integer>();
            currentChange.add(5);
            changeForNickel.add(currentChange);
            return changeForNickel;
        }
        else {
            //System.out.println(possibleChanges);
            if (amount > 5) {
                changesFiveLess = new ArrayList<ArrayList<Integer>>(makeChange(amount-5));
                for (int i = 0; i < changesFiveLess.size(); i++) {
                    (changesFiveLess.get(i)).add(5);
                }
                //System.out.println("changesFiveLess: " + changesFiveLess);
            }
            // // TODO 1
            // if (amount == 20) {
            //     System.out.println(changesFiveLess);
            // }
            if (amount > 10) {
                changesTenLess = new ArrayList<ArrayList<Integer>>(makeChange(amount-10));
                for (int i = 0; i < changesTenLess.size(); i++) {
                    (changesTenLess.get(i)).add(10);
                }
            }
            // // TODO 2
            // if (amount == 20) {
            //     System.out.println(changesFiveLess);
            // }

            if (amount > 25) {
                changesQuarterLess = new ArrayList<ArrayList<Integer>>(makeChange(amount-25));
                for (int i = 0; i < changesQuarterLess.size(); i++) {
                    (changesQuarterLess.get(i)).add(25);
                }
            }
            // // TODO 3
            // if (amount == 20) {
            //     System.out.println(changesFiveLess);
            // }

            possibleChanges.clear();
            if (amount == 10) {
                ArrayList<Integer> dime = new ArrayList<Integer>();
                dime.add(10);
                possibleChanges.add(dime);
            }
            // TODO 4
            // if (amount == 20) {
            //     System.out.println(changesFiveLess);
            // }

            if (amount == 25) {
                ArrayList<Integer> quarter = new ArrayList<Integer>();
                quarter.add(25);
                possibleChanges.add(quarter);
            }
            // // TODO 5
            // if (amount == 20) {
            //     System.out.println(changesFiveLess);
            // }

            if (amount > 5) {
                for (ArrayList<Integer> change : changesFiveLess) {
                    Collections.sort(change);
                    possibleChanges.add(change);
                }
            }
            // // TODO 6
            // if (amount == 20) {
            //     System.out.println(changesFiveLess);
            // }

            if (amount > 10) {
                for (ArrayList<Integer> change : changesTenLess) {
                    Collections.sort(change);
                    if (!possibleChanges.contains(change)) {
                        possibleChanges.add(change);
                    }
                }
            }
            if (amount > 25) {
                for (ArrayList<Integer> change : changesQuarterLess) {
                    Collections.sort(change);
                    if (!possibleChanges.contains(change)) {
                        possibleChanges.add(change);
                    }
                }
            }
            return possibleChanges;
        }
    }

    //private ArrayList<ArrayList<Integer>> changeForNickel;
    //private ArrayList<ArrayList<Integer>> changesFiveLess;
    //private ArrayList<ArrayList<Integer>> changesTenLess;
    //private ArrayList<ArrayList<Integer>> changesQuarterLess;
    //private ArrayList<Integer> currentChange;
}
