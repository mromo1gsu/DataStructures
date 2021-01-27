#include <iostream>
using namespace std;

int main()
{
    int year = 2000;

    if (year % 400 == 0)
    {
        cout << "True";
    }
    else if(year % 4 == 0 && year % 100 == 0)
    {
        cout << "True";
    }
    else
    {
        cout << "False";
    }
}