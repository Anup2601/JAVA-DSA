// class convertToUppercase{
//     public static void main(String[] args) {
//         StringBuilder sb=new StringBuilder();
//         String s="hi my name is anup";
//         char c=Character.toUpperCase(s.charAt(0));
//         sb.append(c);
//         for (int i = 1; i < s.length(); i++) {
//             if(s.charAt(i)==' '&& i<s.length()-1){
//                 sb.append(s.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(s.charAt(i)));
//             }
//             else sb.append(s.charAt(i));
//         }
//         System.out.println(sb);
//     }
// }
class convertToUppercase{
    public static void main(String[] args) {
        String s="hi my name is anup";
        StringBuilder sb=new StringBuilder();
        char c=Character.toUpperCase(s.charAt(0));
        sb.append(c);
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)==' ' && i<s.length()-1){
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}