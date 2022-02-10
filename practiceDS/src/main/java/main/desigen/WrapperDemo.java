package main.desigen;

public class WrapperDemo
{
    public static void main(String args[])
    {
        int i = 1;
        Integer i2 = 1;
        Integer i3 = new Integer(1);
        System.out.println(i == i2);
        System.out.println(i == i3);

        System.out.println(i2.equals(i3));

    }
}
