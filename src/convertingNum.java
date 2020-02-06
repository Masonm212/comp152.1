

public class convertingNum {
    public static void main(String[] args){
        String[] data = {"12", "31", "87","35","90","10"};
        var result = Integer.parseInt(data[0]) + Float.parseFloat(data[5]);
        System.out.println(result);
    }
}
