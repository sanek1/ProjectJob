public class Program {
    public static void main(String[] args) {
        String s1 = "1;2;3;4;5;6;7;8;9;10";

        WorkData data = new WorkData();

        int[] result = data.SortString(s1);
        for(int arr: result)
            System.out.println(arr);
    }
}
