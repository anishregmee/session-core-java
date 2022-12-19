package day8;

public class RelationalOperator {
    public static void main(String[] args) {
        int m = 90;
        int n = 9;

//        note: m = n vaneko chai n ko value m maa haalnu ho

        if (m < n || m == n) {
            System.out.println("success");
        }else {
            System.out.println("failed");
        }

        boolean checkAndOperator = (m != n) && (m > 0);
        System.out.println(checkAndOperator);

        int mark = 90;
        String msg = (mark >= 90) ? "congratulation successful peeeeeeeepol" : "try again successful peeeeople";
        System.out.println(msg);
    }
}
