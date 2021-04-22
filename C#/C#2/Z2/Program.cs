using System;

namespace zad2
{
    class Program
    {
        static void Main(string[] args)
        {
            Slownik<string, int> s=new Slownik<string, int>();
            s.Add("po", 5);
            Console.WriteLine( s.Take("po"));
            s.Del("po");
            s.Add("Ala", 3);
            s.Add("ma", 1);
            s.Add("kota", 4);
            s.Add("psa", 415);
            Console.WriteLine( s.Take("Ala"));
            Console.WriteLine( s.Take("ma"));
            Console.WriteLine( s.Take("kota"));
            Console.WriteLine( s.Take("Ala"));
            Console.WriteLine( s.Take("ma"));
            Console.WriteLine( s.Take("psa"));
            s.Del("psa");
            Console.WriteLine( s.Take("Ala"));
            Console.WriteLine( s.Take("ma"));
            Console.WriteLine( s.Take("psa"));

        }
    }
}
