#include <iostream>
#include <math.h>
#include <vector>
#include <limits>
using namespace std;

bool is_digit(char c)
{
    return(c<='9' && c>='0');
}

int64_t decimal(string znaki)
{
    int64_t n=0, z=1;
    char c;
    if(znaki[0]=='-' && znaki.size()>1)
    {
        z=-1;
    }
    else{
         if(is_digit(znaki[0])==true)
        {
            n*=10;
            n=n+znaki[0]-'0';
        }
        else{throw invalid_argument("is not digit");}}
    for(int64_t i=1; i<znaki.size(); i++)
    {
        c=znaki[i];
        if(is_digit(c)==true)
        {
            if((z==1 && 10*n+c-'0'-INT64_MAX>0) || (z==-1 && 10*n+c-'0'-(INT64_MAX+1)>0))
            {
                throw invalid_argument("out of range");
            }
            n*=10;
            n=n+c-'0';
        }
        else{throw invalid_argument("is not digit");}
    }
    n*=z;
    return n;
}

bool pierwsza(int64_t n)
{
    int64_t l=0, x=sqrt((uint64_t)n);
    for(int64_t i=2; i<=x; i++)
    {
        if(n%i==0)
        {
            l++;
        }
    }
    return(l==0);
}

vector<int64_t> rozklad(int64_t n)
{
    vector<int64_t> r;
    if(n==-1 || n==1 ||n==0)
    {
        r.push_back(n);
        return r;
    }
    if(n<0)
    {
        r.push_back(-1);
    }
    /*if(pierwsza(n))
        {r.push_back(n);
        return r;}*/
            int64_t x=sqrt(abs((double)n));
            for(int64_t j=2; j<=x; j++)
            {
                {while(n%j==0)
                {
                    r.push_back(j);
                    n/=j;
                    if(n==1 || n==-1)
                    {
                        j=x+1;
                    }
                }}
            }
            if(n!=1 && n!=-1)
            {
                r.push_back(n);
            }

    return r;
}

void wypisz_rozklad(int64_t n)
{
    vector<int64_t> r=rozklad(n);
    for(int64_t i=0; i<r.size(); i++)
    {
        cout<<r[i];
        if(i!=r.size()-1)
        {
            cout<<"*";
        }
    }
}

int main(int argc, char *argv[])
{
    string str[argc-1];
    if(argc==1)
    {
        cerr <<"Nalezy podac liczby calkowite jako argumenty wywolania programu, uruchomic go, i zostanie wypisany rozklad podanych liczb na czynniki pierwsze. "<<endl;
    }
    for(int64_t i=1; i<argc; i++)
    {
        str[i-1].assign(argv[i]);
    }
    for(string&a : str)
    {
        try{
        int64_t x=decimal(a);
        cout<<x<<"=";
        wypisz_rozklad(x);
        cout<<endl;}
        catch(const invalid_argument& b)
        {
            cerr<<b.what()<<endl;
        }
    }

    return 0;
}
