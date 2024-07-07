class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
            
        int floor = -1;
        int ceil = -1;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) {
                if (floor == -1 || arr[i] > floor) {
                    floor = arr[i];
                }
            }
            if (arr[i] >= x) {
                if (ceil == -1 || arr[i] < ceil) {
                    ceil = arr[i];
                }
            }
        }
        
        return new Pair(floor, ceil);
    }
}
