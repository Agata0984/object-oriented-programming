using System;
using System.Collections.Generic;

class Pierwsze:ListaLeniwa
{
    private PrimeStream eudoksja;
    public Pierwsze(){
        pulcheria= new List<int>();
        eudoksja= new PrimeStream();
    }
    public override int size(){
        return pulcheria.Count;
    }
    public override int element(int i){
        while(this.size()<i){
            pulcheria.Add(eudoksja.next());
        }
        return pulcheria[i-1];
    }
    
}
