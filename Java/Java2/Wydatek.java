import java.util.*;
import java.io.*;

public class Wydatek implements java.io.Serializable {
    public String kategoria;
    public float kwota;
    static final long serialVersionUID = 5L;
    public Wydatek(String kat, float kwot){
        kategoria = kat;
        kwota = kwot;
    } 
  
}