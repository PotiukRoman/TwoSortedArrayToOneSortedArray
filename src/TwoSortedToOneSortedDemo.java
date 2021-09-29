public class TwoSortedToOneSortedDemo {
    static int[] union(int[] initalA, int[] initalB) {
        if (initalA == null && initalB == null) return null;
        if (initalA == null) return initalB.clone();
        if (initalB == null) return initalA.clone();

        int[] end = new int[initalA.length + initalB.length];
        int i = 0, j = 0, k = 0;
        while (i < initalA.length && j < initalB.length) {
            if (initalA[i] < initalB[j]) {
                end[k] = initalA[i];
                i++;
            } else {
                end[k] = initalB[j];
                j++;
            }
            k++;
        }

        if (i < initalA.length) {
            System.arraycopy(initalA, i, end, k, (initalA.length - i));
        }

        if (j < initalB.length) {
            System.arraycopy(initalB, j, end, k, (initalB.length - j));
        }

        return end;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,7,9,12};
        int[] b = {2,3,7,7,8,9,10,15,21,35};
        int [] c= new int[(a.length+b.length)];
        c=union(a,b);

        for (int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }


}
