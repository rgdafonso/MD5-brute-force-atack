package hashbreak;


public class Processador3 {

    MD5 g = new MD5();
    String hashs3[] = {"47bce5c74f589f4867dbd57e9ca9f808", "334b72d95b4fdb8e64b21fc90b5610ca", "4752d51bd71f704beec34b798c76ca9e", "b706835de79a2b4e80506f582af3676a"};
    char alfabeto[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w', 'v', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'W', 'V', 'X', 'Y', 'Z', '!', '@', '#', '$', '%', '&', '*', '(', ')', '_', '-', '+', '=', '[', ']', '{', '}', '?', '/', '\\', '|', '>', '<', '.', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    char alfMin[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w', 'v', 'x', 'y', 'z'};

    public String Nucleo1() {

        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < 20; k++) {
                    String senha = g.gerarMD5("" + alfabeto[i] + alfabeto[j] + alfabeto[k]);
                    for (int n = 0; n < hashs3.length; n++) {
                        if (senha.equals(hashs3[n])) {
                            long time2 = System.currentTimeMillis();
                            System.out.println("senha quebrada: '" + alfabeto[i] + alfabeto[j] + alfabeto[k] + "'");
                            System.out.println("hash: '" + senha + "'");
                            System.out.println("tempo: " + ((time1 - time2)) + "ms \n");
                        }
                    }
                }
            }
        }
        return "1";
    }

    public String Nucleo2() {

        long time1 = System.currentTimeMillis();
        for (int i = 20; i < 40; i++) {
            for (int j = 20; j < 40; j++) {
                for (int k = 20; k < 40; k++) {
                    String senha = g.gerarMD5("" + alfabeto[i] + alfabeto[j] + alfabeto[k]);
                    for (int n = 0; n < hashs3.length; n++) {
                        if (senha.equals(hashs3[n])) {
                            long time2 = System.currentTimeMillis();
                            System.out.println("senha quebrada: '" + alfabeto[i] + alfabeto[j] + alfabeto[k] + "'");
                            System.out.println("hash: '" + senha + "'");
                            System.out.println("tempo: " + ((time1 - time2)) + "ms \n");
                        }
                    }
                }
            }
        }
        return "2";
    }

    public String Nucleo3() {

        long time1 = System.currentTimeMillis();
        for (int i = 40; i < 60; i++) {
            for (int j = 40; j < 60; j++) {
                for (int k = 40; k < 60; k++) {
                    String senha = g.gerarMD5("" + alfabeto[i] + alfabeto[j] + alfabeto[k]);
                    for (int n = 0; n < hashs3.length; n++) {
                        if (senha.equals(hashs3[n])) {
                            long time2 = System.currentTimeMillis();
                            System.out.println("senha quebrada: '" + alfabeto[i] + alfabeto[j] + alfabeto[k] + "'");
                            System.out.println("hash: '" + senha + "'");
                            System.out.println("tempo: " + ((time1 - time2)) + "ms \n");
                        }
                    }
                }
            }
        }
        return "3";
    }

    public String Nucleo4() {

        long time1 = System.currentTimeMillis();
        for (int i = 60; i < alfabeto.length; i++) {
            for (int j = 60; j < alfabeto.length; j++) {
                for (int k = 60; k < alfabeto.length; k++) {
                    String senha = g.gerarMD5("" + alfabeto[i] + alfabeto[j] + alfabeto[k]);
                    for (int n = 0; n < hashs3.length; n++) {
                        if (senha.equals(hashs3[n])) {
                            long time2 = System.currentTimeMillis();
                            System.out.println("senha quebrada: '" + alfabeto[i] + alfabeto[j] + alfabeto[k] + "'");
                            System.out.println("hash: '" + senha + "'");
                            System.out.println("tempo: " + ((time1 - time2)) + "ms \n");
                        }
                    }
                }
            }
        }
        return "4";
    }
}