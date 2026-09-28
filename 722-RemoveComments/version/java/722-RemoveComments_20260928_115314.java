// Last updated: 9/28/2026, 11:53:14 AM
1class Solution {
2    
3    boolean isCommentBegan=false;
4    String lineBeforeComm="";
5    public List<String> removeComments(String[] source) {
6        List<String> res=new ArrayList();
7        for(String line:source){
8            line=helper(line);
9            if(line!=null){
10                res.add(line);
11            }
12        }
13        return res;
14    }
15    
16    private String helper(String line){
17        if(line.length()==0){
18            return null;
19        }
20        if(isCommentBegan){
21            int index=line.indexOf("*/");
22            if(index<0){
23                return null;
24            }
25            isCommentBegan=false;
26            StringBuilder sb=new StringBuilder();
27            sb.append(lineBeforeComm);
28            sb.append(line.substring(index+2,line.length()));
29            line=sb.toString();
30        }else if(!isCommentBegan){
31            int index1=line.indexOf("//");
32            int index2=line.indexOf("/*");
33            if(index1>=0 && (index2<0 || index1<index2) ){
34                line=line.substring(0,index1);
35            }else{
36                if(index2<0){
37                    return line;
38                }
39                isCommentBegan=true;
40                lineBeforeComm=line.substring(0,index2);
41                line=line.substring(index2+2,line.length());
42            }
43        }
44        return helper(line);
45    }
46}