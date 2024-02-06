public class breakstatement {
    public static void main(String[] args) {
        int a = 5;
        for(int i=0; i<=a; i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Now I am out of this loop");
    }
}
