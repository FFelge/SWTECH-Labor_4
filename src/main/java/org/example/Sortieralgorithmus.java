package org.example;

import java.util.Arrays;

public class Sortieralgorithmus {
    public static void abc_new (int [] feld) throws NullPointerException{
        if(feld != null && feld.length != 0)
        {
            int temp;
            do
            {
                temp = feld[0];
                for (int j = 1; j < feld.length; j++)
                {
                    if (feld[j] < feld[j - 1])
                    {
                        temp = feld[j - 1];
                        feld[j - 1] = feld[j];
                        feld[j] = temp;
                    }
                }
            } while (temp != feld[0]);
        }
    }

    public static void abc (int [] feld) throws NullPointerException{
        int temp;
        do
        {
            temp = feld[0];
            for (int j = 1; j < feld.length; j++)
            {
                if (feld[j] < feld[j - 1])
                {
                    temp = feld[j - 1];
                    feld[j - 1] = feld[j];
                    feld[j] = temp;
                }
                System.out.println(Arrays.toString(feld));
                System.out.println("####");
            }
        } while (temp != feld[0]);
    }
}
