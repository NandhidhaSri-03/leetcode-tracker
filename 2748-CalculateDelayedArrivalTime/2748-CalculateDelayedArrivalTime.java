// Last updated: 7/9/2026, 9:45:52 AM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
        
    }
}