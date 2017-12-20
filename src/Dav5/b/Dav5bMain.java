package Dav5.b;

public class Dav5bMain {
    public boolean BmwXar(Manqana a)
    {
        return a.RaFirmaXar().equals("BMW");
    }
    public static void main(String[] args) {
        BMW a = new BMW();
        Mersedesi b = new Mersedesi();
        Dav5bMain c = new Dav5bMain();

        System.out.println(c.BmwXar(a) + " a");
        System.out.println(c.BmwXar(b) + " b");
    }
}
