// Last updated: 14/07/2026, 14:43:24
class Solution {
        public int distanceTraveled(int a, int b) {
        return (a + Math.min((a - 1) / 4, b)) * 10;
    }
}