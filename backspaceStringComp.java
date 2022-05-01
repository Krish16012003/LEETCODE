public class backspaceStringComp {


        public boolean  backspaceCompare(String s, String t) {
            int i = 0;
            while (i < s.length()) {
    
                if (s.charAt(i) != '#') {
                    i++;
                } else {
                    if (i == 0) {
                        s = s.substring(i + 1);
                    } else {
                        String p= s.substring(0,i - 1);
    
                        String p1 = "";
                        if (i + 1 < s.length()) p1 = s.substring(i + 1);
                        s = p + p1;
                        i = p.length();
                    }
                }
            }
            i=0;
    
            while (i < t.length()) {
    
                if (t.charAt(i) != '#') {
                    i++;
                } else {
                    if (i == 0) {
                        t = t.substring(i + 1);
                    } else {
                        String p = t.substring(0,i - 1);
    
                        String p1 = "";
                        if (i + 1 < t.length()) p1 = t.substring(i + 1);
                        t = p + p1;
                        i = p.length();
                    }
                }
            }
            return s.equals(t);
    
    
        }
    }
    

