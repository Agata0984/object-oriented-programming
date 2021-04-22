using System;

class RandomWordStream
{
   private string lucjan;
    private PrimeStream p;
    private RandomStream r;
   public RandomWordStream(){
       lucjan="";
       p= new PrimeStream();
       r= new RandomStream();
   }
   public string next(){
       int x=p.next(), y=r.next();
       while(lucjan.Length<x){
           lucjan+=Convert.ToChar((y%58)+41);
           y=r.next();
       }
       return lucjan;
   }
   
}