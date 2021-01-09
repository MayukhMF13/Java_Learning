import java.util.*;
public class Queue
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of element you want in array:");
        int N = in.nextInt();
        int queue[] = new int[N+1];
        int front = -1;
        int rear = -1;
        while (true)
        {
            System.out.println("\n"+"Enter 1 to Push");
            System.out.println("Enter 2 to Pop");
            System.out.println("Enter 3 to display");
            System.out.println("Enter 4 to exit");
            int ch = in.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter value");
                    int value = in.nextInt();
                    if (rear == N - 1)
                    {
                        System.out.println("Overflow");
                    }
                    else if (front == -1 && rear == -1)
                    {
                        front = rear = 0;
                        queue[rear] = value;
                    }
                    else
                        {
                        rear++;
                        queue[rear] = value;
                    }
                    break;
                case 2:
                    if (front == -1 && rear == -1)
                    {
                        System.out.println("Underflow");
                    } else if (front == rear)
                    {
                        front = rear = -1;
                    } else
                        {
                        System.out.println(queue[front]);
                        front++;
                    }
                    break;
                case 3:
                    System.out.println("Till now the elements are");
                    for (int i = 0; i < queue.length-1; i++)
                    {
                        System.out.print(queue[i]+ " ");
                    }
                    break;
                case 4:
                    return;
            }
        }
    }
}
