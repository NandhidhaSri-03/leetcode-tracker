// Last updated: 7/9/2026, 9:46:13 AM
class Solution {
    public int numWaterBottles(int nb, int ne) {
      int total =nb;
      int empty = nb;
      while(empty >= ne){
        int newBottle= empty/ne;
        empty = empty%ne+newBottle;
        total += newBottle;
      }
      return total;
    }
}