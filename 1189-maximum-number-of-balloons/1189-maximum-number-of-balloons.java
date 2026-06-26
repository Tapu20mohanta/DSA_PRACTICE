class Solution {
    public int maxNumberOfBalloons(String text) {
        int a, b, l, o, n;
        a = b = l = o = n = 0;

        for (char ch : text.toCharArray())
            switch (ch) {
                case 'a' -> a++;
                case 'b' -> b++;
                case 'l' -> l++;
                case 'o' -> o++;
                case 'n' -> n++;
            }

        return Math.min(Math.min(a, Math.min(b, n)), Math.min(l / 2, o / 2));

    }
}