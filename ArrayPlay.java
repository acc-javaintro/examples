
public class ArrayPlay {

    public static void main(String[] args) {
        // declare array variables -- undefined for now
        int[] intArr;
        Object[] objArr;

        intArr = new int[3]; // create an array by size
        intArr[0] = 755;
        intArr[1] = -2131;
        intArr[2] = 42;

        intArr = new int[]{755, -2131, 42};
        int[] intArr2 = {755, -2131, 42};

        objArr = new Object[3];
        objArr[0] = new Object();
        objArr[1] = new Object();
        objArr[2] = new Object();

        objArr = new Object[]{new Object(), new Object(), new Object()};

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }

        for (int i : intArr2) {
            System.out.println(i);
        }

        for (Object o : objArr) {
            System.out.println(o);
        }

    }

}
