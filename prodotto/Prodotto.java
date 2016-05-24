class Prodotto{
    public static void main(String args[])    {
    
        if (args.length != 2)    {
        System.out.println("Sintassi:");
        System.out.println(" java Prodotto <num1> <num2>");
        return;
        }
    
        try        {
            int num1 = Integer.valueOf(args[0]).intValue();
            int num2 = Integer.valueOf(args[1]).intValue();
            System.out.println(num1*num2);
        }
        catch(Exception e)   {
            System.out.println("Numeri non corretti");
            return;
        }
    }
}