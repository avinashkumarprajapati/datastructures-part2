package com.avinashkumarprajapati.datastructure.challenges;




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;
/*
For a more generic "in between two numbers" use:

Random r = new Random();
int Low = 10;
int High = 100;
int Result = r.nextInt(High-Low) + Low;
*/

class HOney1 {
    public static void main(String args[] ) throws Exception 
    {
      //TestClass tc=new TestClass();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
		StringTokenizer tk1 = new StringTokenizer(br.readLine());  
	BigInteger x = new BigInteger(tk1.nextToken());
		BigInteger y = new BigInteger(tk1.nextToken());
                BigInteger z = new BigInteger(tk1.nextToken());
BigInteger bi3= new BigInteger("3");
BigInteger t1=x.divide(bi3);
 BigInteger _t1=x.mod(bi3);
 BigInteger p1=y.divide(bi3);
 BigInteger _p1=y.mod(bi3);;
 BigInteger q1=z.divide(bi3);
 BigInteger _q1=z.mod(bi3);
 BigInteger sumRem=_t1.add(_p1).add(_q1);
 //BigInteger sumRem=_t1+_p1+_q1;
 BigInteger r1=sumRem.divide(bi3);
		 BigInteger resultFinal=t1.add(p1).add(q1).add(r1);
		System.out.println(resultFinal);
      
        

        
    }

}
