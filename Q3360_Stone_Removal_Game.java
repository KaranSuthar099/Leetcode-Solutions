class Q3360_Stone_Removal_Game {

    public boolean canAliceWin(int n) {
        int removeCount = 10;
        int counter = 0;
        while (n >= 0){
            n -= removeCount--;
            counter++;
        }

        if(counter % 2 == 0) return true;
        return false;
    }
}
