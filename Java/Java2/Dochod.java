import java.util.*;
import java.io.*;

public class Dochod implements java.io.Serializable {
    public String kategoria;
    public float kwota;
    static final long serialVersionUID = 6L;
    public Dochod(String kat, float kwot){
        kategoria = kat;
        kwota = kwot;
    } 
  
}