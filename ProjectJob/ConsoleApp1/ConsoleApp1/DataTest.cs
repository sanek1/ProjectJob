using System;
using System.Linq;

namespace ConsoleApp1
{
    public class DataTest
    {
        public int[] SortString(string value)
        {
            int[] arr = value.Split(';').Select(n => Convert.ToInt32(n)).ToArray();
            arr = arr.Where(val => val % 2 == 0).ToArray();
            return arr;
        }
    }
}
