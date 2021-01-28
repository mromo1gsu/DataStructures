#include <iostream>
using namespace std;

int recursiveFibonacci(int k){
    if ( k < 0 ) {
		return -1;
	} 
	else if ( k == 0 || k==1 ) {
		return 1;
	}
	else {
		return recursiveFibonacci(k-1) + recursiveFibonacci(k-2);
	}
}

int iterativeFibonacci( int k ) {
	if ( k < 0) {
		return -1;
	}
	else if ( k == 0 || k==1 ) {
		return 1;
	}
	else {
		int previousNumber = 0;
		int nextNumber = 1;
		
        for (int i = 1; i <= k; i++) {
		int sum = previousNumber + nextNumber;
		previousNumber = nextNumber;
		nextNumber = sum;
	    }
	
    return nextNumber;
	}
}

int main()
{
    int N = 10;
    cout<<"number for fibonacci sequence: ";
    cin >> N;
    cout<< "\nseries:";
    cout << recursiveFibonacci(N) << endl;
    cout << iterativeFibonacci(N) << endl;
    return 0;
}