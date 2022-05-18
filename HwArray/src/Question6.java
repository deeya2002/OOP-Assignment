public class Question6 {
        public static void main(String[] args) {
            System.out.println(reverseNumber(12345));
        }
        static int reverseNumber(int num){
            int rev=0;
            while(num!=0){
                int rem = num%10;
                rev=rev*10+rem;
                num/=10;
            }
            return rev;
        }
    }

