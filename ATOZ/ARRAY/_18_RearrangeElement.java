//rearragne a element by sign 
//eg a[]={-3,-2,1,2,3,4} //always positive = nagetive
//it mean 3 pos element = 3 negative element
//rearange in any order like all element pos all element neg, pos neg pos neg ...
public class _18_RearrangeElement {
    public static void main(String[] args) {
        int a[] = { -3, -2, 1, 2, 3, -4 };
        // optimal solution where pos=neg tc:-O(n)

        // int ans[] = new int[a.length];
        // int positive=0,negative =1;
        // for (int i = 0; i <a.length; i++) {
        // if(a[i]<0){
        // ans[negative] =a[i];
        // negative+=2;
        // } else{
        // ans[positive] =a[i];
        // positive+=2;
        // }
        // }

        // case 2 neg!=pos

        int posCount = 0, negCount = 0;

        // Count positive and negative numbers
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0)
                posCount++;
            else
                negCount++;
        }

        // Create arrays for positive and negative numbers
        int[] pos = new int[posCount];
        int[] neg = new int[negCount];
        int posIndex = 0, negIndex = 0;

        // for seprate a pos array and negative array
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0)
                pos[posIndex++] = a[i];
            else
                neg[negIndex++] = a[i];
        }

        if (pos.length > neg.length) {
            for (int i = 0; i < neg.length; i++) {
                a[2 * i] = pos[i];
                a[2 * i + 1] = neg[i];
            }
            int index2 = neg.length * 2;
            for (int i = neg.length; i < pos.length; i++) {
                a[index2] = pos[i];
                index2++;
            }
        } else {
            for (int i = 0; i < pos.length; i++) {
                a[2 * i] = pos[i];
                a[2 * i + 1] = neg[i];
            }
            int index2 = pos.length * 2;
            for (int i = pos.length; i < pos.length; i++) {
                a[index2] = neg[i];
                index2++;
            }
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
