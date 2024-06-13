public class Q2579_Count_Total_Number_of_Colored_Cells {

    public long coloredCells(int n) {
        return n + --n + 2 * ((long)n * (long)(n));
    }

}
