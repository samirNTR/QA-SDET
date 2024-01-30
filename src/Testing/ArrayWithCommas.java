package Testing;

public class ArrayWithCommas {
    public static void main(String[] args) {
        int a[] = {1, 0, 0, 1, 0, 1};

        boolean commaNeeded = false;

        for (int i : a) 
        {
            if (i == 0) 
            {
                if (commaNeeded) 
                {
                    System.out.print(",");
                }
                System.out.print("0");
                commaNeeded = true;
            }
        }

        for (int i : a) 
        {
            if (i == 1) 
            {
                if (commaNeeded) 
                {
                    System.out.print(",");
                }
                System.out.print("1");
                commaNeeded = true;
            }
        }
    }
}

