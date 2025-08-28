class Solution {
    public boolean halvesAreAlike(String s) {
        int cnt1 = 0;
        int cnt2 = 0;
        int mid = s.length() / 2;

        String a = s.substring(0, mid);
        String b = s.substring(mid);

        for (int i = 0; i < a.length(); i++) {
            char ch = Character.toLowerCase(a.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                cnt1++;
            }
        }

        for (int i = 0; i < b.length(); i++) {
            char ch = Character.toLowerCase(b.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                cnt2++;
            }
        }

        return cnt1 == cnt2;
    }
}
