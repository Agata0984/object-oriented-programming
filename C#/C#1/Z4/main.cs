using System;


class Program
{
    static void Main(string[] args)
    {
        ListaLeniwa ps= new Pierwsze();
        Console.WriteLine(ps.size());
        Console.WriteLine(ps.element(1));
        Console.WriteLine(ps.size());
        Console.WriteLine(ps.element(2));
        Console.WriteLine(ps.size());
        Console.WriteLine(ps.element(3));
        Console.WriteLine(ps.size());
        Console.WriteLine(ps.element(1));
        Console.WriteLine(ps.size());
        Console.WriteLine(ps.element(4));
        Console.WriteLine(ps.size());
        Console.WriteLine(ps.element(2));
        Console.WriteLine(ps.size());
    }
}
