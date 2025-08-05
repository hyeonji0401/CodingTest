#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

vector<int> solution(int n, vector<string> words) {
    vector<int> answer; 
    
    for(int i=0; i<words.size(); i++)
    {
        if(i==0) continue;
        auto it = find(words.begin(), words.begin()+i, words[i]);
        if(words[i-1].back() != words[i].front()||it!=words.begin()+i)
        {
            answer.push_back(i%n+1);
            answer.push_back(i/n+1);
            return answer;
        }
       
    }
    answer={0,0};

    return answer;
}