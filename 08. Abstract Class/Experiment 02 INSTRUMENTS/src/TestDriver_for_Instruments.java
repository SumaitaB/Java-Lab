public class TestDriver_for_Instruments
{
    public static void main(String[] args){

        Guitar guitar=new Guitar();
        System.out.println("============================================================================================================================================");

        guitar.play();
        guitar.adjust();
        guitar.compose();


        Instrument violin=new Violin();
        violin.play();
        violin.adjust();
        violin.compose();


        Keyboard keyboard=new Keyboard();
        keyboard.play();
        keyboard.adjust();
        keyboard.compose();

        System.out.println("============================================================================================================================================");

    }



}