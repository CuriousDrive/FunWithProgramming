﻿using System;

namespace Printing100000
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime startTime = DateTime.Now;
            for (int i = 0; i < 100000; i++)
            {
                Console.WriteLine("Hello World!");
            }
            DateTime endTime = DateTime.Now;
            Console.WriteLine("C# took => " + (endTime - startTime).Seconds + " seconds");
        }
    }
}