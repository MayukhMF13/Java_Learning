import java.util.Scanner;
public class SwitchCaseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter number of element you want in array:");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        while (true) {
            System.out.println("Press 1 for addition of an element in the existing array.");
            System.out.println("Press 2 for deletion of a selected element");
            System.out.println("Press 3 for rotation of the array by n times:");
            System.out.println("Press 4 for displaying the modified array");
            System.out.println("Enter 5 for exit");
            System.out.println("Enter your choice:");
            int ch = in.nextInt();
            switch (ch) {
                case 1:
                    int pos, x;
                    System.out.println("Enter the position where you want to insert element:");
                    pos = in.nextInt();
                    System.out.println("Enter the element you want to insert:");
                    x = in.nextInt();
                    for (int i = a.length - 1; i > pos - 1; i--) {
                        a[i] = a[i - 1];
                    }
                    a[pos - 1] = x;
                    for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i] + "\t");
                    }
                case 2: {
                    int d, flag = 1, loc = 0;
                    System.out.print("Enter the element you want to delete:");
                    d = in.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (a[i] == d) {
                            flag = 1;
                            loc = i;
                            break;
                        } else {
                            flag = 0;
                        }
                    }
                    if (flag == 1) {
                        for (int i = loc + 1; i < n; i++) {
                            a[i - 1] = a[i];
                        }
                        break;
                    }
                }
                case 3: {
                    System.out.println("Enter the number of rotations:");
                    int NoOfRotations = in.nextInt();
                    for (int i = 0; i < NoOfRotations; i++) {
                        int j, last;
                        last = a[a.length - 1];
                        for (j = a.length - 1; j > 0; j--) {
                            a[j] = a[j - 1];
                        }
                        a[0] = last;
                    }
                    break;
                }
                case 4: {
                    for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i] + " ");
                    }
                }
                case 5:
                {
                    return;
                }
            }
        }
    }
}
