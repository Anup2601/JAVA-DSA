class sortest_path{
    public static void main(String[] args) {
        String str="WNEENESENNN";
        int x1=0,x2=0,y1=0,y2=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='W'){
                x2--;
            }
            else if(str.charAt(i)=='N'){
                y2++;
            }
            else if(str.charAt(i)=='S'){
                y2--;
            }
            else if(str.charAt(i)=='E'){
                x2++;
            }
        }
        int sortest=(int)Math.sqrt((int)Math.pow((x2-x1),2)+(int)Math.pow((y2-y1),2));
        System.out.println(sortest);
    }
}