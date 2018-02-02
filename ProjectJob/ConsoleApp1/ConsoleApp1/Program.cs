using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    public class TestJobClass
    {
        static void Main(string[] args)
        {
            string s1 = "1;2;3;4;5;6;7;8;9;10;11;12";
            DataTest dt = new DataTest();
            Console.WriteLine(string.Join(",", dt.SortString(s1)));
        }

        
    }
}
