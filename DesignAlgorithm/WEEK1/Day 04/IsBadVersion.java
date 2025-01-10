// Parent class that simulates the VersionControl API
class VersionControl {
    // The version that is bad (you can change this value to test with different scenarios)
    private int badVersion;

    // Constructor to set the bad version
    public VersionControl(int badVersion) {
        this.badVersion = badVersion;
    }

    // Simulated isBadVersion API
    public boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}

// Solution class to find the first bad version using binary search
public class IsBadVersion extends VersionControl {

 public IsBadVersion(int badVersion) {
        super(badVersion);
    }
    public int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;  // To prevent overflow

            if (isBadVersion(mid)) {
                right = mid;  // If mid is bad, the first bad version is at mid or before mid
            } else {
                left = mid + 1;  // If mid is good, the first bad version is after mid
            }
        }

        return left;  // When left == right, it will be the first bad version
    }

    public static void main(String[] args) {
        // Example 1: n = 5, bad = 4
        int n = 5;
        int badVersion = 4;
        IsBadVersion solution = new IsBadVersion(badVersion);
        System.out.println("First bad version (n=5, bad=4): " + solution.firstBadVersion(n));

        // // Example 2: n = 1, bad = 1
        // n = 1;
        // badVersion = 1;
        // IsBadVersion solution = new IsBadVersion(badVersion);
        // System.out.println("First bad version (n=1, bad=1): " + solution.firstBadVersion(n));
    }
}
