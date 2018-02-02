import static org.junit.Assert.*;

public class WorkDataTest {

    @org.junit.Test
    public void sortString() {
        WorkData data = new WorkData();

        int[] actual = data.SortString("1;2;3;4;5;6;7;8;9;10");
        int[] expected = new int[]{2,4,6,8,10};

        int[] actual2 = data.SortString("1;2;3;4;5;6;7;8;9;10");
        int[] expected2 = new int[]{2,4,6,8,10};


        assertArrayEquals(expected,actual);
        assertArrayEquals(expected2,actual2);

    }
}