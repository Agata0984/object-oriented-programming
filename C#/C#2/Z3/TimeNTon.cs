using System;

sealed class TimeNTon{
    TimeNTon() {}
    static TimeNTon instance;
    public int id;
    private static int l;
    static TimeNTon[] inst=new TimeNTon[5];
    static TimeNTon ins=new TimeNTon();
    public static TimeNTon Instance(){
	DateTime now = DateTime.Now;
        if(now.Hour>=8 && now.Hour<10){
            if (instance == null) {
                instance = new TimeNTon();
                l=1;
                inst[0]=instance;
                return instance;
            }
            if(l<5){
                instance = new TimeNTon();
                inst[l]=instance;
                l++;
                return instance;
            }
            else{
                l++;
                return inst[(l-1)%5];
            }
        }
        else{
            return ins;
        }
    }
}
