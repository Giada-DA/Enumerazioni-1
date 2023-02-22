import java.time.Month;
public class Start {
    enum month {January, February, March, April, May, June, July, August, September, October, November, December};
    public static void main(String[] args) {
        for (month mese: month.values()) {
            String support = mese.toString();
            if(support.endsWith("y")){
                System.out.println(mese + " ends with y");
            }else {
                System.out.println(mese + " doesn't end with y");
            }
        }
    }
}