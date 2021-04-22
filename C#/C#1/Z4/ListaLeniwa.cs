using System;
using System.Collections.Generic;

class ListaLeniwa
{
    protected List<int> pulcheria;
    private IntStream eudoksja;
    public ListaLeniwa(){
        pulcheria= new List<int>();
        eudoksja= new IntStream();
    }
    public virtual int size(){
        return pulcheria.Count;
    }
    public virtual int element(int i){
        while(this.size()<i){
            pulcheria.Add(eudoksja.next());
        }
        return pulcheria[i-1];
    }
    
}
