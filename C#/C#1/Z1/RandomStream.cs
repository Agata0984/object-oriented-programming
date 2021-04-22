using System;

class RandomStream:IntStream
{
   private Random robert;
   public RandomStream(){
       robert=new Random();
       this.x=robert.Next();
   } 
   public override bool eos(){
       return false;
   }
   public override int next(){
       this.x=robert.Next();
       return this.x;

   }
  
   
}