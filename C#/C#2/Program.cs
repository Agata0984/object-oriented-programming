using System;

namespace zad3
{
    class Program
    {
        static void Main(string[] args)
        {
            TimeNTon a = TimeNTon.Instance();
		a.id=1;
	    Console.WriteLine(a.id);
	    TimeNTon b = TimeNTon.Instance();
		b.id=2;
	    Console.WriteLine(b.id);
	    TimeNTon c = TimeNTon.Instance();
		c.id=3;
	    Console.WriteLine(c.id);
	    TimeNTon d = TimeNTon.Instance();
		d.id=4;
	    Console.WriteLine(d.id);
	    TimeNTon e = TimeNTon.Instance();
		e.id=5;
	    Console.WriteLine(e.id);
	    TimeNTon f = TimeNTon.Instance();
	    Console.WriteLine(f.id);
	    TimeNTon g = TimeNTon.Instance();
	    Console.WriteLine(g.id);
	    TimeNTon h = TimeNTon.Instance();
	    Console.WriteLine(h.id);
        }
    }
}
