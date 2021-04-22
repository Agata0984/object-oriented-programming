using System;

class Slownik<k, v> where k: IComparable <k>{
    public Slownik<k, v> next;
    protected v  val;
    protected k key;
    protected Slownik(k key, v val){
        this.val=val;
        this.key=key;
        this.next=null;
    }
    public Slownik(){
        this.val=default(v);
        this.key=default(k);
        this.next=null;
    }
    public void Add(k key,v  val) {
        if(key.CompareTo(this.key)==0) {Console.WriteLine("nieprawidlowy klucz");}
        else{
            if (this.next != null) this.next.Add(key,val);
            else 
            {this.next = new Slownik<k, v>(key, val);}
        }
    }
    public void Del(k key){
        if(key.CompareTo(this.next.key)==0 && this.next.next==null)
        {this.next=null;}
        else{
        if (key.CompareTo(this.key)==0) {
            if(this.next != null) {
                this.key=this.next.key;
                this.val=this.next.val;
                this.next=this.next.next;}
        }
        if (this.next != null) {
            this.next.Del(key);
        }}
    }
    public v Take(k key){
        if (key.CompareTo(this.key)==0) {
            return this.val;
        }
        if (this.next != null) {
            return this.next.Take(key);
        }
        return default(v);
            
    }
}