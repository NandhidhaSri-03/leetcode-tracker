// Last updated: 9/19/2026, 5:58:06 PM
1class Solution {
2    public String removeDuplicateLetters(String s) {
3        Deque<Character> stack = new ArrayDeque<>();
4        int [] lastPos = new int [26]; 
5        boolean [] added = new boolean [26]; 
6        for (int i = 0; i < s.length(); i++)
7        {
8            lastPos[s.charAt(i) - 'a'] = i; 
9        }
10        for (int i = 0; i < s.length(); i++)
11        {
12            char c = s.charAt(i);
13            if (added[c - 'a']) continue;
14            while (!stack.isEmpty() && stack.peek() > c && lastPos[stack.peek() - 'a'] > i)
15            {
16                added[stack.peek() - 'a'] = false;
17                stack.pop();
18            }
19            added[c-'a'] = true;
20            stack.push(c);
21        }
22        StringBuilder sb = new StringBuilder();
23        while (!stack.isEmpty())
24        {
25            sb.append(stack.pollLast());
26        }
27        return sb.toString();
28    }
29}