/*
// Sample code to perform I/O:

cin >> name;                            // Reading input from STDIN
cout << "Hi, " << name << ".\n";        // Writing output to STDOUT

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
*/

// Write your code here
#include <iostream>
using namespace std;

int main()
{
int t;
cin>>t;
while(t--){

long long a,b,ans;
cin>>a>>b;
if(b%2==0)
ans=b-2;
else
ans=b-1;
if(ans>=a)
cout<<ans<<endl;
else
{
ans=a&b;
cout<<ans<<endl;
}

}
}