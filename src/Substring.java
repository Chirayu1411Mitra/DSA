public class Substring {

    public static void main(String[] args) {
        String num = "33345777";
        int start =0;
        int length=3;
        int end = start+length;
        String largest="";
     //   if(end<=num.length()) {
            while (end <= num.length()) {
                String result = num.substring(start, end);
                boolean same = (result.charAt(0)==result.charAt(1)) &&(result.charAt(1)==result.charAt(2));
                if(same){
                  if(result.compareTo(largest)>0){
                      largest=result;
                  }

                }
                start++;
                end++;
            }
        System.out.println(largest);
   }
        }


