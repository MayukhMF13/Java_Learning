import java.util.Scanner;
public class Stack {
    public static void main(String[] ar) {
        Scanner in = new Scanner(System.in);
        int top = -1, topcopy = 0;
        System.out.println("Enter the number of elements you want in your array:");
        int n = in.nextInt();
        int stack[] = new int[n+1];
        while (true) {
            System.out.println("\n"+"Enter 1 to Push:");
            System.out.println("Enter 2 to Pop:");
            System.out.println("Enter 3 to display the array");
            System.out.println("Enter 4 to exit");
            System.out.println("Enter your choice");
            int ch = in.nextInt();
            if(ch==1)
            {
                topcopy++;
            }
            switch (ch) {
                case 1:
                    System.out.println("Enter value");
                    int value = in.nextInt();
                    if (top == n - 1) {
                        System.out.println("Overflow");
                    }
                    else {
                        top = top + 1;
                        stack[top] = value;
                    }
                    break;
                case 2:
                    int item;
                    if (top == -1) {
                        System.out.println("Underflow");
                    } else {
                        item = stack[top];
                        top--;
                        System.out.println(item);
                    }
                    break;
                case 3:
                    for (int i = 0; i < topcopy; i++) {
                        System.out.print(stack[i] + " ");
                    }
                    break;
                case 4: {
                    return;
                }
            }
        }
    }
}
