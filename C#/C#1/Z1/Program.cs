using System;


class Program
{
    static void Main(string[] args)
    {
        RandomStream ps = new RandomStream();
        Console.WriteLine(ps.next());
        Console.WriteLine(ps.next());
        Console.WriteLine(ps.next());
        RandomWordStream rws = new RandomWordStream();
        Console.WriteLine(rws.next());
        Console.WriteLine(rws.next());
        Console.WriteLine(rws.next());
    }
}

