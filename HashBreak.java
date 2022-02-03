package hashbreak;

/**
 *
 * @author Roger
 */
public class HashBreak {

    public static void main(String[] args) {
        Processador4 p = new Processador4();

        new Thread(p.Nucleo1());
        new Thread(p.Nucleo2());
        new Thread(p.Nucleo3());
        new Thread(p.Nucleo4());
    }
}
