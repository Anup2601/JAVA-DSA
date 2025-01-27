// to remove duplicates in string
class p12{
    public static void removeDuplicates(String s,int i,StringBuilder sb,boolean[] map){
        if(i==s.length()){
            System.out.println(sb);
            return;
        }
        char currchar=s.charAt(i);
        if(map[currchar-'a']==true){
            removeDuplicates(s, i+1, sb, map);
        }
        else{
            map[currchar-'a']=true;
            removeDuplicates(s, i+1, sb.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String s="aappnnacollage";
        removeDuplicates(s, 0, new StringBuilder (""),new boolean [26]);
    }
}