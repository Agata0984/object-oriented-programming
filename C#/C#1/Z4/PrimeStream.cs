using System;

class PrimeStream:IntStream
{
   public PrimeStream(){
       this.x=1;
   } 
   private bool prime(int n){
       int x=2;
       while(x<=n/2)
       {if(n%x==0){return false;}
       x++;}
       return true;
   }
   public override bool eos(){
       return(this.x==2147483647);
   }
   public override int next(){
       this.x+=1;
       while(prime(this.x)==false){
           this.x+=1;
       }
       return this.x;

   }
  
   
}
