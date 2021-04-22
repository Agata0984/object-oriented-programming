using System;

class IntStream
{
    protected int x;
    public IntStream(){
        this.x=0;
    }
    public virtual int next(){
        this.x+=1;
        return this.x-1;
    }
    public virtual bool eos(){
        return(this.x==int.MaxValue);
    }
    public virtual void reset(){
        this.x=0;
    }
}