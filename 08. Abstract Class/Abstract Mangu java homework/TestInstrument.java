public class TestInstrument {

    public static void main(String[] args){

        Guitar guitar=new Guitar();
        System.out.println("*****-----*****");
        guitar.play();
        guitar.adjust();
        guitar.compose();
        System.out.println("*****-----*****");

        Instrument violin=new Violin();
        violin.play();
        violin.adjust();
        violin.compose();
        System.out.println("*****-----*****");

        Keyboard keyboard=new Keyboard();
        keyboard.play();
        keyboard.adjust();
        keyboard.compose();
        System.out.println("*****-----*****");

    }



}
