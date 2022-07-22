public final class KeywordFinal {
    final int a = 40;
    final int b = 10;
    final int c = 2;
    final void div(){
        System.out.println("div of two numbers a and b ="+(a/b));
        System.out.println("div of three numbers a,b and c ="+((a/b)/c));
    }
    public static void main(String[] args){
        KeywordFinal division = new KeywordFinal();
        division.div();
    }
}
