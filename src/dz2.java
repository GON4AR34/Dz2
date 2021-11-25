public class dz2 {

    public static void main(String[] args ){
    }
    public static boolean firstMethod(int a, int b){
        return (a+b>=10 && a+b<=20);
    }

    public static void secondMethod (int a){
        if (a>=0){
            System.out.println("Число положительное");
        }
        else{
            System.out.println("Число отрицательное");
        }

    }
    public static boolean thirdMethod (int a){
        return (a<0);
    }
    public static void fourthMethod (String text, int a){
        for (int i = 1; i <= a; i++){
            System.out.println(text);
        }

    }
    public static boolean lastMethod (int a) {
        return  ((a % 4 == 0)|| (a % 100 != 0)) && (a % 400 == 0);
    }
}


