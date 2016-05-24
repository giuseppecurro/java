public  class Geo extends Cerchio{

    
    public double circonferenza() {
    System.out.println("Classe Geo, circonf:  ");
	return 2 * Math.PI * r;
    }


    
    public static void main(String[]args){
        Geo g = new Geo();
        g.set(5);
        System.out.println(g.area());
        System.out.println(g.circonferenza());
        
        
        
    }

}
