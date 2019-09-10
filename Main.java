public class Main {
    public static void main(String[] args) {

        System.out.println("hej");

        MikroOvn nikolajsOvn = new MikroOvn(); //instansierer et objekt af klassen MikroOvn

        nikolajsOvn.drejeHastighed = -100;
        nikolajsOvn.temperatur = 700;
        nikolajsOvn.ydelse = 300;


        MikroOvn lasseOvn = new MikroOvn();

        lasseOvn.drejeHastighed = 20;
        lasseOvn.temperatur = 150;
        lasseOvn.ydelse = 500;


        System.out.println("Nikolajs own kører med " + nikolajsOvn.drejeHastighed );
        System.out.println("Lasses own kører med " + lasseOvn.drejeHastighed );



        nikolajsOvn.start();








    }
}
