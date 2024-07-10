import java.util.*;
public class Main {
    static ArrayList<Integer> arraylist8 = new ArrayList<>();
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Ex1:
        String[] array_S = {"cat","dog","red","is","am"};
        ArrayList<String> arraylist_longest = new ArrayList<>();
        int coun = array_S[0].length();
        for (int i = 0; i < array_S.length; i++) {
            if(array_S[i].length() >= coun)
            {
                coun = array_S[i].length();
            }
        }
        for (int i = 0; i < array_S.length; i++) {
            if (array_S[i].length() == coun) {
                arraylist_longest.add(array_S[i]);
            }
        }
        System.out.println(arraylist_longest);

        System.out.println("------------------------");
        //Ex2:

        int[] arr = {1,1,1,3,3,5};
        int cc = 0;
        System.out.print("Enter number: ");
        int nn;
        nn = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (nn == arr[i]) {
                cc++;
            }
        }
            System.out.println(nn + " occurs " + cc + " times");

        System.out.println("------------------------");
        //Ex3:

        int[] arr3 = {1,4,17,7,25,3,100};
        ArrayList<Integer> arraylist2 = new ArrayList<>();
        int n,c = 0;
        System.out.print("Enter k largest: ");
        int k = in.nextInt();
        for(int i=0;i < k;i++)
        {
            n = 0;
            for (int j = 0; j < arr3.length; j++)
            {
                if (n < arr3[j])
                {
                    n = arr3[j];
                    c = j;
                }
            }
            arraylist2.add(n);
            arr3[c] = 0;
        }
        System.out.println(arraylist2);

        System.out.println("------------------------");
        //Ex4:

        ArrayList<Integer> arraylist4 = new ArrayList<>();
        arraylist4.add(5);
        arraylist4.add(4);
        arraylist4.add(3);
        arraylist4.add(2);
        arraylist4.add(1);
        System.out.println("Reversed array: " + reverse(arraylist4));

        System.out.println("------------------------");
        //Ex5:
        int n5 = 0;
        ArrayList<Integer> arraylist5 = new ArrayList<>();
        System.out.print("Enter size of the array: ");
        int size = in.nextInt();
        int[] arr5 = new int[size];
        do {
            System.out.println("1- Accept elements of an array");
            System.out.println("2- Display elements of an array");
            System.out.println("3- Search the element within array");
            System.out.println("4- Sort the array");
            System.out.println("5- To stop");
            System.out.print("Enter number: ");
            n5 = in.nextInt();
            if(n5 == 1)
            {
                for (int i = 0; i < size; i++) {
                    System.out.printf("Enter input to array[%d]: ", i);
                    arr5[i] = in.nextInt();
                    arraylist5.add(arr5[i]);
                }
            }
            if(n5 == 2)
            {
                System.out.println(arraylist5);
            }
            if(n5 == 3)
            {
                System.out.print("Enter number for search: ");
                int search = in.nextInt();
                if(arraylist5.contains(search))
                System.out.println("The index is " + arraylist5.indexOf(search));
                else System.out.println("i can not find it");
            }
            if(n5 == 4)
            {
                Arrays.sort(arr5);
                for (int i=0;i < arr5.length;i++)
                {
                    arraylist5.set(i,arr5[i]);
                }
                System.out.println("Done");
            }
            if(n5 > 5 || n5 <= 0)
            {
                System.out.println("Please enter number between 1 and 5.");
            }
        }while (n5 != 5);

        System.out.println("------------------------");
        //Ex6:

        System.out.print("Enter minimum value of the range: ");
        int min = in.nextInt();
        System.out.print("Enter maximum value of the range: ");
        int max = in.nextInt();
        System.out.print("Enter counter: ");
        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print((int)(Math.random()*(max-min-1)+min) + " ");
        }
        System.out.println();
        System.out.println("------------------------");
        //Ex7:

        System.out.print("Enter a password: ");
        in.nextLine();
        String pass = in.nextLine();
        int p = checkLength(pass) + checkSpecialCharacters(pass) + checkUpperCaseLowerCase(pass);
        System.out.println(p);
        if(p >= 8)
        {
            System.out.println("Password is strong.");
        } else if (p <= 7 && p >= 5) {
            System.out.println("Password is moderately strong.");
        }
        else System.out.println("Password is weak.");

        System.out.println("------------------------");
        //Ex8:

        System.out.print("Enter the number of Fibonacci: ");
        int f = in.nextInt();
        System.out.println("Fibonacci sequence with " + f + " terms:\n" + fibonacci(f));
    }
    public static ArrayList<Integer> fibonacci(int f) {
        int hint = 0,f0 = 0,f1 = 1;
        for (int i = 1; i <= f; ++i)
        {
            arraylist8.add(f0);
            hint = f0 + f1;
            f0 = f1;
            f1 = hint;
        }
        return arraylist8;
    }
    public static int checkLength(String pass)
    {
        if(pass.length() >= 8)
        {
            return 3;
        } else if (pass.length() <= 5) {
            return 0;
        }
        else
        {
            return 2;
        }
    }
    public static int checkSpecialCharacters(String pass)
    {
        int h = 0;
        for(int i=0;i < pass.length();i++)
        {
            if((pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') ||
            (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') ||
            (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z'))
            {
                h++;
            }
        }
        if(h==pass.length())
            return 0;
        else return 2;
    }
    public static int checkUpperCaseLowerCase(String pass)
    {
        int h1 = 0,h2 = 0;
        for(int i=0;i < pass.length();i++)
        {
            if((pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z'))
            {
                h1++;
            }
            if((pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z'))
            {
                h2++;
            }
        }
        if(h1 > 0 && h2 > 0)
        {
            return 3;
        }
        else return 0;
    }

    public static List<Integer> reverse(ArrayList<Integer> arraylist4)
    {

        return arraylist4.reversed();
    }
}
