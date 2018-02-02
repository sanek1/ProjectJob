using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ConsoleApp1;

namespace UnitTestProject1
{
    [TestClass]
    public class ProgramTest
    {
        [TestMethod]
        public void SortString()
        {
            string s1 = "1;2;3;4;5;6;7;8;9;10;11;12";
            int[] s1Result = new int[] { 2, 4, 6, 8, 10, 12 };

            string s2 = "34;45;52352;323;32";
            int[] s2Result = new int[] { 34, 52352, 32 };

            DataTest test = new DataTest();

            int[] s1Actual = test.SortString(s1);
            int[] s2Actual = test.SortString(s2);

            CollectionAssert.AreEqual(s1Result,s1Actual);
            CollectionAssert.AreEqual(s2Result, s2Actual);

        }
    }
}
