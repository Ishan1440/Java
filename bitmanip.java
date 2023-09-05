public class bitmanip {
    public static int dec(int n){
        int ans = 0;
        int pow = 0;
        while(n>0){
            int remainder = n%10;
            ans += remainder*(int)Math.pow(2,pow++);
            n/=10;
        }
        return ans;
    }
    public static int bin(int n){
        int ans = 0;
        int pow = 0;
        while(n>0){
            int remainder = n%2;
            ans += remainder*(int)Math.pow(10,pow++);
            n/=2;
        }
        return ans;
    }

    // Fast Exponentiation 
    public static int FastExp(int a, int n){
        int ans = 1;
        while(n>0){
            if((n&1)==1) ans*=a;
            a*=a;
            n>>=1;
        }
        return ans;
    }

    private static int GetBit(int n, int i){
        int BitMask = 1<<i;
        if((n&BitMask)==0) return 0;
        else return 1;
    }

    private static int SetBit(int n, int i){
        // System.out.print("Setting "+i+"th bit of "+n+" we get = ");
        int BitMask = 1<<i;
        return n|BitMask;
    }

    private static int ClearBit(int n, int i){
        int BitMask = ~(1<<i);
        return n&BitMask;
    }

    private static int UpdateBit(int n, int i, int newBit){
        if(newBit==0) return ClearBit(n,i);
        else return SetBit(n, i);
    }

    private static int UpdateBit2(int n, int i, int newBit){
        n = ClearBit(n, i);
        int BitMask = newBit<<i;
        return n|BitMask;
    }

    private static int ClearBits(int n, int bits){
        int BitMask = -1<<bits;
        return n&BitMask;
    }

    private static int ClearBits(int n, int i, int j){
        int a = -1<<(j+1); int b = (1<<i)-1;
        int BitMask = a|b;
        return n&BitMask;
    }

    private static void O_or_E(int n){
        int BitMask = 1;
        if((n&BitMask)==1) System.out.println(n+" is odd");
        else System.out.println(n+" is eve");
    }
    public static void main(String args[]){
        // byte b = ~5;
        // System.out.println(b);

        //Question 1 - Odd or Eve?
        // int a[] = {0,1,2};
        // for(int i=0; i<a.length; i++) O_or_E(a[i]);

        // Get ith Bit
        /* int limit = 16;
        int n = 0;
        while (n<limit){
            int N = (n!=0)?(int)(Math.log(n)/Math.log(2)):0;
            System.out.println(bin(n));
            for(int i=N; i>=0; i--){
                System.out.print(GetBit(n,i)+"");
            }
            System.out.println("\n");
            n++;
        } */

        // Set ith Bit
        // int n = 10;
        // System.out.println(SetBit(n, 0));
        // System.out.println(SetBit(n, 2));

        // Clear ith Bit
        // -1 = ~0
        // int n = 14;
        // System.out.println(ClearBit(n,1));
        // System.out.println(ClearBit(n,2));

        // Update ith Bit
        // int n = 14;
        // int new_n = UpdateBit(14, 2, 0);
        // System.out.println(new_n);
        // System.out.println(UpdateBit(new_n, 2, 1));

        // Clear Last i bits
        // System.out.println(ClearBits(15, 2));

        // Clear Bits in range (inclusive)
        // n = 100111010011, i=2, j=7 => n = 100100000011
        // int n = dec(1001110101); System.out.println(n);
        // System.out.println(ClearBits(n, 2, 6));

        // Fast Exponentiation a^n
        // System.out.println(FastExp(3,5));
        
    }
}
